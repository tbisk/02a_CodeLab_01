public class Konto {

    public int kontostand = 10000;

    Konto(int kontostand){
        this.kontostand = kontostand;
    }

    public void kontostandBeginn(int kontostand) {
        this.kontostand = kontostand;
    }

    public int kontostandSetzen(int kontostand){
        return this.kontostand;
    }

  
}
