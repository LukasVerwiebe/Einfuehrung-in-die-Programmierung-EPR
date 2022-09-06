/**
 * Aufgabe Nr. 23: Texttrenner
 * @author Lukas
 */
public class TexttrennerTest {
    // Methode für die Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {        
       Texttrenner test = new Texttrenner("--xx+--yy--abc--", "+-");
    
       System.out.println(test.gibNaechstesWort()); 
       System.out.println(test.gibNaechstesWort());
       System.out.println(test.gibNaechstesWort());
       System.out.println(test.gibNaechstesWort());
       
       System.out.println(test.hatNochWoerter()); 
    }
    
}
