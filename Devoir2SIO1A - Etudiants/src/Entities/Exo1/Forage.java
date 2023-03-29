package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;




    public Forage(int unID,String unNom, int uneHauteur,int unDebitMax, int diametre) {
        super(unID,unNom,uneHauteur,unDebitMax);
        this.diametre = diametre;
    }

    public int getDiametre() {
        return diametre;
    }

}


//Un forage possède un diamètre.