package com.itsjava;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Création d'un ojbet Personne" );
        Personne p;
        p = new Personne();
        Personne p1 = new Personne();
        Personne p2 = new Personne("DOE", "Jhon", new GregorianCalendar(1998,9,8));

        Scanner in = new Scanner(System.in);
        System.out.println("Quel est votre nom ? >> ");
        String nom = in.nextLine();
        System.out.println("Quel est votre prénom ? >> ");
        String prenom = in.nextLine();
        System.out.println("Quel est votre année de naissance ? >>");
        String annee = in.nextLine();
        System.out.println("Quel est votre mois de naissance ? >>");
        String mois = in.nextLine();
        System.out.println("Quel est votre jour de naissance ? >>");
        String jour = in.nextLine();

        Personne p3 = new Personne(nom, prenom, new GregorianCalendar(Integer.parseInt(annee), 
                                                                        Integer.parseInt(mois), 
                                                                        Integer.parseInt(jour)));
        
        p3.affichage(true);
    }
}
