package aodemi.service;

import aodemi.entity.*;

import java.util.*;

public class Services {


    public static List<Etudiant> sortEtudiant(List<Etudiant> etudiants){
        Comparator<Etudiant> etudiantComparator = Comparator.comparing(Etudiant::getDepartement);
        Collections.sort(etudiants, etudiantComparator);
        return etudiants;
    }
    public static List<Stage> sortStage(List<Stage> stages){
        Comparator<Stage> stageComparator = Comparator.comparing(Stage::getDepartement);
        Collections.sort(stages, stageComparator);
        return stages;
    }


    public static void findStagiaire(Stage stage, Etudiant etudiant){
        if(stage.stagiaires.contains(etudiant)){
            System.out.println(etudiant);
        }
        else{
            System.out.println("Aucune correspondance.");
        }
    }
    public static void findStage(List<Stage> stages, Stage stage){
        if(stages.contains(stage)){System.out.println(stage);}
        else{System.out.println("Aucune correspondance.");}
    }

    public static void postulerStage(Stage stage, Etudiant etudiant) {
        etudiant.stages.add(stage);
    }

    public static void accepterStage(Stage stage, Etudiant etudiant){

        if(etudiant.isEnStage()){System.out.println("Vous êtes déjà en stage.");}

        else if (etudiant.stages.contains(stage)) {
            stage.stagiaires.add(etudiant);
            etudiant.setEnStage(true);
            etudiant.stages.clear(); etudiant.stages.add(stage);
            System.out.println("Vous avez rejoins le stage en " + stage.getDepartement() + " de " + stage.getEntreprise());
        }
        else{System.out.println("Vous n'avez pas encore postulé.");}

    }

    



}
