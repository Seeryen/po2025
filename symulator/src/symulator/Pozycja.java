package symulator;

/**
 * Reprezentuje aktualną pozycję samochodu na płaszczyźnie.
 */
public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metoda do aktualizacji pozycji[cite: 83].
     */
    public void aktualizujPozycje(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    /**
     * Zwraca pozycję jako String[cite: 84].
     */
    public String getPozycja() {
        return "Pozycja (x: " + x + ", y: " + y + ")";
    }
}