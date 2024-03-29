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

    public static boolean estAnneeBiss(int parAns) {
        if (parAns > 1582 && ((parAns % 4 == 0 && parAns % 100 != 0) || parAns % 400 == 0))
            return true;
        return false;
    }

    public static int dernierJourMois(int parMois, int parAns) {
        switch (parMois) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (estAnneeBiss(parAns))
                    return 29;
                else
                    return 28;
            default:
                return 31;
        }
    }

    public int compareTo (Date parDate) {
        int entier1 = chAnnee*10000 +chMois*100 + chJour;
        int entier2 = parDate.chAnnee*10000 + parDate.chMois*100 + parDate.chJour;
        return entier1 - entier2;
    }
}