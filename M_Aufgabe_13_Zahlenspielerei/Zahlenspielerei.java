/**
 * Aufgabe Nr. 13: Zahlenspielerei
 * Diese Klasse führt unterschiedliche Operationen aus:
 * - Zahlen verketten
 * - Prüfen ob Zahl enthalten
 * - Anzahl einer Ziffer in einer Zahl
 * - Eine Ziffer aus einer Zahl entfernen
 * @author Lukas
 */
public class Zahlenspielerei {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println("Verkette: ");
        System.out.println(verkette(4711, 1));
        System.out.println(verkette(521, 0));
        System.out.println(verkette(521, 1320));
        System.out.println(verkette(0, 521));
        System.out.println(verkette(0, 0));
        
        System.out.println("Enthält: ");
        System.out.println(enthaelt(4711 , 1));
        System.out.println(enthaelt(4711 , 2));
        System.out.println(enthaelt(789 , 9));
        System.out.println(enthaelt(0 , 0));
        
        System.out.println("Anzahl: ");
        System.out.println(gibAnzahl(4711 , 1));
        System.out.println(gibAnzahl(4711 , 2));
        System.out.println(gibAnzahl(789 , 9));
        System.out.println(gibAnzahl(0 , 0));
        
        System.out.println("Filter: ");
        System.out.println(filter(1332, 3));
        System.out.println(filter(3333, 3));
        System.out.println(filter(1332, 4));
        System.out.println(filter(1000, 0));
        System.out.println(filter(1, 1));
        System.out.println(filter(0, 0));
        System.out.println(filter(0, 5));
        
        System.out.println(filter(4171, 1));      
        
    }
    // Methode um Zahlen zu verketten
    public static long verkette(long zahl1, long zahl2) {
        return zahl2 < 10
                ? zahl1 * 10 + zahl2
                : verkette(zahl1, zahl2 / 10) * 10 + zahl2 % 10;
    }
    // Methode für die Überprüfung ob eine Ziffer in einer Zahl enthalten ist
    public static boolean enthaelt(long zahl, int ziffer) {
        return (ziffer > 0) 
                ? (zahl % 10 == ziffer)
                : false 
                    ? enthaelt(zahl / 10, ziffer) 
                    : true;
    }
    // Methode zur Angabe der häufigkeit einer Ziffer
    public static int gibAnzahl(long zahl, int ziffer) {
        return zahl < 10
                ? zahl == ziffer
                    ? 1
                    : 0
                : zahl % 10 == ziffer
                    ? gibAnzahl(zahl / 10, ziffer) + 1
                    : gibAnzahl(zahl / 10, ziffer);
        
        
//        return (zahl == 0) 
//                ? 0
//                : (zahl % 10 == ziffer)
//                    ? gibAnzahl(zahl / 10, ziffer) + 1
//                    : 0;
    }
    // Filter Methode um eine Ziffer aus einer Zahl zu entfernen
    public static long filter(long zahl, int ziffer) {
        return (zahl < 10)
                ? (zahl == ziffer)
                    ? 0L
                    : zahl
                : zahl % 10 == ziffer
                    ? filter(zahl / 10, ziffer)
                    : filter(zahl / 10, ziffer) * 10L + zahl % 10;
    }
    
    public static int m(long a, int b, int c) {
        return b <= a
                ? m(a, 2 * b, c + 1)
                : c - 1;
    }
    
}
