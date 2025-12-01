package com.example.samgui.symulator;

/**
 * Reprezentuje Sprzęgło[cite: 106].
 */
public class Sprzeglo extends Komponent {
    private boolean stanSprzegla; // true = wciśnięte, false = zwolnione [cite: 107]

    public Sprzeglo(String producent, String model) {
        super(producent, model);
        this.stanSprzegla = false; // Domyślnie sprzęgło jest zwolnione
    }

    /**
     * Ustawia sprzęgło na aktywne (wciśnięte)[cite: 109].
     */
    public void wcisnij() {
        this.stanSprzegla = true;
        System.out.println("Sprzęgło wciśnięte.");
    }

    /**
     * Ustawia sprzęgło na nieaktywne (zwolnione)[cite: 110].
     */
    public void zwolnij() {
        this.stanSprzegla = false;
        System.out.println("Sprzęgło zwolnione.");
    }

    public boolean isWcisniete() {
        return stanSprzegla;
    }
}