/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author esic
 */
public class Objectif {
    private int id;
    private Date debut;
    private String duree;
    private String type;
    private int poids;
    private Time temps;
    private int idUtilisateur;

    public Objectif() {
    }

    public Objectif(int id, Date Debut, String Duree, String type, Time temps, int idUtilisateur) {
        this.id = id;
        this.debut = Debut;
        this.duree = Duree;
        this.type = type;
        this.temps = temps;
        this.idUtilisateur = idUtilisateur;
    }

    public Objectif(int id, Date Debut, String Duree, String type, int Poids, int idUtilisateur) {
        this.id = id;
        this.debut = Debut;
        this.duree = Duree;
        this.type = type;
        this.poids = Poids;
        this.idUtilisateur = idUtilisateur;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date Debut) {
        this.debut = Debut;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String Duree) {
        this.duree = Duree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoids(){
        return poids;
    }

    public void setPoids(int Poids) {
        this.poids = Poids;
    }

    public Time getTemps() {
        return temps;
    }

    public void setTemps(Time temps) {
        this.temps = temps;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    
    
}
