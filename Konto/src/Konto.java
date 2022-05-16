public class Konto {

    private Kunde inhaber;
    private double kontostand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto( Kunde inhaber, double kontostand, double kreditLimit, double zinsGuthaben){
        this.inhaber = inhaber;
        this.kontostand = kontostand;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public boolean einzahlen(double betrag){
        this.kontostand += betrag;
        return false;
    }

    public boolean auszahlen(double betrag){
        if (kontostand + kreditLimit>=betrag){
            kontostand=kontostand-betrag;
            return false;
        }else{
            return false;
        }
    }


}
