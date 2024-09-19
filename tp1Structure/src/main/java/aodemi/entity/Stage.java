package aodemi.entity;

import java.util.*;

import aodemi.entity.*;

public class Stage {

    public List<Etudiant> stagiaires;


    private static int ID = 0;
    private int idStage;
    private String departement;
    private String description;
    private String entreprise;
    private byte session;
    private double tauxHoraire;
    private int duree;

    public Stage() {
        this.idStage = ++ID;
        this.stagiaires = new ArrayList<>();
    }

    public String getDepartement() {return departement;}

    public void setDepartement(String departement) {this.departement = departement;}

    public List<Etudiant> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Etudiant> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public int getIdStage() {
        return idStage;
    }

    public void setIdStage(int id) {
        this.idStage = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public byte getSession() {
        return session;
    }

    public void setSession(byte session) {
        this.session = session;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return idStage + " | " + entreprise + " | " + departement;
    }
}
