
/**
 * Aufgabe Nr 5: Prozentuale Erhöhung
 * Diese Klasse enthält eine Methode, die einen Betrag (1 Parameter) um einen
 * bestimmten Prozentsatz (2 Parameter) erhöht.
 * @author Lukas
 */
public class ProzentualeErhoehung {    
    /**
     * In dieser Methode werden die Testfälle definiert und die Ergebnise 
     * ausgegeben.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {        
        /**
         * Testfälle zur Überprüfung der Aufgabe:
         */
        System.out.println("Betrag 5.0 Erhöhung um 50%: " 
                + erhoeheBetrag(5.0f, 50));
        System.out.println("Betrag 5.0 Erhöhung um 5%: " 
                + erhoeheBetrag(5.0f, 5));
        System.out.println("Betrag 10 Erhöhung um 100%: " 
                + erhoeheBetrag(10.0f, 100));
        System.out.println("Betrag 15.5 Erhöhung um 100%: " 
                + erhoeheBetrag(15.5f, 100));
        System.out.println("Betrag 11.5 Erhöhung um 30%: " 
                + erhoeheBetrag(11.5f, 30));
        System.out.println("Betrag 11.3 Erhöhung um 30%: " 
                + erhoeheBetrag(11.3f, 30));
    }
    
    /**
     * Diese Methode erhöht den Betrag des ersten Paramters um einen Prozentsatz
     * der im zweiten Parameter festgelegt wurde, das Ergbenis wird auf zwei 
     * Nachkommastellen gerundet.
     * @param betrag Wert der erhöht werden soll
     * @param prozentsatz Prozentsatz um den der Betrag erhöht werden soll
     * @return gibt die um den Prozentsatz erhöhte Zahl gerundet zurück
     */
    public static float erhoeheBetrag(float betrag, int prozentsatz) {
        // Berechnung des erhöhten Betrags:
        float ergebnis = (betrag + (betrag / 100 * prozentsatz));
        // Rückgabe und Rundung des Betrags auf zwei Nachkommastellen:
        return  (int) ((ergebnis * 100) + 0.5f) / 100.0f;
    }
    
}
