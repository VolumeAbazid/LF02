public abstract class Obst {

    private String name;
    private int zuckerInhalt;
    private int gewicht;
    private String jahreszeit;

    public Obst ( String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJahreszeit(String jahreszeit) {
        this.jahreszeit = jahreszeit;
    }

    public String getJahreszeit(){
        return jahreszeit;
    }

    public int getGewicht(){
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getzuckerInhalt(){
        return zuckerInhalt;
    }

    public void setZuckerInhalt(int zuckerInhalt) {
        this.zuckerInhalt = zuckerInhalt;
    }
}
