/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;


import fr.solutec.model.Poids;
import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esic
 */
public class PoidsDao {
    public static List<Poids> getALLfromUser(User u) throws SQLException{
            List<Poids> result = new ArrayList<>();
            
            String sql = "SELECT * FROM poids WHERE utilisateurs_idUtilisateurs= ? ORDER BY ?";
            
            Connection connexion = AccessDao.getConnection();
    
            PreparedStatement requette = connexion.prepareStatement(sql);
            requette.setString(1, Integer.toString(u.getId()));
            requette.setString(2, "Date");

            
            ResultSet rs = requette.executeQuery(sql);
            
            while (rs.next()){
                Poids p = new Poids();
                p.setId(rs.getInt("idPoids"));
                p.setPoids(rs.getInt("Poids"));
                p.setDate(rs.getDate("Date"));
                p.setIdUtilisateur(rs.getInt("utilisateurs_idUtilisateurs"));
   
                result.add(p);
            }
            
            return result;
        }
}
