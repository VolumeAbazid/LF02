public class Programm {
    public static void main(String[] args) {
        Banane banane = new Banane();

        //Bannane.setName();
        banane.setGewicht(60);
        banane.setZuckerInhalt(20);
        banane.setJahreszeit("sommer");
        banane.setKrummung(90);

        System.out.println( "Name " +  banane.getName());
        System.out.println("Gewicht " +  banane.getGewicht() + "g");
        System.out.println( "Zuckerinhalt " + banane.getzuckerInhalt() + "mg");
        System.out.println( "Jahreszeit " + banane.getJahreszeit());

        System.out.println("====================================================== ");

        Apfel apfel = new Apfel();
        System.out.println(apfel.getName());
        System.out.println(apfel.getKrummung());


    }
}
