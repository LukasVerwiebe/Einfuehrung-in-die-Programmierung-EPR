/**
 * Aufgabe Nr. 1: Umrechnungen
 * In dieser Aufgabe geht es darum, Ausdrücke zu bilden, die bestimmte 
 * Berechnungen durchführen.
 * @author Lukas
 */
public class Umrechnungen {
    
    /**
     * Diese Methode wird dafür verwendet um die Ausdrücke auszugeben.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        
        /**
         * Aufgabe 1: Temperatur umrechnen
         * Umrechnung der Temperatur von Grad Fahrenheit in Grad Celsius.
         */
        System.out.println("Celsius 1: " + (int) ((5.0 / 9.0) * (40.0 - 32.0)));
        System.out.println("Celsius 2: " + (int) ((5.0 / 9.0) * (41.0 - 32.0)));
        System.out.println("");
        
        /**
         * Aufgabe 2: Wechselkurs Umrechnung
         * Umrechnung von Schweizerfranken in Euro.
         */
        System.out.println("EUR 1: " + (int) (100 / 1.1401));
        System.out.println("EUR 1: " + (int) (10000 / 1.1401));
        System.out.println("");
        
        /**
         * Aufgabe 3: Zeit Umrechnen
         * Umrechnung von Minuten in volle Stunden.
         */
        System.out.println("Zeit 1: " + ((5 / 60) * 100 + (5 % 60)));
        System.out.println("Zeit 2: " + ((59 / 60) * 100 + (59 % 60)));
        System.out.println("Zeit 3: " + ((60 / 60) * 100 + (60 % 60)));
        System.out.println("Zeit 4: " + ((61 / 60) * 100 + (61 % 60)));
        System.out.println("Zeit 5: " + ((825 / 60) * 100 + (825 % 60)));
        
    }
    
}
