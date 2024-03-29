package modele;

import java.util.Calendar;
import java.util.Scanner;

public class Date {
    protected int chJour;
    protected int chMois;
    protected int chAnnee;

    public Date(int parJour, int parMois, int parAnnee) {
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }

    public Date(int parAnnee) {
        chAnnee = parAnnee;
        chJour = 1;
        chMois = 1;
    }

    public Date() {
        Calendar dateAuj = Calendar.getInstance();
        chAnnee = dateAuj.get(Calendar.YEAR);
        chMois = dateAuj.get(Calendar.MONTH) + 1;
        chJour = dateAuj.get(Calendar.DAY_OF_MONTH);
    }

    public int getChJour () {
        return chJour;
    }

    public int getChMois () {
        return chMois;
    }

    public int getChAnnee () {
        return chAnnee;
    }
}