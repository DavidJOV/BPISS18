package com.company;

import java.util.ArrayList;

public class kartierer {

    private String name;
    private String vorname;

    ArrayList<tier> listOfTiere = new ArrayList<tier>();


    public kartierer(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public ArrayList<tier> getListOfTiere() {
        return listOfTiere;
    }



    public void pushTier(tier t) {

        this.listOfTiere.add(t);

    }

}
