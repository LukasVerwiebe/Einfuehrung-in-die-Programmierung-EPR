
/**
 * Aufgabe Nr 2: Reiskörner
 * In dieser Aufgabe geht es darum, Berechnungen unter Verwendung von 
 * Variablen durchzuführen.
 * @author Lukas
 */
public class Reiskoerner {
    
    /**
     * In dieser Methode wird die Ausgabe der Werte realisiert.
     * @param args wird nicht verwendet
     */
    public static void main(String[] args) {
        
        /**
         * Initialisierung der zu verwendenen Variablen für die Berechnungen.
         */
        int koernerFeld1 = 0;
        int erhoehung = 0;
        int summe = 0;        
        /** 
         * Initialisierung der weiteren Felder.
         */
        int feld2 = 0;
        int feld3 = 0;
        int feld4 = 0;
        int feld5 = 0;
        int feld6 = 0;
        int feld7 = 0;
        int feld8 = 0;
        int feld9 = 0;
        
        
        /**
         * Festlegung der Start Werte für Situation 1.
         */
        koernerFeld1 = 1;
        erhoehung = 100;
        summe = 0;
        /**
         * Ausführung Situation 1.
         * Die Felder werden Prozentual um den festgelegten Wert erhöht.
         */        
        feld2 = koernerFeld1 + (int) (koernerFeld1 / 100.0 * erhoehung);        
        feld3 = feld2 + (int) (feld2 / 100.0 * erhoehung);        
        feld4 = feld3 + (int) (feld3 / 100.0 * erhoehung);        
        feld5 = feld4 + (int) (feld4 / 100.0 * erhoehung);        
        feld6 = feld5 + (int) (feld5 / 100.0 * erhoehung);        
        feld7 = feld6 + (int) (feld6 / 100.0 * erhoehung);        
        feld8 = feld7 + (int) (feld7 / 100.0 * erhoehung);           
        /**
         * Ausführung Situation 1.
         * Die Summe wird zusammengerechnet.
         */
        summe = summe + koernerFeld1;
        summe = summe + feld2;
        summe = summe + feld3;
        summe = summe + feld4;
        summe = summe + feld5;
        summe = summe + feld6;
        summe = summe + feld7;
        summe = summe + feld8;
        feld9 = summe;
        /**
         * Ausgabe Situation 1.
         * Im letzten Feld (Feld 9) wird die Summe aller Felder Ausgegeben.
         */
        System.out.println("Situation 1: Feld_1 = 1 Körner; Erhöhung = 100");
        System.out.println("Feld 1: " + koernerFeld1);        
        System.out.println("Feld 2: " + feld2);        
        System.out.println("Feld 3: " + feld3);        
        System.out.println("Feld 4: " + feld4);        
        System.out.println("Feld 5: " + feld5);        
        System.out.println("Feld 6: " + feld6);        
        System.out.println("Feld 7: " + feld7);        
        System.out.println("Feld 8: " + feld8);        
        System.out.println("Feld 9: " + feld9);         
        System.out.println("");
        
        /**
         * Festlegung der Start Werte für Situation 2.
         */
        koernerFeld1 = 3;
        erhoehung = 50;
        summe = 0;
        /**
         * Ausführung Situation 2.
         * Die Felder werden Prozentual um den festgelegten Wert erhöht.
         */        
        feld2 = koernerFeld1 + (int) (koernerFeld1 / 100.0 * erhoehung);        
        feld3 = feld2 + (int) (feld2 / 100.0 * erhoehung);        
        feld4 = feld3 + (int) (feld3 / 100.0 * erhoehung);        
        feld5 = feld4 + (int) (feld4 / 100.0 * erhoehung);        
        feld6 = feld5 + (int) (feld5 / 100.0 * erhoehung);        
        feld7 = feld6 + (int) (feld6 / 100.0 * erhoehung);        
        feld8 = feld7 + (int) (feld7 / 100.0 * erhoehung);        
        /**
         * Ausführung Situation 2.
         * Die Summe wird zusammengerechnet.
         */
        summe = summe + koernerFeld1;
        summe = summe + feld2;
        summe = summe + feld3;
        summe = summe + feld4;
        summe = summe + feld5;
        summe = summe + feld6;
        summe = summe + feld7;
        summe = summe + feld8;
        feld9 = summe;
        /**
         * Ausgabe Situation 2.
         * Im letzten Feld (Feld 9) wird die Summe aller Felder Ausgegeben.
         */
        System.out.println("Situation 2: Feld_1 = 3 Körner; Erhöhung = 50");
        System.out.println("Feld 1: " + koernerFeld1);        
        System.out.println("Feld 2: " + feld2);        
        System.out.println("Feld 3: " + feld3);        
        System.out.println("Feld 4: " + feld4);        
        System.out.println("Feld 5: " + feld5);        
        System.out.println("Feld 6: " + feld6);        
        System.out.println("Feld 7: " + feld7);        
        System.out.println("Feld 8: " + feld8);        
        System.out.println("Feld 9: " + feld9);         
        System.out.println("");
        
        /**
         * Festlegung der Start Werte für Situation 3.
         */
        koernerFeld1 = 10;
        erhoehung = 0;
        summe = 0;
        /**
         * Ausführung Situation 3.
         * Die Felder werden Prozentual um den festgelegten Wert erhöht.
         */        
        feld2 = koernerFeld1 + (int) (koernerFeld1 / 100.0 * erhoehung);        
        feld3 = feld2 + (int) (feld2 / 100.0 * erhoehung);        
        feld4 = feld3 + (int) (feld3 / 100.0 * erhoehung);        
        feld5 = feld4 + (int) (feld4 / 100.0 * erhoehung);        
        feld6 = feld5 + (int) (feld5 / 100.0 * erhoehung);        
        feld7 = feld6 + (int) (feld6 / 100.0 * erhoehung);        
        feld8 = feld7 + (int) (feld7 / 100.0 * erhoehung);            
        /**
         * Ausführung Situation 3.
         * Die Summe wird zusammengerechnet.
         */
        summe = summe + koernerFeld1;
        summe = summe + feld2;
        summe = summe + feld3;
        summe = summe + feld4;
        summe = summe + feld5;
        summe = summe + feld6;
        summe = summe + feld7;
        summe = summe + feld8;
        feld9 = summe;
        /**
         * Ausgabe Situation 3.
         * Im letzten Feld (Feld 9) wird die Summe aller Felder Ausgegeben.
         */
        System.out.println("Situation 3: Feld_1 = 10 Körner; Erhöhung = 0");
        System.out.println("Feld 1: " + koernerFeld1);        
        System.out.println("Feld 2: " + feld2);        
        System.out.println("Feld 3: " + feld3);        
        System.out.println("Feld 4: " + feld4);        
        System.out.println("Feld 5: " + feld5);        
        System.out.println("Feld 6: " + feld6);        
        System.out.println("Feld 7: " + feld7);        
        System.out.println("Feld 8: " + feld8);        
        System.out.println("Feld 9: " + feld9);         
        System.out.println("");
        
    }
    
}
