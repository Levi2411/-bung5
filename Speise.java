public class Speise extends Lebensmittel { // Klasse kann man eigentlich weg lassen fuer die Funktionalitaet, ist bloss wegen der Aufgabe implementiert
    
    public Speise(String name, int menge) {
        super(name, menge);
    }

    @Override
    public boolean essen() {
        return true;
    }

    @Override
    public boolean trinken() {
        return false;
    }
}
