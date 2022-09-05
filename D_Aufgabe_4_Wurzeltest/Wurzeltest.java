
/**
 * Aufgabe Nr 4: Wurzeltest
 * Diese Klasse beinhaltet eine Methode, die genau dann true liefert, wenn
 * der erste Parameter der Methode die Wurzel des zweiten ist.
 * @author Lukas
 */
public class Wurzeltest {
    
    /**
     * In dieser Methode werden die Testfälle definiert und die Ergebnise 
     * ausgegeben.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        /**
         * Testfälle zur Überprüfung der Aufgabe:
         */
        System.out.println("Werte: 2 und 4: " + istWurzel(2, 4));
        System.out.println("Werte: 5 und 4: " + istWurzel(5, 4));
        System.out.println("Werte: 3 und 9: " + istWurzel(3, 9));
        System.out.println("Werte: 1000 und 1000_000: " 
                + istWurzel(1000, 1000_000));
        System.out.println("Werte: 2000 und 2200_000: " 
                + istWurzel(2000, 2200_000));
        System.out.println("Werte: 10000 und 100_000_000: " 
                + istWurzel(10000, 100_000_000));
    }
    
    /**
     * Diese Methode prüft ob der erste Parameter die Wurzel des zweiten ist.
     * Die Methode arbeitet nur mit Ganzen Zahlen 
     * @param wurzelWert möglicher Wurzel Wert des zweiten Parameters
     * @param pruefWert Wert dessen möglicher Wurzel Wert geprüft wird
     * @return gibt ture oder false zurück
     */
    public static boolean istWurzel(int wurzelWert, long pruefWert) {
        return (pruefWert / wurzelWert == wurzelWert);
    }
    
}
