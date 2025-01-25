public class Wasser extends Getraenk {
    public Wasser(String name, int menge) {
        super(name, menge);
    }

    public boolean trinken() {
        if(menge <= 199) { // falls konsumierende Menge groesser als verfuegbare Menge ist, wird 0 als neue Menge festgelegt und false ausgegeben (wie in der Aufgabe gewollt)
            menge = 0;
            return false;
        }
        else {
            menge = menge - 200;
            return true;
        }
    }

    public boolean essen() {
        return false;
    }

    public String toString() {
        return "Wasser (" + name + ", " + menge + " ml)";
    }
}
