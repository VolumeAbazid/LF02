import businessObjects.Vertragspartner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RedCSV {
    public static void main(String[] args) throws IOException {

        File myObj = new File("H:/Lf02/Kaufvertrag.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(myObj));

        String zeile;

        while ((zeile = bufferedReader.readLine()) != null){
            String[] datensatz = zeile.split(";");

            if (datensatz[0].equalsIgnoreCase("käufer")){
                String[] name = datensatz[1].split(",");
                Vertragspartner keaufer = new Vertragspartner(name[1],name[0]);

                String[] ausweis = datensatz[2].split(";");
                keaufer.setAusweisNr(ausweis[0]);



                //Adresse

                String[] strasseHasuNr = datensatz[3].split(" ");
                String hasuNr = strasseHasuNr[strasseHasuNr.length - 1];
                String strasse = " ";



                for (int i = 0; i < strasseHasuNr.length - 1;i++){
                    strasse += strasseHasuNr[i] + " ";

                }
                String plz = datensatz[4];
                String ort = datensatz[5];
                Adresse adresse = new Adresse(strasse,hasuNr,plz,ort);
                keaufer.setAdresse(adresse);

                System.out.println(keaufer);
                System.out.println();
                System.out.println();

            }
            else if (datensatz[0].equalsIgnoreCase("verkäufer")){
                String[] name = datensatz[1].split(",");
                Vertragspartner verkaufer = new Vertragspartner(name[1],name[0]);
                String[] ausweis = datensatz[2].split(";");
                verkaufer.setAusweisNr(ausweis[0]);



                //Adresse

                String[] strasseHasuNr = datensatz[3].split(" ");
                String hasuNr = strasseHasuNr[strasseHasuNr.length - 1];
                String strasse = " ";

                for (int i = 0; i < strasseHasuNr.length - 1;i++){
                    strasse += strasseHasuNr[i] + " ";

                }

                strasse = strasse.trim();
                String plz = datensatz[4];
                String ort = datensatz[5];
                Adresse adresse1 = new Adresse(strasse,hasuNr,plz,ort);

                verkaufer.setAdresse(adresse1);
                System.out.println(verkaufer);

            }

        }

    }

}

