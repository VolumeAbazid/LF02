public class  Schmuck extends Exception {

    private String bezeichnung;

    public Schmuck(int id, double wert, String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "Schmuck{" +
                "bezeichnung='" + bezeichnung + '\'' +
                '}';
    }
}
