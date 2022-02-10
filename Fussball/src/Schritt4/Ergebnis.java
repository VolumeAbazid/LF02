package Schritt4;

public class Ergebnis {
    private int toreHeim;
    private int toreGast;

    public int getToreHeim() {
        toreHeim ++;
        return toreHeim;
    }

    public int getToreGast() {
        toreGast ++;
        return toreGast;
    }

    public String toString(){
        return ("Ergebnins") +
                "\n [Heimtore]" + toreHeim +
                "\n [Gasttore]" + toreGast;
    }
}
