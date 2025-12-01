package com.example.samgui.symulator;

/**
 * Klasa główna do testowania symulatora.
 */
public class Main {
    public static void main(String[] args) {

        Silnik silnik = new Silnik("Mercedes-Benz", "V8", 6000);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "8HP", 8);
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Sport");
        Pozycja pozycja = new Pozycja(0.0, 0.0);

        Samochod mojSamochod = new Samochod(silnik, skrzynia, sprzeglo, pozycja);


        System.out.println(mojSamochod.getStan());

        System.out.println("\n==> Uruchamianie samochodu...");
        mojSamochod.wlacz();
        System.out.println(mojSamochod.getStan());


        System.out.println("\n==> Zmiana biegu na 1...");
        mojSamochod.zmienBieg(1);
        System.out.println(mojSamochod.getStan());

        System.out.println("\n==> Zmiana biegu na 2...");
        mojSamochod.zmienBieg(2);
        System.out.println(mojSamochod.getStan());


        System.out.println("\n==> Zmiana biegu na 1...");
        mojSamochod.zmienBieg(1);
        System.out.println(mojSamochod.getStan());


        System.out.println("\n==> Wyłączanie samochodu...");
        mojSamochod.wylacz();
        System.out.println(mojSamochod.getStan());
    }
}