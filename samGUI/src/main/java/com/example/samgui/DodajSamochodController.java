package com.example.samgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DodajSamochodController {

    @FXML
    private TextField modelField;

    @FXML
    private TextField nrRejestracyjnyField;

    @FXML
    private TextField wagaField;

    @FXML
    private TextField predkoscField;

    @FXML
    public void onZatwierdzClick(ActionEvent event) {
        // Pobieranie danych z pól
        String model = modelField.getText();
        String nrRej = nrRejestracyjnyField.getText();
        String waga = wagaField.getText();
        String predkosc = predkoscField.getText();

        System.out.println("Dodano samochód: " + model + ", " + nrRej + ", " + waga + "kg, " + predkosc + "km/h");

        // Zamknięcie okna po zatwierdzeniu
        closeWindow();
    }

    @FXML
    public void onAnulujClick(ActionEvent event) {
        System.out.println("Anulowano dodawanie samochodu.");
        closeWindow();
    }

    private void closeWindow() {
        // Pobranie aktualnego okna (Stage) i zamknięcie go
        Stage stage = (Stage) modelField.getScene().getWindow();
        stage.close();
    }
}