package symulator;

/**
 * Klasa główna do testowania symulatora.
 */
public class Main {
    public static void main(String[] args) {

        // 1. Tworzenie komponentów [cite: 123-124]
        Silnik silnik = new Silnik("Mercedes-Benz", "V8", 6000);
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "8HP", 8);
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Sport");
        Pozycja pozycja = new Pozycja(0.0, 0.0);

        // 2. Utworzenie obiektu klasy Samochód [cite: 112, 127]
        Samochod mojSamochod = new Samochod(silnik, skrzynia, sprzeglo, pozycja);

        // 3. Wyświetlenie stanu początkowego [cite: 115]
        System.out.println(mojSamochod.getStan());

        // 4. Wywołanie metody włącz() [cite: 113]
        System.out.println("\n==> Uruchamianie samochodu...");
        mojSamochod.wlacz();
        System.out.println(mojSamochod.getStan());

        // 5. Zwiększanie biegów [cite: 114]
        System.out.println("\n==> Zmiana biegu na 1...");
        mojSamochod.zmienBieg(1);
        System.out.println(mojSamochod.getStan());

        System.out.println("\n==> Zmiana biegu na 2...");
        mojSamochod.zmienBieg(2);
        System.out.println(mojSamochod.getStan());

        // 6. Zmniejszanie biegu [cite: 114]
        System.out.println("\n==> Zmiana biegu na 1...");
        mojSamochod.zmienBieg(1);
        System.out.println(mojSamochod.getStan());

        // 7. Wyłączenie samochodu
        System.out.println("\n==> Wyłączanie samochodu...");
        mojSamochod.wylacz();
        System.out.println(mojSamochod.getStan());
    }
}