/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author esic
 */
public class UserDao {
    public static User getByLoginPass (String login, String mdp) throws SQLException{
    User result = null;
    
    String sql = "SELECT * FROM personne WHERE login=? AND mdp =?";
    
    Connection connexion = AccessDao.getConnection();
    
    PreparedStatement requette = connexion.prepareStatement(sql);
    requette.setString(1, login);
    requette.setString(2, mdp);
    
    ResultSet rs = requette.executeQuery();
    

    
    if (rs.next()) {
        result = new User( );
        result.setId(rs.getInt("idUtilisateurs"));
        result.setNom(rs.getString("Nom"));
        result.setPrenom(rs.getString("Prenom"));
        result.setMail(rs.getString("mail"));
        result.setLogin(rs.getString("Login"));  
        result.setAge(rs.getInt("Age"));
        result.setTaille(rs.getInt("Taille"));
        result.setSexe(rs.getString("Sexe"));  
        result.setDate(rs.getDate("DateDer"));  

 
     }

    
    return result;
}
    
}