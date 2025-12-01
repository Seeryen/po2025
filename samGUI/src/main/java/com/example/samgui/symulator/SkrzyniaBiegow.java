package com.example.samgui.symulator;

/**
 * Reprezentuje Skrzynię Biegów[cite: 99].
 */
public class SkrzyniaBiegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;

    public SkrzyniaBiegow(String producent, String model, int iloscBiegow) {
        super(producent, model);
        this.iloscBiegow = iloscBiegow;
        this.aktualnyBieg = 0; // 0 oznacza bieg neutralny (luz)
    }

    /**
     * Zwiększa bieg, jeśli nie jest to bieg maksymalny[cite: 104].
     */
    public void zwiekszBieg() {
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            System.out.println("Zmieniono bieg na: " + aktualnyBieg);
        } else {
            System.out.println("Osiągnięto maksymalny bieg.");
        }
    }

    /**
     * Zmniejsza bieg, jeśli nie jest to bieg neutralny[cite: 105].
     */
    public void zmniejszBieg() {
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
            System.out.println("Zmieniono bieg na: " + aktualnyBieg);
        } else {
            System.out.println("Jesteś na biegu neutralnym (0).");
        }
    }

    // Metoda ustawiająca, przydatna np. przy wyłączaniu samochodu
    public void setAktualnyBieg(int bieg) {
        if (bieg >= 0 && bieg <= iloscBiegow) {
            this.aktualnyBieg = bieg;
        }
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }
}