/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author esic
 */
public class Poids {
  private int id;
  private int poids;
  private Date date;
  private int idUtilisateur;

    public Poids() {
    }

    public Poids(int id, int poids, Date date, int idUtilisateur) {
        this.id = id;
        this.poids = poids;
        this.date = date;
        this.idUtilisateur = idUtilisateur;
    }
  
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
  
  
}
