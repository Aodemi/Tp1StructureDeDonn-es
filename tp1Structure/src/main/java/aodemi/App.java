package aodemi;


import java.util.*;

import aodemi.entity.*;
import aodemi.service.Services;

public class App
{
    public static void main( String[] args ) {

        List<Stage> listeDeStages = new ArrayList<>();

        Stage stage1 = new Stage();
        Stage stage2 = new Stage();
        Stage stage3 = new Stage();
        stage1.setDepartement("Mode");
        stage2.setDepartement("Info");
        stage3.setDepartement("Science");
        listeDeStages.add(stage1);
        listeDeStages.add(stage2);
        listeDeStages.add(stage3);

        Etudiant e1 = new Etudiant("Mitz", "Somar", "Mode");
        Etudiant e2 = new Etudiant("Matz", "Soma", "Info");
        Etudiant e3 = new Etudiant("Motz", "Sor", "Science");

        Services.postulerStage(stage1, e1);
        Services.postulerStage(stage1, e2);
        Services.postulerStage(stage1, e3);

        Services.accepterStage(stage1, e3);
        Services.accepterStage(stage1, e2);
        Services.accepterStage(stage1, e1);

        Collections.shuffle(stage1.stagiaires);
        System.out.println(stage1.stagiaires);
        Services.sortEtudiant(stage1.stagiaires);

        Collections.shuffle(listeDeStages);
        System.out.println(listeDeStages);
        Services.sortStage(listeDeStages);

    }
}
