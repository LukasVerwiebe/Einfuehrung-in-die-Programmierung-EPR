
/**
 * Aufgabe Nr 7: Binärdarstellung
 * In dieser Klasse wurde eine Methode realisiert welche eine Binärzahl
 * in die passende Dezimalzahl umwandelt.
 * @author Lukas
 */
public class Binaerdarstellung {
    
    /**
     * In dieser Methode werden die Testfälle definiert und die Ergebnise 
     * ausgegeben.
     * @param args wird nicht verwendet 
     */
    public static void main(String[] args) {
        /**
         * Testfälle zur Überprüfung der Aufgabe:
         */
        System.out.println("Binär 0; Dezimal: " + gibWertVonBinaer(0));
        System.out.println("Binär 10; Dezimal: " + gibWertVonBinaer(10));
        System.out.println("Binär 1101; Dezimal: " + gibWertVonBinaer(1101));
        System.out.println("Binär 10001101; Dezimal: " 
                + gibWertVonBinaer(10001101));
        
    }
    
    /**
     * Diese Methode wandelt eine Binärzahl in die passende Dezimalzahl um,
     * die Methode wurde dabei rekursiv realisiert.
     * @param binaerdarstellung Binärzahl die umgerechnet werden soll
     * @return gibt die umgewandelte Dezimal Zahl wieder
     */
    public static int gibWertVonBinaer(long binaerdarstellung) {
        return (int) ((binaerdarstellung > 0) 
                ? (binaerdarstellung % 10) 
                    + gibWertVonBinaer(binaerdarstellung / 10) * 2 
                : 0);
    }
    
}
