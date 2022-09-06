/**
 * Aufgabe Nr. 12: Zahlendarstellung
 * Diese Klasse rechnet Zahlen in Binär und Dezimalzahlen um
 * @author Lukas
 */
public class Zahlendarstellung {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {        
        System.out.println("Soll-Ergebnis: 1100 Ist Ergebnis: "  
                + addiere(1001, 11, 2)); 
        System.out.println("Soll-Ergebnis: 101001 Ist Ergebnis: "  
                + addiere(11011, 1110, 2)); 
        System.out.println("Soll-Ergebnis: -1 Ist Ergebnis: "  
                + addiere(210, 11, 2)); 
        System.out.println("Soll-Ergebnis: 773 Ist Ergebnis: "  
                + addiere(773, 0, 8));
        System.out.println("Soll-Ergebnis: 107 Ist Ergebnis: "  
                + addiere(0, 107, 8)); 
        System.out.println("Soll-Ergebnis: 1102 Ist Ergebnis: "  
                + addiere(773, 107, 8)); 
        System.out.println("Soll-Ergebnis: -1 Ist Ergebnis: "  
                + addiere(773, 1239, 8)); 
        System.out.println("Soll-Ergebnis: -1 Ist Ergebnis: "  
                + addiere(950, 192, 8)); 
        System.out.println("Soll-Ergebnis: 10027 Ist Ergebnis: "  
                + addiere(9145, 882, 10)); 
        System.out.println("Soll-Ergebnis: 100000000000 Ist Ergebnis: "  
                + addiere(11111111111L, 1, 2)); 
        System.out.println("Soll-Ergebnis: 1122 Ist Ergebnis: "  
                + addiere(323, 133, 4));        
    }
    // Je nach Zahlensystem werden die Daten an eine passende Methode für die Berechnung weitergegeben
    public static long addiere(long linkeZahl, long rechteZahl, int basis) {
        return (gueltigeZahl(linkeZahl, basis) && gueltigeZahl(rechteZahl, basis)) 
                ? basisZahlensystem(gibDezimalWert(linkeZahl, basis) + gibDezimalWert(rechteZahl, basis), basis) 
                : -1; 
    }
    // Prüfung ob Gültige Zahl
    public static boolean gueltigeZahl(long zahl, int basis) { 
        return zahl < 10 
                ? zahl < basis 
                : zahl % 10 < basis 
                    ? gueltigeZahl(zahl / 10, basis) 
                    : false;  
    }
    // Methode für Dezimal Umrechnung
    public static long gibDezimalWert(long zahl, int basis) { 
        return (zahl < 10) 
                ? zahl 
                : gibDezimalWert(zahl / 10, basis) * basis + zahl % 10; 
    }
    // Umrechnung nach Zahlensystem
    public static long basisZahlensystem(long zahlenWert, long basis) { 
        return (zahlenWert == 0) 
                ? 0 
                : basisZahlensystem(zahlenWert / basis, basis) * 10 + zahlenWert % basis; 
    }
    
}
