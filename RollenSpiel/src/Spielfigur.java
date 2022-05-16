public class Spielfigur {

    private String name;
    private int staerkepunkte;

    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;

    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void essen() {
        staerkepunkte = staerkepunkte + 10;
    }

    public void laufen() throws KeineKraftException {
        if (getStaerkepunkte()>= 1) {
            setStaerkepunkte(getStaerkepunkte() - 1);
            System.out.println(getName() + "läuft");
        }
        else {
            throw new KeineKraftException(name, "läuft");
        }
    }

    public void klettern() throws KeineKraftException {
        if (getStaerkepunkte()>= 2) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "klettert");
        } else {
            throw new KeineKraftException(name, "klettern");
        }
    }

    public void kaempfen() throws KeineKraftException {
        if (getStaerkepunkte() >= 3) {
            setStaerkepunkte(getStaerkepunkte() - 3);
            System.out.println(getName() + "kämpft");
        } else {
            throw new KeineKraftException(name, "kämpfen");
        }
    }

    public String toString() {
        String Spielfigur = "\nname \t" + name;
        Spielfigur += "\nStaerkepunkte \t" + staerkepunkte;
        return Spielfigur;
    }
}

