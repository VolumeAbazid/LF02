import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstands;

    public Tresor() {
        gegenstands = new ArrayList<Gegenstand>();
    }

    public Gegenstand getGegenstand(int id) {
        return gegenstands.get(id);
    }

    public void addGegenstand(Gegenstand gegenstand) {
        gegenstands.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) {
        gegenstands.remove(gegenstand);
    }

    public double berechneGesamtwert() {
        int gesammt = 0;
        for (int i = 0; i < gegenstands.size(); i++) {
            gesammt += gegenstands.get(i).getWert();

        }
        return gesammt;
    }


    @Override
    public String toString() {
        return "Tresor{" +
                "gegenstands=" + gegenstands +
                '}';
    }
}




