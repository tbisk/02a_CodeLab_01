public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

    ausgabe("Kontostand von Konto 1: " + konto1.kontostandBeginn());


    }


    public static void ausgabe(String output) {
        System.out.println(output);  
      }


}
