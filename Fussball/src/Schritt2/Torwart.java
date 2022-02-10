package Schritt2;

import schrit1.Spieler;

public class Torwart extends Spieler {

    private int reaktion;

    public Torwart(String name,int alter,int stearke, int mutivation,int reaktion){
        super(name,alter,stearke, mutivation,0,0);
        this.reaktion = reaktion;
    }


    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    public String toString() {
        String Torwart = super.toString();
        Torwart += "\nReaktion \t" + reaktion;
        return Torwart;
    }
}
