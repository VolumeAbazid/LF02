package Schritt4;

import Schritt2.Torwart;
import schrit1.Spieler;
import schrit1.Trainer;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart Torwart;
    private ArrayList<Spieler> spielerListe;
    private int Motivation;
    private int gesamtmotivation;
    private int stearke;
    private int gesamtstearke;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe ){
        this.name = name;
        this.trainer = trainer;
        this.Torwart= torwart;
        this.spielerListe= spielerListe;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return Torwart;
    }
    public void setTorwart(Torwart torwart) {
        Torwart = torwart;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }
    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public int getGesamtmotivation() {
       for (Spieler s:spielerListe){
           stearke += s.getStearke();

       }

       Motivation += Torwart.getMutivation();
       gesamtmotivation = Motivation / (spielerListe.size()+1);

       stearke += Torwart.getStearke();
       gesamtmotivation = stearke / (spielerListe.size()+1);
       return gesamtstearke;
    }



}

