package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static int kartiererCounter = 0;


    public static void main(String[] args) {
        //Liste von  Kartierern
        ArrayList<kartierer> listOfKartierer = new ArrayList<kartierer>();
        // Scanner für User Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo und wilkommen zum artenschutz Programm der TH Köln!");
        while (true) {                                              //
            if (checkkartiererCounter() == false) {  // Wenn der Counter = 0 ist muss er erst ein Kartierer erstellt werden.
                System.out.println("Ups! Wir haben noch keinen ArtenKartierer! \n" +
                        "Um weiter zu machen müssen wir erst einen erstellen.");
                 //Anlegen des ersten Kartierer
                System.out.println("Bitte geben Sie den Vorname ein:");
                String vname = scanner.next();
                System.out.println("Bitte geben Sie den Nachnamen ein:");
                String nname = scanner.next();
                System.out.println("Super Wir haben unseren ersten Kartierer: " + vname + " " + nname);
                kartierer pushKartierer = new kartierer(vname, nname);

                listOfKartierer.add(pushKartierer);

                kartiererCounter++;
            }
            // Auswahl des Kartierer oder neuen Kartierer anlegen
            System.out.println("Bitte Wählen Sie 1 oder 2");
            System.out.println("Mit 1 arbeiten Sie, mit den uns bereits bekannten Kartierern \nMit 2 erstellen Sie einen neuen Kartierer");
            String abfrage = scanner.next();
            // Anzeigen aller vorhandenen Kartierer
            if (abfrage.equals("1")) {
                System.out.println("Mit welchem Kartierer möchten sie Arbeiten? \n" +
                        "Wir haben bereits Folgende Kartierer: ");
                for (int i = 0; i < listOfKartierer.size(); i++) {
                    System.out.println(listOfKartierer.get(i).getVorname() + " " + listOfKartierer.get(i).getName());

                }

                //Auswahl des gewünschten Kartierer über eingabe des Vor- und Nachnamen
                System.out.println("Geben Sie den Vornamen des Kartierers ein");
                String vname = scanner.next();
                System.out.println("Geben Sie den Nachnamen des Kartierers ein");
                String nname = scanner.next();

                for (kartierer k : listOfKartierer) {

                    if (k.getName().equals(nname) && k.getVorname().equals(vname)) {

                        System.out.println("Sie haben Kartierer: " + k.getVorname() + " " + k.getName() + " gewählt");
                        System.out.println("Mit 1 werden alle Tierarten von Kartierer: " + k.getVorname() + " " + k.getName() + "  angezeigt");

                        System.out.println("Mit 2 können Sie dem Kartierer: " + k.getVorname() + " " + k.getName() + " eine neue Tierart hinzufügen.");
                        String eingabe = scanner.next();
                        // Anzeigen aller Tiere des gewählten Kartierer
                        if (eingabe.equals("1")) {
                            if (k.getListOfTiere().size() >0) {
                            for (tier t : k.getListOfTiere()) {
                                if (k.getListOfTiere() != null) {
                                    System.out.println("Art: " + t.getArt() + " \nPopulationsstatus: " + t.getPopulationsstatus() + " \nAnzahl: " + t.getAnzahl() + " \nAlter: " + t.getAlter());
                                }

                            }}
                            else {
                                System.out.println("Ups! dieser Kartierer hat noch keine Tiere!");
                            }
                        }
                        // Anlegen eines Tieres für den gewählten Kartierer - Wahl zwischen Bieber oder Wildkatze
                       else if (eingabe.equals("2")) {
                            System.out.println("Wählen Sie 1 für Bieber oder 2 für Wildkatze");
                            eingabe = scanner.next();
                            if (eingabe.equals("1")) {

                                String art = "Bieber";
                                System.out.println("Bitte geben Sie die Populationsgröße ein");
                                int anzahl = scanner.nextInt();
                                System.out.println("Bitte geben Sie das Alter ein");
                                int alter = scanner.nextInt();
                                System.out.println("Bitte geben Sie den Populationsstatus ein");
                                String status = scanner.next();
                                System.out.println("Bitte geben Sie die Wasserqualität ein");
                                int qualität = scanner.nextInt();
                                tier bieber = new bieber(anzahl, status, art, alter, qualität);

                                k.pushTier(bieber);

                            } else if (eingabe.equals("2")) {

                                String art = "Wildkatze";
                                System.out.println("Bitte geben Sie die Populationsgröße ein");
                                int anzahl = scanner.nextInt();
                                System.out.println("Bitte geben Sie das Alter ein");
                                int alter = scanner.nextInt();
                                System.out.println("Bitte geben Sie den Populationsstatus ein");
                                String status = scanner.next();
                                System.out.println("Bitte geben Sie die Anzahl der Mäuselöscher ein");
                                int loescher = scanner.nextInt();
                                tier wildkatze = new wildkatze(anzahl, status, art, alter, loescher);

                                k.pushTier(wildkatze);

                            } else {

                                System.out.println("Falsche Eingabe! Zurück zum Anfang!");

                            }

                        } else {

                            System.out.println("Falsche Eingabe! Zurück zum Anfang!");

                        }
                    } else {

                        System.out.println("Keinen Kartierer mit diesem Namen gefunden. Zurück zum Anfang!");

                    }
                }

                // Anlegen eines neuen Kartierer
            } else if (abfrage.equals("2")) {

                System.out.println("Geben Sie den Vornamen des Kartierers ein");
                String vname = scanner.next();
                System.out.println("Geben Sie den Nachnamen des Kartierers ein");
                String nname = scanner.next();
                listOfKartierer.add(new kartierer(vname, nname));

                System.out.println("Sie haben den Kartierer: " + listOfKartierer.get(listOfKartierer.size() - 1).getVorname() + " " + listOfKartierer.get(listOfKartierer.size() - 1).getName() + " hinzugefügt.");
                kartiererCounter++;
            } else {
                System.out.println("Falsche Eingabe! Zurück zum Anfang!");
            }
        }
    }
 // Helper zum überprüfen ob es schon Kartierer gibt oder nicht.
    public static boolean checkkartiererCounter() {

        if (kartiererCounter > 0) return true;
        return false;
    }


}
