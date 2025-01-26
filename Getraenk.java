public class Getraenk extends Lebensmittel { // Klasse kann man eigentlich weg lassen fuer die Funktionalitaet, ist bloss wegen der Aufgabe implementiert
    public Getraenk(String name, int menge) {
        super(name, menge);
    }

    public Getraenk(String name) {
        super(name);
    }

    @Override
    public boolean essen() {
        return false;
    }

    @Override
    public boolean trinken() {
        return true;
    }
}
