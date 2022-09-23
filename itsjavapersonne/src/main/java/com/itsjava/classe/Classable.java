package com.itsjava.classe;

public interface Classable {
    static final int INFERIEUR = -1;
    static final int EGAL = 0;
    static final int SUPERIEUR = 1;
    static final int ERREUR = -99;

    int compare(Object o);
}
