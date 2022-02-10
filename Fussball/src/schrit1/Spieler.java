package schrit1;

import Schritt3.Person;

public class Spieler extends Person {
        private int stearke;
        private int torschuss;
        private int Mutivation;
        private int tore;

    public Spieler(String name, int alter, int stearke , int mutivation , int tore, int torschuss) {
        super(name, alter);
        this.stearke = stearke;
        this.Mutivation = mutivation;
        this.tore = tore;
        this.torschuss = torschuss;
    }

        public int getStearke() {
            return stearke;
        }

        public void setStearke(int stearke) {
            this.stearke = stearke;
        }

        public int getMutivation() {
            return Mutivation;
        }

        public void setMutivation(int mutivation) {
            Mutivation = mutivation;
        }

        public int getTore() {
            return tore;
        }

        public void setTore(int tore) {
            this.tore = tore;
        }

        public int getTorschuss() {
            return torschuss;
        }

        public void setTorschuss(int torschuss) {
            this.torschuss = torschuss;
        }

        @Override
        public String toString() {
            String spieler = super.toString();
            spieler += "\nstearke: \t" + stearke;
            spieler += "\nmutivation: \t" + Mutivation;
            spieler += "\ntore: \t" + tore;
            spieler += "\ntorschuss: \t" + torschuss;
            return spieler;


        }
    }
