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
}