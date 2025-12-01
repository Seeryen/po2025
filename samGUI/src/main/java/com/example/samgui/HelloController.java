package com.example.samgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;       // <-- Nowy import
import javafx.scene.image.ImageView;   // <-- Nowy import

public class HelloController {

    @FXML
    private TextField producentTextField;
    @FXML
    private TextField biegTextField;
    @FXML
    private TextField obrotyTextField;
    @FXML
    private TextField stanSprzeglaTextField;

    // To pole musi mieć fx:id="carImageView" w pliku hello-view.fxml
    @FXML
    private ImageView carImageView;

    // Zmienne symulujące stan (wersja uproszczona bez pakietu symulator)
    private int obroty = 0;
    private int bieg = 0;
    private boolean silnikWlaczony = false;

    // --- Metoda initialize (z Twojego zadania) ---
    @FXML
    public void initialize() {
        System.out.println("HelloController initialized");

        // Ustawienie pól jako tylko do odczytu
        if (producentTextField != null) producentTextField.setEditable(false);
        if (biegTextField != null) biegTextField.setEditable(false);
        if (obrotyTextField != null) obrotyTextField.setEditable(false);
        if (stanSprzeglaTextField != null) stanSprzeglaTextField.setEditable(false);

        // Ładowanie obrazka (ikona samochodu)
        try {
            // Upewnij się, że plik car.png jest w src/main/resources/images/
            Image carImage = new Image(getClass().getResource("/images/car.png").toExternalForm());

            System.out.println("Image width: " + carImage.getWidth() + ", height: " + carImage.getHeight());

            if (carImageView != null) {
                carImageView.setImage(carImage);
                carImageView.setFitWidth(30);
                carImageView.setFitHeight(20);
                carImageView.setTranslateX(0);
                carImageView.setTranslateY(0);
            }
        } catch (Exception e) {
            System.out.println("Nie znaleziono obrazka: /images/car.png");
            // e.printStackTrace(); // Odkomentuj, żeby zobaczyć błąd
        }

        refresh();
    }

    public void refresh() {
        // Proste odświeżanie
        if(obrotyTextField != null) obrotyTextField.setText(String.valueOf(obroty));
        if(biegTextField != null) biegTextField.setText(String.valueOf(bieg));
    }

    // --- Metody przycisków ---
    @FXML
    public void onWlaczClick(ActionEvent event) {
        silnikWlaczony = true;
        obroty = 800;
        refresh();
    }

    @FXML
    public void onWylaczClick(ActionEvent event) {
        silnikWlaczony = false;
        obroty = 0;
        refresh();
    }

    // Pozostałe metody (gaz, biegi) bez zmian...
    @FXML public void onGazClick(ActionEvent event) { if(silnikWlaczony) obroty+=500; refresh(); }
    @FXML public void onZwiekszBiegClick(ActionEvent event) { bieg++; refresh(); }
    @FXML public void onZmniejszBiegClick(ActionEvent event) { if(bieg>0) bieg--; refresh(); }
}