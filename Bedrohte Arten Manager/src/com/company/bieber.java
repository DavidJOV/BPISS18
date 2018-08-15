package com.company;

public class bieber extends tier {

    private int wasserqualität; // int weil Wasserqualität in µS (MicroSiemens) gemessen wird.


    public bieber(int anzahl, String populationsstatus, String art, int alter, int wasserqualität) {
        super(anzahl, populationsstatus, art, alter);
        this.wasserqualität = wasserqualität;
    }

    public int getWasserqualität() {
        return wasserqualität;
    }
}