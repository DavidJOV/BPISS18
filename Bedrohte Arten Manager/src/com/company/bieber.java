package com.company;
//erbt von tier
public class bieber extends tier {

    private int wasserqualität; // int weil Wasserqualität in µS (MicroSiemens) gemessen wird.

    //Konstruktor der den Konstruktor von tier aufruft
    public bieber(int anzahl, String populationsstatus, String art, int alter, int wasserqualität) {
        super(anzahl, populationsstatus, art, alter);
        this.wasserqualität = wasserqualität;
    }
    //getter
    public int getWasserqualität() {
        return wasserqualität;
    }
}