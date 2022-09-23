package com.itsjava;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter @Setter
public abstract class EtreVivant {
    private double taille;
    private double masse;

    // Constructeur
    public EtreVivant(double taille, double masse) {
        this.taille = taille;
        this.masse = masse;
    }

    // Méthodes de class
    public abstract void parler();
    public abstract void seDeplacer();
    public abstract void respirer();
    public abstract void dormir();
    public abstract void mourir();

    //GETTER SETTER généré par lombok

}
