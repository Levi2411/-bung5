public class Brot extends Speise {
    
    private String brotart;
    
    public Brot(int nummer, int menge) { // Klasse mit nur einem Parameter nicht moeglich Eingabe ist doch: new Brot(1, 750); , also mit 2 verschiedenen Integern
        super("Brot", menge); // "brot wird gebraucht fuer name in der Klasse Lebensmittel"

        if (nummer == 0) {
            brotart = "Weissbrot";
        }
        else if (nummer == 1) {
            brotart = "Schwarzbrot";
        }
        else if (nummer == 2) {
            brotart = "Mischbrot";
        }
        else {
            brotart = "Spezialbrot";
        }
    }

    public boolean trinken() {
        return false;
    }

    public boolean essen() {
        if(menge <= 49) { // falls konsumierende Menge groesser als verfuegbare Menge ist, wird 0 als neue Menge festgelegt und false ausgegeben (wie in der Aufgabe gewollt)
            menge = 0;
            return false;
        }
        else {
            menge = menge - 50;
            return true;
        }
    }

    public String toString() {
        return "Brot (" + brotart + ", " + menge + " g)";
    }
}
