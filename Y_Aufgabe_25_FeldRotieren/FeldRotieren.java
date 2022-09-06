/**
 * Aufgabe Nr. 25: FeldRotieren
 * Diese Klasse verschieb Komponenten einer Array um eine eingegebene Schrittweite
 * @author Lukas
 */
public class FeldRotieren {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        int[] test = {7,4,2,5,10,-3,19};
        rotiere(test, 3);
        // Ausgabe des Arrays
        for(int j = 0; j < test.length; j++) {
            System.out.println(test[j]);
        }      
    }
    
    // Methode zum Verschieben der Eingebenn Array Komponeten um den Schrittwert
    public static void rotiere(int[] feld, int schrittweite) {
        // Erstellung eines neuen Leeren Arrays 
        int[] neuesFeld = new int [feld.length];
        // Berechnung des Wertes für den Verschiebe Vorgang
        while (schrittweite >= feld.length) {
            schrittweite = schrittweite - feld.length;
        }
        
        // Schleife für die berechnung der neuen Position jedes Wertes
        for(int i = 0; i <= feld.length-1; i++) {            
            // Je nach größe der Schrittweite müssen die Werte Verschoben werden
            if(i < schrittweite) {
                 neuesFeld[i] = feld[feld.length - schrittweite + i];
            } else {
                neuesFeld[i] = feld[i - schrittweite];
            }
        }
        // Die Werte des neuen Arrays werden in das Eingabe Array überführt
        for(int i = 0; i < feld.length; i++) {
            feld[i] = neuesFeld[i];
        }              
        
    }
}
