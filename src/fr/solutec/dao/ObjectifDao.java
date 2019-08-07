/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Objectif;
import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esic
 */
public class ObjectifDao {
    
    public static List<Objectif> getALLfromUser(User u) throws SQLException{
            List<Objectif> result = new ArrayList<>();
            
            String sql = "SELECT * FROM objectif WHERE utilisateurs_idUtilisateurs= ? ORDER BY ?";
            
            Connection connexion = AccessDao.getConnection();
    
            PreparedStatement requette = connexion.prepareStatement(sql);
            requette.setString(1, Integer.toString(u.getId()));
            requette.setString(2, "Date");

            
            ResultSet rs = requette.executeQuery(sql);
            
            while (rs.next()){
                Objectif o = new Objectif();
                o.setId(rs.getInt("idObjectif"));
                o.setDebut(rs.getDate("Debut"));
                o.setDuree(rs.getString("Duree"));
                o.setType(rs.getString("Type"));
                o.setPoids(rs.getInt("Poids"));
                o.setTemps(rs.getTime("Temps"));
                o.setIdUtilisateur(rs.getInt("utilisateurs_idUtilisateurs"));

                
                result.add(o);
            }
            
            return result;
        }
    
}
