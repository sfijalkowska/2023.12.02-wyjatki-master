package pl.camp.it.wyjatki;

public class App {
    public static void main(String[] args) {
        /*metoda();
        try {
            sprawdzanieLoginu("cos");
        } catch (JakisMojWyjatek e) {

        }*/


        try {
            jakasMetoda();
        } catch (NullPointerException |
                 ArrayIndexOutOfBoundsException |
                 JakisMojWyjatek e) {
            System.out.println("cos sie zepsulo !!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Koniec programu !!!");
    }

    public static void metoda() {
        int[] tab = new int[5];
        tab[10] = 15;
    }

    public static void sprawdzanieLoginu(String login)
            throws JakisMojWyjatek {
        if(login.startsWith("X")) {
            throw new JakisMojWyjatek();
        }
    }

    public static void jakasMetoda() throws JakisMojWyjatek {
        sprawdzanieLoginu("XYZ");
    }
}
