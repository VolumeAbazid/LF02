public class Adresse {
    private String straße;
    private String hausNr;
    private String plz;
    private String ort;

    public Adresse(String straße, String hausNr, String plz , String ort){
        this.straße = straße;
        this.hausNr = hausNr;
        this.plz = hausNr;
        this.ort = ort;

    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "straße='" + straße + '\'' +
                ", hausNr='" + hausNr + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}

