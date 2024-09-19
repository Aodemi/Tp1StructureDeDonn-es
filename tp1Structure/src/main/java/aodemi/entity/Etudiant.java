package aodemi.entity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Etudiant {
    private static int ID = 0;
    private int idEtudiant;
    private String prenom;
    private String nom;
    private String departement;
    private boolean enStage;
    public List<Stage> stages;


    public Etudiant() {
        this.idEtudiant = ++ID;
        this.enStage = false;
        this.stages = new ArrayList<>();
    }

    public Etudiant(String prenom, String nom, String departement) {
        this.idEtudiant = ++ID;
        this.prenom = prenom;
        this.nom = nom;
        this.departement = departement;
        this.enStage = false;
        this.stages = new ArrayList<>();
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setIdEtudiant(int id) {
        this.idEtudiant = id;
    }

    public boolean isEnStage() {
        return enStage;
    }

    public void setEnStage(boolean enStage) {
        this.enStage = enStage;
    }

    public List<Stage> getStage() {
        return stages;
    }

    public void setStage(ArrayList<Stage> stage) {
        this.stages = stage;
    }



    @Override
    public String toString() {
        return "\n" + idEtudiant + " | " + prenom + " " + nom + " | " + enStage + " | " + stages.toString();
    }
}
