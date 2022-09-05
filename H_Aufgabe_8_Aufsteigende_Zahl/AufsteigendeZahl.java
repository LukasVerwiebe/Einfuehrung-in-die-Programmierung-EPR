
/**
 * Aufgabe Nr 8: Aufsteigende Zahl
 * Diese Klasse beinhaltet eine Methode, welche für eine Zahl angibt, 
 * ob die Ziffernfolge aufsteigend ist.
 * @author Lukas
 */
public class AufsteigendeZahl {    
    /**
     * In dieser Methode werden die Testfälle definiert und die Ergebnise 
     * ausgegeben.
     * @param args wird nicht verwendet 
     */
    public static void main(String[] args) {
        /**
         * Testfälle zur Überprüfung der Aufgabe:
         */ 
        System.out.println("Zahl 123456 Ergebnis: " 
                + istAufsteigend(123456));
        System.out.println("Zahl 654321 Ergebnis: " 
                + istAufsteigend(654321));
        System.out.println("Zahl 123344 Ergebnis: " 
                + istAufsteigend(123344));
        System.out.println("Zahl 1232344 Ergebnis: " 
                + istAufsteigend(1232344));
        System.out.println("Zahl 912345678 Ergebnis: " 
                + istAufsteigend(912345678));
    }
    
    /**
     * Diese Methode prüft ob die Ziffernfolge einer Zahl aufsteigend ist,
     * die Methode wurde dabei rekursiv realisiert.
     * @param zahl Die ZAhl dessen Ziffern geprüft werden
     * @return gibt an ob die Ziffern aufsteigend sind
     */
    public static boolean istAufsteigend(int zahl) {
        return (zahl > 0) 
                ? ((zahl % 10) >= ((zahl / 10) % 10))
                    ? istAufsteigend(zahl / 10)
                    : false 
                : true;
    }
    
}
