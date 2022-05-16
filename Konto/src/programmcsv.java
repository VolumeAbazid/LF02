import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class programmcsv {




    public static void main(String[] args) throws FileNotFoundException {
        Kaufvertrag kaufvertrag = erstelleKaufvertrag();
        writcsv(kaufvertrag);
    }

    public static Kaufvertrag erstelleKaufvertrag(){

        // Verkäufer Daten
        Vertragspartner verkaefer = new Vertragspartner("Heinz" , "Meier");
        Adresse adresse1 = new Adresse("Am Brill", "22", "282911" , "Bremen");
        verkaefer.setAdresse(adresse1);
        verkaefer.setAusweisNr("029374678655");


        // Käufer Daten
        Vertragspartner kaefer1 = new Vertragspartner("Ali" , "Haji");
        Adresse adresse2 = new Adresse("Amwall", "134", "282911", "Bremen");
        kaefer1.setAdresse(adresse2);
        kaefer1.setAusweisNr("09345382354");

        // Ware Infos
        Ware ware = new Ware("TiZZ",234 );
        ware.getBesonderheiten("Rundig, Geil");
        ware.getMaengel("keine");

        // Vertrag Verlauf
        Kaufvertrag kaufvertrag = new Kaufvertrag(kaefer1, verkaefer, ware);
        kaufvertrag.setZahlungsModalitaeten("Mit Karte");
        return kaufvertrag;



    }


    public static void writcsv(Kaufvertrag kaufvertrag) throws FileNotFoundException{
        // Speicherung die Infos
        String datei = "H:/Lf02/Kaufvertrag.csv";
        PrintWriter printWriter = new PrintWriter(datei);

        printWriter.print("Vertragsparntner;");

        printWriter.print("Name;");

        printWriter.print("Straße;");

        printWriter.print("PLZ;");

        printWriter.print("Ort;");

        printWriter.println("AusweissNr");
        // Programmierung der Verlauf von Typ verkäufer
        printWriter.print("Verkaeufer;");

        printWriter.print(kaufvertrag.getVerkaefer().getNachname() + "," + kaufvertrag.getVerkaefer().getVorname() + ";");

        printWriter.print(kaufvertrag.getVerkaefer().getAdresse().getStraße() + "," + kaufvertrag.getVerkaefer().getAdresse().getHausNr() + ";");

        printWriter.print(kaufvertrag.getVerkaefer().getAdresse().getPlz() + ";");

        printWriter.print(kaufvertrag.getVerkaefer().getAdresse().getOrt() + ";");

        printWriter.println(kaufvertrag.getVerkaefer().getAusweisNr());



        printWriter.print("Kaeufer;");

        printWriter.print(kaufvertrag.getKaefer().getNachname() + "," + kaufvertrag.getKaefer().getVorname() + ";");

        printWriter.print(kaufvertrag.getKaefer().getAdresse().getStraße() + "," + kaufvertrag.getKaefer().getAdresse().getHausNr() + ";");

        printWriter.print(kaufvertrag.getKaefer().getAdresse().getPlz() + ";");

        printWriter.print(kaufvertrag.getKaefer().getAdresse().getOrt() + ";");

        printWriter.println(kaufvertrag.getKaefer().getAusweisNr());
        printWriter.close();
    }


}


