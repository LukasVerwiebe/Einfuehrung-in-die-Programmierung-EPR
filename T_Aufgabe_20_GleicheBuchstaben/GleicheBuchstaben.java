/**
 * Aufgabe Nr. 20: Gleiche Buchstaben
 * Klasse die das Längste Konstante Stück eines Strings wiedergibt
 * @author Lukas
 */
public class GleicheBuchstaben {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println(gibLaengstesKonstantesStueck("AAAABBCCDDDDDDDDDeeeeeAeeeeee"));
    }
    // Methode zum Zählen der Textstellen
    public static String gibLaengstesKonstantesStueck(String text) {
        String zwischenwert = "";
        for (int i = 0; i < text.length(); i++) {
            int lastEqual = i;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    lastEqual = j;
                } else {
                    j = text.length() + 10;
                }
            }
            if (text.substring(i, lastEqual + 1).length()
                    > zwischenwert.length()) {
                zwischenwert = text.substring(i, lastEqual + 1);
            }
        }
        
        return zwischenwert;
    }   
}
