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

}