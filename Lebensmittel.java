public abstract class Lebensmittel 
{
    protected final String name;
    protected int menge; // in Milliliter bzw. Gramm

    public Lebensmittel(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }
    
    public Lebensmittel(String name) { // wird fuer Mate gebraucht, da dort nur ein Name eingegeben werden soll
        this.name = name;
    }

    public abstract boolean essen();

    public abstract boolean trinken();


    public String toString() {
        return "Lebensmittel";
    }
}