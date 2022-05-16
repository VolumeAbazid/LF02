public class Zauberer extends Spielfigur {

    private int zauberpunkte;

    public Zauberer(String name, int staerkepunkte, int zauberpunkte) {
        super(name,staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void zaubertrank() {
        if (getStaerkepunkte() >= 0) {
            setStaerkepunkte(getStaerkepunkte() + 3);
            System.out.println(getName() + "trinkt");
        }
    }

    public void zauberen() throws KeineKraftException {
        if (getStaerkepunkte() >= 1) {
            setStaerkepunkte(getStaerkepunkte() - 1);
            System.out.println(getName() + "zaubert");


        }

        else {
            throw new KeineKraftException(getName(),"zaubert");
        }
    }

    public String toString() {
        String Zauber = super.toString();
         Zauber = "\nZauperpunkte" + zauberpunkte;
         return Zauber;

    }
}
