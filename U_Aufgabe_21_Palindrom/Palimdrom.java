/**
 * Aufgabe Nr. 21: Palindrom
 * Klasse für die Überprüfung ob es sich bei einem String um ein Palindrom handelt
 * @author Lukas
 */
public class Palimdrom {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println(istPalimdrom("anna"));
        System.out.println(istPalimdrom("Anna"));
        System.out.println(istPalimdrom("reger"));
        System.out.println(istPalimdrom("012345678-876543210"));       
    }
    // Methode zur Prüfung des Strings
    public static boolean istPalimdrom(String text) {
        boolean ergebnis = false;
        int j = text.length() - 1;
        
        for(int i = 0; i < text.length(); i++) {
            char textStück1 = text.charAt(i);
            char textStück2 = text.charAt(j);
            j = j - 1;            
            if(textStück1 == textStück2) {
                ergebnis = true;
            } else {
                ergebnis = false;
                i = text.length() + 10;
            }
        }
        
        return ergebnis;
    }
    
}
