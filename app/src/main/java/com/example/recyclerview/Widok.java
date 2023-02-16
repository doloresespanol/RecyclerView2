package com.example.recyclerview;

public class Widok {
    private int idObrazka;
    private String opisObrazka;

    public Widok(int idObrazka, String opisObrazka) {
        this.idObrazka = idObrazka;
        this.opisObrazka = opisObrazka;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public String getOpisObrazka() {
        return opisObrazka;
    }

    public void setOpisObrazka(String opisObrazka) {
        this.opisObrazka = opisObrazka;
    }
}
