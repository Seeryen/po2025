package com.example.samgui.symulator;

/**
 * Reprezentuje Silnik samochodu[cite: 92].
 */
public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model, int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0; // Silnik jest początkowo wyłączony
    }

    /**
     * Ustawia obroty na wartość początkową (jałowy bieg)[cite: 97].
     */
    public void uruchom() {
        if (obroty == 0) {
            this.obroty = 800; // Przykładowe obroty jałowe
            System.out.println("Silnik uruchomiony, obroty: " + this.obroty);
        } else {
            System.out.println("Silnik już pracuje.");
        }
    }

    /**
     * Zeruje obroty silnika[cite: 98].
     */
    public void zatrzymaj() {
        this.obroty = 0;
        System.out.println("Silnik zatrzymany.");
    }

    /**
     * Zwiększa obroty, nie przekraczając maksymalnej wartości.
     */
    public void zwiekszObroty() {
        if (obroty > 0) {
            this.obroty += 100;
            if (this.obroty > this.maxObroty) {
                this.obroty = this.maxObroty;
            }
            System.out.println("Obroty: " + this.obroty);
        } else {
            System.out.println("Nie można zwiększyć obrotów - silnik wyłączony.");
        }
    }

    /**
     * Zmniejsza obroty, nie spadając poniżej obrotów jałowych (jeśli silnik jest włączony).
     */
    public void zmniejszObroty() {
        if (obroty > 800) { // Zakładając 800 jako min obroty pracy
            this.obroty -= 100;
            System.out.println("Obroty: " + this.obroty);
        } else if (obroty > 0) {
            System.out.println("Obroty na biegu jałowym.");
        } else {
            System.out.println("Silnik wyłączony.");
        }
    }

    public int getObroty() {
        return obroty;
    }
}