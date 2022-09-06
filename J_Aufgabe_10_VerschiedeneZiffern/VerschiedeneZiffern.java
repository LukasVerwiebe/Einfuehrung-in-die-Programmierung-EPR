/**
 * Aufgabe Nr. 10: VerschiedeneZiffern
 * Diese Klasse zählt die verschiedenen Ziffern in Integer Wert
 * @author Lukas
 */
public class VerschiedeneZiffern {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println(anzahlZiffern(12345));
        System.out.println(anzahlZiffern(1123));
        System.out.println(anzahlZiffern(112233545));        
    }
    // Diese Methode gibt den Integer Wert und einen Initialwert weiter
    public static int anzahlZiffern(int wievieleZiffern) {
         return (anzahlZiffern(wievieleZiffern, 0)); 
    }
    // Diese Methode gibt die Anzahl der verschiedenen Ziffern wieder
    public static int anzahlZiffern(long zahl, int verschiedeneZiffern) { 
         return (zahl < 10) 
                 ? verschiedeneZiffern + 1 
                 : enthaelt(zahl / 10, (int) zahl % 10) 
                    ? anzahlZiffern(zahl / 10, verschiedeneZiffern) 
                    : anzahlZiffern(zahl / 10, verschiedeneZiffern + 1);                                          
    }
    // Diese Methode prüft ob die Ziffer berteits enthalten ist
    public static boolean enthaelt(long zahl, int ziffer) { 
        return (zahl < 10) 
                ? zahl == ziffer 
                : zahl % 10 == ziffer 
                    ? true 
                    : enthaelt(zahl / 10, ziffer);   
    }    
}
