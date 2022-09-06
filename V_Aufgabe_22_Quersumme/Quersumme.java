/**
 * Aufgabe Nr. 22: Quersumme
 * Klasse zur Berechnung der Quersumme einer Zahl
 * @author Lukas
 */
public class Quersumme {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println(quersumme(123));
        System.out.println(quersumme(1234));
    }
    // Methode zur Berechnung der Quersumme
    public static int quersumme(int zahl) {
        // Speicher für die Quersumme
        int ergebnis = 0;
        // Speicher für den Zwischenwert der Berechnung
        int zwischenwert;
        
        while(zahl > 0) {
            // Herauslösen einer Ziffern
            zwischenwert = zahl % 10;
            // Verkleinern der Zahl um eine Ziffer
            zahl = zahl / 10;
            // Der Zwischenwert wird addiert
            ergebnis = ergebnis + zwischenwert;
        }        
        return ergebnis;
    }
}
