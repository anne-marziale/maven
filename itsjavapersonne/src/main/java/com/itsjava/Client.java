package com.itsjava;

import java.util.GregorianCalendar;

public class Client extends Personne{
    // determiner un type de client : P-> particuliers E->entreprise A->dministartion
    private char type;

    Client(){
        super();
    }

    Client(String nom, String prenom, GregorianCalendar date_naiss, char type){
        super(nom, prenom, date_naiss);
        this.type = type;
    }

    public char getType(){
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }
}


