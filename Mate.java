public class Mate extends Getraenk {
    public Mate(String name) {
        super(name);
        this.menge = 500; // immer eine Menge von 500 ml
    }

    public boolean trinken() {
        if(menge <= 99) { // falls konsumierende Menge groesser als verfuegbare Menge ist, wird 0 als neue Menge festgelegt und false ausgegeben (wie in der Aufgabe gewollt)
            menge = 0;
            return false;
        }
        else {
            menge = menge - 100;
            return true;
        }
    }

    public boolean essen() {
        return false;
    }

    public String toString() {
        return "Mate (" + name + ", " + menge + " ml)";
    }
}
