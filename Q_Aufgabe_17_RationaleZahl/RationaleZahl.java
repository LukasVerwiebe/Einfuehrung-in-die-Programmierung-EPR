/**
 * Aufgabe Nr. 17: Rationale Zahl
 * @author Lukas
 */
public class RationaleZahl {
    
    private long zahl;
    private long zähler;
    private long nenner;    
    
    // Konstruktor für die Rationale Zahl
    public RationaleZahl(long zahl){
        this.zahl = zahl;        
    }
    
    // Konstruktor mit Quotienten und Nenner
    public RationaleZahl(long zähler, long nenner){
        this.zähler = zähler;
        this.nenner = nenner;
    }
    
    // Methode zum Addieren der Rationalen Zahl und einer Übergebenen Zahl
    public RationaleZahl addiere(RationaleZahl zahl) {
        long zähler1 = this.zähler;
        long nenner1 = this.nenner;
        
        long zähler2 = zahl.zähler;
        long nenner2 = zahl.nenner;
        
        long neuerZähler = zähler2 + nenner1;
        long neuerNenner = zähler1 * nenner2;
        
        return new RationaleZahl(neuerZähler, neuerNenner);
    }
    
    // Methode zur Ausgabe als Text
    public String gibAlsText(){
        long zahl = this.zahl;
        long zähler = this.zähler;
        long nenner = this.nenner;
        String ausgabe;
        if(zähler > 0 || nenner > 0) {
            ausgabe = "Rationale Zahl: " + zähler + "/" + nenner;
        } else {
            ausgabe = "Rationale Zahl: " + zahl;
        }
        return ausgabe;
    }       
}
