package com.company;

public class tier {

    private int anzahl;
    private String populationsstatus;
    private String art;
    private int alter;




    public tier(int anzahl, String populationsstatus, String art, int alter) {
        this.anzahl = anzahl;
        this.populationsstatus = populationsstatus;
        this.art = art;
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }


    public int getAnzahl() {
        return anzahl;
    }



    public String getPopulationsstatus() {
        return populationsstatus;
    }



    public String getArt() {
        return art;
    }


}
