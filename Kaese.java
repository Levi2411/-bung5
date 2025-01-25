public class Kaese extends Speise {
    public Kaese(String name, int menge) {
        super(name, menge);
    }

    public boolean trinken() {
        return false;
    }

    public boolean essen() {
        if(menge <= 19) { // falls konsumierende Menge groesser als verfuegbare Menge ist, wird 0 als neue Menge festgelegt und false ausgegeben (wie in der Aufgabe gewollt)
            menge = 0;
            return false;
        }
        else {
            menge = menge - 20;
            return true;
        }
    }

    public String toString() {
        return "Kaese (" + name + ", " + menge + " g)";
    }
}
