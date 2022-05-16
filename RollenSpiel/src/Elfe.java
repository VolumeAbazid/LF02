public class Elfe extends Spielfigur {

    public Elfe(String name, int staerke) {
        super(name, staerke);
    }

    public void rennen() throws KeineKraftException {
        if (getStaerkepunkte() - 2 >= 0) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "rennt");
        } else {
            throw new KeineKraftException(getName(), "rennen");
        }
    }
    public String toString(){
        return super.toString();
    }
}