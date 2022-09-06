/**
 * Aufgabe Nr. 16: Farbe objekt-orientiert
 * Diese Klasse gibt Farben als RGB-Farben aus
 * @author Lukas
 */
public class Farbe {   
    // Initialisierung der Variablen
    private final int rot;    
    private final int gruen;     
    private final int blau;
    
    // Methode zur Zuweisung der Farben
    public Farbe(int rot, int gruen, int blau){
        this.rot = rot;
        this.gruen = gruen;
        this.blau = blau;
    }
    
    // Test Methode: Wird nicht verwendet
    public void ausgabe(){
        System.out.print(this.rot + " ");
        System.out.print(this.gruen + " ");
        System.out.print(this.blau);
        System.out.println("");
    }
    
    // Methode zum Invertieren der Einbgabenen Farbe
    public int gibInvertiereFarbe(){
        int rot = this.rot;
        int gruen = this.gruen;
        int blau = this.blau;
        
        rot = 255 - rot;
        gruen = 255 - gruen;
        blau = 255 - blau;
        
        return (rot * 1000000 + gruen * 1000 + blau);
    }
    
    // Methode zur Ausgabe der nächsten Farbe
    public int gibNaechsteFarbe(){
        int rot = this.rot;
        int gruen = this.gruen;
        int blau = this.blau;
        int uebertrag;        
        
        blau = blau + 1;
        uebertrag = blau / 256;
        blau = blau % 256;        
        
        gruen = gruen + uebertrag;
        uebertrag = gruen / 256;
        gruen = gruen % 256;       
        
        rot = rot + uebertrag;
        rot = rot % 256;
        
        return (rot * 1000000 + gruen * 1000 + blau);
    }
    
    // Methode für die Ausgabe der Farben als Text
    public String gibAlsText() {
        String anzeige;
        anzeige = "(" + this.rot + ", " + this.gruen 
                + ", " + this.blau + ")";
        return anzeige;
    }   
    
    // Einagbe und Ausgabe von Testwerten
    public static void main(String[] args) {
        
        Farbe test1 = new Farbe(255, 255, 255);        
        Farbe test2 = new Farbe(0, 0, 0);        
        Farbe test3 = new Farbe(10, 128, 255);        
        Farbe test4 = new Farbe(10, 11, 12);       
        Farbe test5 = new Farbe(10, 128, 255);        
        Farbe test6 = new Farbe(0, 255, 255);
        
        System.out.println("Gib Invertierte Farbe: ");
        System.out.println(test2.gibInvertiereFarbe());
        System.out.println(test3.gibInvertiereFarbe());
        System.out.println(test6.gibInvertiereFarbe());
        
        System.out.println("Gib Nächste Farbe: ");
        System.out.println(test4.gibNaechsteFarbe());
        System.out.println(test5.gibNaechsteFarbe());
        System.out.println(test1.gibNaechsteFarbe());
        System.out.println(test6.gibNaechsteFarbe());
        
        System.out.println("Gib als Text: ");
        System.out.println(test1.gibAlsText());
        System.out.println(test2.gibAlsText());
        System.out.println(test3.gibAlsText());
        System.out.println(test4.gibAlsText());
        System.out.println(test5.gibAlsText());
        System.out.println(test6.gibAlsText());        
    }    
}
