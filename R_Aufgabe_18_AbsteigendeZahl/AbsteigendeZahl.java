/**
 * Aufgabe Nr. 18: Absteigende Zahl
 * Klasse 
 * @author Lukas
 */
public class AbsteigendeZahl {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println(istAbsteigend(54321));
        System.out.println(istAbsteigend(123456));
    }
    // Methode zur Prüfung ob eine Zahl Absteigend ist oder nicht
    public static boolean istAbsteigend(int zahl) {
        boolean ergebnis = false;
        int zwischenWert1;
        int zwischenWert2;
        // Pürfung der Zhalenfolge
        while(zahl > 0) {
            zwischenWert1 = zahl % 10;
            zahl = zahl / 10;
            zwischenWert2 = zahl % 10;
            // Rückgabe ob Absteigend oder nicht
            if(zwischenWert1 <= zwischenWert2) {
                ergebnis = true;
                zahl = 0;
            } else {
                ergebnis = false;                
            }
        }
        
        return ergebnis;
    }
}
