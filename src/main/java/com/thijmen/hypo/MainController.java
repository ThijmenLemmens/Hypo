package com.thijmen.hypo;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML public Label labelInkomen;
    @FXML public Label labelRentevastePeriode;
    @FXML public Label labelMaximaalTeLenen;
    @FXML public Label labelRenteBedrag;
    @FXML public Label labelAflossingBedrag;
    @FXML public Label labelTotaleMaandbedrag;
    @FXML public Label labelTotaalBetaald;
    private double procentRente;
    private double inkomen;
    private boolean studySchuld;

    private Hypotheek hypotheek;

    @FXML
    private ComboBox<String> comboBoxRentevastePeriode;

    @FXML
    private CheckBox checkboxStudySchuld;

    @FXML
    private TextField textFieldInkomen;

    @FXML
    private Label labelProcentRente;

    @FXML
    public void initialize() {
        comboBoxRentevastePeriode.getItems().add("1 Jaar");
        comboBoxRentevastePeriode.getItems().add("5 Jaar");
        comboBoxRentevastePeriode.getItems().add("10 Jaar");
        comboBoxRentevastePeriode.getItems().add("20 Jaar");
        comboBoxRentevastePeriode.getItems().add("30 Jaar");
    }

    @FXML
    protected void onSelectedItem() {
        int jaar = Integer.parseInt(comboBoxRentevastePeriode.getValue().split(" ")[0]);
        setProcentRente(jaar);
    }

    @FXML
    protected void onCalculateClick() {
        hypotheek = new Hypotheek();

        if (textFieldInkomen) {

        }

        hypotheek.setInkomen(Double.parseDouble(textFieldInkomen.getText()));
        hypotheek.setStudySchuld(checkboxStudySchuld.isSelected());
        hypotheek.setProcentRente(procentRente);
    }

    private void setProcentRente(int jaar) {
        switch (jaar) {
            case 1 -> this.procentRente = 2;
            case 5 -> this.procentRente = 3;
            case 10 -> this.procentRente = 3.5;
            case 20 -> this.procentRente = 4.5;
            case 30 -> this.procentRente = 5;
        }

        this.labelProcentRente.setText(procentRente + "%");
    }

    private void setLabels() {
        labelInkomen.setText();
    }

}