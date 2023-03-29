package Entities.Exo1;

import java.util.ArrayList;
import java.util.Comparator;

public class Captage
{
    private int id;
    private String nom;
    private int hauteur;
    private int debitMax;



    public Captage(int unId, String unNom, int uneHauteur, int unDebitMax) {
        this.id = unId;
        this.nom = unNom;
        this.hauteur = uneHauteur;
        this.debitMax = unDebitMax;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getDebitMax() {
        return debitMax;
    }
}


//Un captage possède un id, un nom, une hauteur et un débit maximum.