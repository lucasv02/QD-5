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

    public Date dateDuLendemain() {
        int Jour = chJour, Mois = chMois, Annee = chAnnee;
        Jour ++;
        if (Jour > dernierJourMois(Mois, Annee)) {
            Jour = 1;
            Mois ++;
            if (Mois > 12){
                Mois =1;
                Annee++;
            }
        }
        return new Date(Jour, Mois, Annee);
    }

    public Date dateDeLaVeille() {
        int Jour = chJour, Mois = chMois, Annee = chAnnee;
        Jour --;
        if (Jour < 1) {
            Jour = dernierJourMois(Mois -1, Annee);
            Mois --;
            if (Mois < 1) {
                Mois = 12;
                Annee = Annee - 1;
            }
        }
        return new Date(Jour, Mois, Annee);
    }
}