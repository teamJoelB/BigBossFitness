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
    
    String sql = "SELECT * FROM utilisateurs WHERE login=? AND mdp =?";
    
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
        result.setDate(rs.getTimestamp("DateDer"));

 
     }

    
    return result;
}
    
    public static void insert (User person) throws SQLException {
    String sql = "INSERT INTO utilisateurs ( Nom, Prenom, mail, Login, Mdp, Age, Taille, DateDer, Sexe) VALUES ( ?, ?, ?, ?, ?, ?, ?,?,)";
    
    Connection connexion = AccessDao.getConnection();
    
    PreparedStatement ordre = connexion.prepareStatement(sql);
    ordre.setString(1, person.getNom()  );
    ordre.setString(2, person.getPrenom()  );
    ordre.setString(3, person.getMail());
    ordre.setString(4, person.getLogin());
    ordre.setString(5, person.getMdp()  );
    ordre.setInt(6, person.getAge());
    ordre.setInt(7, person.getTaille());
    ordre.setTimestamp(8, person.getDate());
    ordre.setString(9, person.getSexe());
    
    ordre.execute();
}

}