package schrit1;

import Schritt2.Torwart;

public class programm {
    public static void main(String[] args) {
        Trainer Mujes = new Trainer("Mujes" ,48, 8 );
        System.out.println(Mujes);

        System.out.println("=====================================");

        Spieler hamdi = new Spieler("Hamid", 23 ,4, 10, 10, 7);
        System.out.println(hamdi);

        System.out.println("======================================");

        Torwart Jabur = new Torwart("Jabur" ,55, 6, 10 ,3);
        System.out.println(Jabur);
    }

    
}
