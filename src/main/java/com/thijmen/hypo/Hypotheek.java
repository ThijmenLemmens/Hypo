package com.thijmen.hypo;

public class Hypotheek {

    private double inkomen;
    private double procentRente;
    private double maximaalTeLenen;
    private boolean studySchuld;
    private double renteBedragPerMaand;
    private double aflossingsBedrag;
    private double totaalMaandBedrag;
    private double rentevastePeriode;

    public void calculate() {
        this.maximaalTeLenen = maxHypotheekLast();
        this.renteBedragPerMaand = this.maximaalTeLenen / rentevastePeriode;
        this.aflossingsBedrag = rentePerMaand();
        this.totaalMaandBedrag = this.aflossingsBedrag + this.renteBedragPerMaand;
    }

    private double maxHypotheekLast() {
        double maxHypotheekLast = inkomen * 4.25;

        if (this.studySchuld)
            maxHypotheekLast *= 0.75;

        return maxHypotheekLast;
    }

    private double procentRentePerMaand() {
        return (procentRente / 100) / 12;
    }

    private double rentePerMaand() {
        return maxHypotheekLast() * procentRentePerMaand();
    }

    public double totaalBetaald() {
        return this.totaalMaandBedrag * rentevastePeriode;
    }

    public double getInkomen() {
        return inkomen;
    }

    public void setInkomen(double inkomen) {
        this.inkomen = inkomen;
    }

    public double getProcentRente() {
        return procentRente;
    }

    public void setProcentRente(double procentRente) {
        this.procentRente = procentRente;
    }

    public double getMaximaalTeLenen() {
        return maximaalTeLenen;
    }

    public void setMaximaalTeLenen(double maximaalTeLenen) {
        this.maximaalTeLenen = maximaalTeLenen;
    }

    public boolean isStudySchuld() {
        return studySchuld;
    }

    public void setStudySchuld(boolean studySchuld) {
        this.studySchuld = studySchuld;
    }

    public double getRenteBedragPerMaand() {
        return renteBedragPerMaand;
    }

    public void setRenteBedragPerMaand(double renteBedragPerMaand) {
        this.renteBedragPerMaand = renteBedragPerMaand;
    }

    public double getAflossingsBedrag() {
        return aflossingsBedrag;
    }

    public void setAflossingsBedrag(double aflossingsBedrag) {
        this.aflossingsBedrag = aflossingsBedrag;
    }

    public double getTotaalMaandBedrag() {
        return totaalMaandBedrag;
    }

    public void setTotaalMaandBedrag(double totaalMaandBedrag) {
        this.totaalMaandBedrag = totaalMaandBedrag;
    }

    public double getRentevastePeriode() {
        return rentevastePeriode;
    }

    public void setRentevastePeriode(double rentevastePeriode) {
        this.rentevastePeriode = rentevastePeriode;
    }
}
