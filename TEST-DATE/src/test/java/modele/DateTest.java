package modele;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    @DisplayName("Test du constructeur")
    void date() {
        Date date1 = new Date();
        int jour = 25;
        int mois = 03;
        int annee = 2024;
        assertEquals(jour, date1.getChJour());
        assertEquals(mois, date1.getChMois());
        assertEquals(annee, date1.getChAnnee());
    }
    @Test
    @DisplayName("Test de la méthode estAnneeBiss")
    void estAnneeBiss() {
        assertEquals(false, Date.estAnneeBiss(2023));
        assertEquals(true, Date.estAnneeBiss(2020));
        assertEquals(true, Date.estAnneeBiss(2000));
        assertEquals(false, Date.estAnneeBiss(2100));
    }
    @Test
    @DisplayName("Test de la méthode dernierJourDuMois")
    void dernierJourDuMois() {
        assertEquals(30, Date.dernierJourMois(04, 2024));
        assertEquals(31, Date.dernierJourMois(01, 2023));
        assertEquals(29, Date.dernierJourMois(02, 2020));
        assertEquals(28, Date.dernierJourMois(02, 2023));
    }

    @Test
    @DisplayName("Test de la méthode CompareTo")
    void compareto() {
        Date date1 = new Date(02, 03, 2024);
        Date date2 = new Date (02, 03, 2024);
        Date date3 = new Date (03, 03, 2024);
        Date date4 = new Date (01, 03, 2024);

        assertEquals(0, date1.compareTo(date2));
        assertEquals(-1, date1.compareTo(date3));
        assertEquals(1, date1.compareTo(date4));

    }

    @Test
    @DisplayName("Test de la méthode dateDuLendemain")
    void dateDuLendemain() {
        Date date1 = new Date (28, 02, 2020);
        Date date1A = new Date (29, 02, 2020);
        assertEquals(0, date1A.compareTo(date1.dateDuLendemain()));
        Date date2 = new Date (28, 02, 2019);
        Date date2A = new Date (01, 03, 2019);
        assertEquals(0, date2A.compareTo(date2.dateDuLendemain()));
        Date date3 = new Date (31, 12, 2019);
        Date date3A = new Date (01, 01, 2020);
        assertEquals(0, date3A.compareTo(date3.dateDuLendemain()));
        Date date4 = new Date (30, 06, 2019);
        Date date4A = new Date (01, 07, 2019);
        assertEquals(0, date4A.compareTo(date4.dateDuLendemain()));
        Date date5 = new Date (31, 07, 2019);
        Date date5A = new Date (01, 8, 2019);
        assertEquals(0, date5A.compareTo(date5.dateDuLendemain()));
    }

}