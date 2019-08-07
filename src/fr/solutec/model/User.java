/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;

/**
 *
 * @author esic
 */
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String login;
    private String mdp;
    private int age;
    private int taille;
    private String sexe;
    private Date date;

    public User() {
    }

    public User(int id, String nom, String prenom, String mail, String login, String mdp, int age, int taille, String sexe, Date date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.login = login;
        this.mdp = mdp;
        this.age = age;
        this.taille = taille;
        this.sexe = sexe;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", login=" + login + ", mdp=" + mdp + ", age=" + age + ", taille=" + taille + ", sexe=" + sexe + ", date=" + date + '}';
    }




    
    
    
}
