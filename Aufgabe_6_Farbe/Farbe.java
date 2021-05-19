
/**
 * Aufgabe Nr 6: Farbe
 * Diese Klasse enthält zwei Methoden invertiere und gibNaechsteFarbe
 * die erste invertiert den eingegebenen Farbcode, die zweite berechnet den
 * nächsten Farbcode.
 * @author Lukas
 */
public class Farbe {
    /**
     * In dieser Methode werden die Testfälle definiert und die Ergebnise 
     * ausgegeben.
     * @param args 
     */
    public static void main(String[] args) {
        /**
         * Testfälle zur Überprüfung der Aufgabe:
         */
        System.out.println("Invertiere 255,255,255:");
        System.out.println("Ausgabe: " + invertiere(255255255));
        System.out.println("Invertiere 0,0,0:");
        System.out.println("Ausgabe: " + invertiere(0));
        System.out.println("Invertiere 10,128,255:");
        System.out.println("Ausgabe: " + invertiere(10128255));
        System.out.println("Invertiere 255,255,0:");
        System.out.println("Ausgabe: " + invertiere(255255));
        System.out.println("");
        
        System.out.println("Nächste Farbe zu 10,11,12 berechnen:");
        System.out.println("Ausgabe: " + gibNaechsteFarbe(10011012));
        System.out.println("Nächste Farbe zu 10,128,255 berechnen:");
        System.out.println("Ausgabe: " + gibNaechsteFarbe(100128255));
        System.out.println("Nächste Farbe zu 0,255,255 berechnen:");
        System.out.println("Ausgabe: " + gibNaechsteFarbe(255255));
        System.out.println("Nächste Farbe zu 255,255,255 berechnen:");
        System.out.println("Ausgabe: " + gibNaechsteFarbe(255255255));
        System.out.println("Nächste Farbe zu 100,128,255 berechnen:");
        System.out.println("Ausgabe: " + gibNaechsteFarbe(100128255));
         
    }
    
    /**
     * Diese Methode invertiert die eingegebene Zahl.
     * @param farbcode Farbcode der invertiert werden soll
     * @return gibt den neuen Farbcode zurück
     */
    public static int invertiere(int farbcode) {
        return 255255255 - farbcode;
    }
    
    /**
     * Diese Methode berechnet den nächsten Farbcode.
     * @param farbcode start Farbcode
     * @return gibt den neuen Farbcode zurück
     */
    public static int gibNaechsteFarbe(int farbcode) {
        int blau = farbcode % 1000;
        blau = blau + 1;
        int uebertrag = blau / 256;
        blau = blau % 256;
        
        int gelb = (farbcode / 1000) % 1000;
        gelb = gelb + uebertrag;
        uebertrag = gelb / 256;
        gelb = gelb % 256;        
        
        int rot = farbcode / 1000000;
        rot = rot + uebertrag;
        rot = rot % 256;
        
        return (rot * 1000000 + gelb * 1000 + blau);
    }
}
