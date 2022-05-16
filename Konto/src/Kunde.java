public class Kunde extends Person {

    private Mitarbeiter betreuer;

    public Kunde(String name, String nachname, Mitarbeiter betreuer){
        super(name, nachname, betreuer);
        this.betreuer = betreuer;
    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "betreuer=" + betreuer +
                '}';
    }
}
