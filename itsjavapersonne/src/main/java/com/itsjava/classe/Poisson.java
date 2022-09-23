package com.itsjava.classe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Poisson extends EtreVivant {
    private String couleur;
    private String espece;

    public Poisson(double taille, double masse, String couleur, String espece) {
        super(taille, masse);
        this.couleur = couleur;
        this.espece = espece;
    }

    @Override
    public void parler() {
        System.out.println("Plop");

    }

    @Override
    public void seDeplacer() {
        System.out.println("Je nage");

    }

    @Override
    public void respirer() {
        System.out.println("Dans l'eau");

    }

    @Override
    public void dormir() {
        System.out.println("ZZZ");

    }

    @Override
    public void mourrir() {
        System.out.println("Argr");

    }

    public void executer(){
        parler();
        seDeplacer();
        respirer();
        dormir();
        mourrir();
    }

}
