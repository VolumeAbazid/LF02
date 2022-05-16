class Programm {

    public static void main(String[] args) {

        // businessobjects.buisnessobjects.Ware anlegen.

        Ware ware = new Ware("Laptop", 650.0);
        ware.setBeschreibung("Super krasses Gaming-ZIP");
        ware.getBesonderheitenListe().add("Tasche");
        ware.getBesonderheitenListe().add("Gaming-Maus");
        ware.getMaengelListe().add("Ladekabel fehlt");
        ware.getMaengelListe().add("Touchpad defekt");

        // Käufer anlegen.

        Vertragspartner kaeufer = new Vertragspartner("Abdullah", "Alshabb");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        // Verkäufer anlegen.

        Vertragspartner verkaeufer = new Vertragspartner("Azam", "Al Ali");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Zip", "7", "28195", "Bremen"));

        // businessobjects.buisnessobjects.Kaufvertrag anlegen.

        Kaufvertrag kaufvertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        kaufvertrag.setZahlungsModalitaeten("Bank überweisung");

        // businessobjects.buisnessobjects.Kaufvertrag ausgeben.

        System.out.println(kaufvertrag);

    }

}
