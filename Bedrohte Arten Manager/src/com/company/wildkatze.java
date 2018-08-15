package com.company;

public class wildkatze extends tier {

    private int anzahlMaeuseLoescherHabitat;

    public int getAnzahlMaeuseLoescherHabitat() {
        return anzahlMaeuseLoescherHabitat;
    }

    public wildkatze(int anzahl, String populationsstatus, String art, int alter, int anzahlMaeuseLoescherHabitat) {
        super(anzahl, populationsstatus, art, alter);
        this.anzahlMaeuseLoescherHabitat = anzahlMaeuseLoescherHabitat;
    }
}
