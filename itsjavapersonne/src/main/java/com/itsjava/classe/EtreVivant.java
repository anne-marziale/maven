package com.itsjava.classe;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter @Setter
public abstract class EtreVivant {
    private double taille;
    private double masse;

    // Constructeur généré par Lombok

    // Méthodes de class
    public abstract void parler();
    public abstract void seDeplacer();
    public abstract void respirer();
    public abstract void dormir();
    public abstract void mourrir();

    //GETTER SETTER généré par lombok

}
