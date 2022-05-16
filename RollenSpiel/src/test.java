public class test {
    public static void main(String[] args) {
        Elfe UmAlshitan = new Elfe(" UmAlshitan ", 9);

        try {
            UmAlshitan.rennen();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }
        try {
            UmAlshitan.kaempfen();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }

        try {
            UmAlshitan.klettern();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());

        }
        try {
            UmAlshitan.laufen();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }

        try {
            UmAlshitan.laufen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        System.out.println(UmAlshitan);

        Zauberer dajal = new Zauberer(" dajal " ,10,1);
        try {
            dajal.laufen();
        } catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }

            dajal.essen();
        System.out.println(dajal);
    }



}
