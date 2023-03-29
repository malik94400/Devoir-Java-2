package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int largeur;
    private int longueur;



    public Cuve(int unID,String unNom, int uneHauteur,int unDebitMax,int largeur, int longueur) {
        super(unID,unNom,uneHauteur,unDebitMax);
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }
}


//Une cuve possède une largeur et une longueur.