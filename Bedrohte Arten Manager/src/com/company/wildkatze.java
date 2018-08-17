package com.company;
//erbt von tier
public class wildkatze extends tier {
    //Variablen
    private int anzahlMaeuseLoescherHabitat;
    //Konstruktor der den Konstruktor von tier aufruft.
    public wildkatze(int anzahl, String populationsstatus, String art, int alter, int anzahlMaeuseLoescherHabitat) {
        super(anzahl, populationsstatus, art, alter);
        this.anzahlMaeuseLoescherHabitat = anzahlMaeuseLoescherHabitat;
    }
    // Getter
    public int getAnzahlMaeuseLoescherHabitat() {
        return anzahlMaeuseLoescherHabitat;
    }
}
