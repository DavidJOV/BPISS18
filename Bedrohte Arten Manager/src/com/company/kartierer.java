package com.company;

import java.util.ArrayList;

public class kartierer {
    //Variablen
    private String name;
    private String vorname;

    ArrayList<tier> listOfTiere = new ArrayList<tier>();

   //Konstruktor
    public kartierer(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }
    // Getter
    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public ArrayList<tier> getListOfTiere() {
        return listOfTiere;
    }


    //Hinzufügen eines Tieres
    public void pushTier(tier t) {

        this.listOfTiere.add(t);

    }

}
