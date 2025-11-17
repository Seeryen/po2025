package symulator;

/**
 * Główna klasa symulatora, agregująca wszystkie komponenty.
 */
public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Sprzeglo sprzeglo;
    private Pozycja pozycja;
    private boolean stanWlaczenia; // Pole z diagramu UML

    /**
     * Konstruktor składający samochód z komponentów.
     */
    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Sprzeglo sprzeglo, Pozycja pozycja) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.sprzeglo = sprzeglo;
        this.pozycja = pozycja;
        this.stanWlaczenia = false; // Samochód jest początkowo wyłączony
    }

    /**
     * Włącza samochód, wywołując metodę uruchom() silnika[cite: 90].
     */
    public void wlacz() {
        if (!stanWlaczenia) {
            this.silnik.uruchom();
            this.stanWlaczenia = true;
            System.out.println("Samochód włączony.");
        } else {
            System.out.println("Samochód już jest włączony.");
        }
    }

    /**
     * Wyłącza samochód, zatrzymuje silnik i zeruje bieg[cite: 91].
     */
    public void wylacz() {
        if (stanWlaczenia) {
            this.silnik.zatrzymaj();
            this.skrzynia.setAktualnyBieg(0); // Ustawienie biegu na neutralny
            this.stanWlaczenia = false;
            System.out.println("Samochód wyłączony.");
        } else {
            System.out.println("Samochód już jest wyłączony.");
        }
    }

    /**
     * Metoda do zmiany biegu (zgodnie z logiką - wymaga sprzęgła).
     * Rozbudowa funkcjonalności[cite: 121].
     */
    public void zmienBieg(int bieg) {
        if (!stanWlaczenia) {
            System.out.println("Nie można zmienić biegu - silnik wyłączony.");
            return;
        }

        sprzeglo.wcisnij();
        if (bieg > skrzynia.getAktualnyBieg()) {
            skrzynia.zwiekszBieg();
        } else if (bieg < skrzynia.getAktualnyBieg()) {
            skrzynia.zmniejszBieg();
        }
        // W realistycznym scenariuszu tu byłaby walidacja, czy bieg = skrzynia.getAktualnyBieg()
        sprzeglo.zwolnij();
    }

    /**
     * Wyświetla aktualny stan samochodu[cite: 115].
     */
    public String getStan() {
        return "--- STAN SAMOCHODU ---\n" +
                "Silnik: " + (stanWlaczenia ? "WŁĄCZONY" : "WYŁĄCZONY") + "\n" +
                "Obroty: " + silnik.getObroty() + " RPM\n" +
                "Bieg: " + skrzynia.getAktualnyBieg() + "\n" +
                "Sprzęgło: " + (sprzeglo.isWcisniete() ? "WCIŚNIĘTE" : "ZWOLNIONE") + "\n" +
                "Pozycja: " + pozycja.getPozycja() + "\n" +
                "Komponenty: \n" +
                "  - Silnik: " + silnik.toString() + "\n" +
                "  - Skrzynia: " + skrzynia.toString() + "\n" +
                "  - Sprzęgło: " + sprzeglo.toString() + "\n" +
                "------------------------";
    }
}