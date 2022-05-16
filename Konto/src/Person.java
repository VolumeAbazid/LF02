public abstract class  Person {

    private String name;
    private String nachname;
    private Adresse adresse;

    public Person(String name, String nachname, Mitarbeiter adresse){
        this.name = name;
        this.nachname = nachname;
        this.adresse = adresse;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nachname='" + nachname + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
