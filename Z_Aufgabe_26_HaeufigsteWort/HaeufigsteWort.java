/**
 * Aufgabe Nr. 26: HäufigesWort
 * Diese Klasse gibt das Wort aus welches sich am Häufigsten in einem Array befindet
 * @author Lukas
 */
public class HaeufigsteWort {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        String[] test = {"Haus", "Baum", "Auto", "Baum", "Auto", "Auto", "Haus", "Test", "Baum", "Auto"};
        String[] test2 = {};
        System.out.println(gibHaeufigsteWort(test));        
    }
    /**
    * Diese Methode Zählt die Wörter dabei wird das Aktuell Häufigste Wort
    * Zwischengespeichert und jeweils überschrieben sobald ein Wort 
    * häufiger Vorkommt.
    **/
    public static String gibHaeufigsteWort(String[] feld) {
        // Speicherung des Wortes
        String wort = null;
        // Zwischenspeicher für den Zähler
        int zählerAlt = 0;
        
        String temp = "";
        // Mittels der Schleife wird jedes Wort einzeln gezählt 
        // der Zähler und das Wort werden jeweils ersätzt sobald
        // ein Wort öffters gezählt wurde.
        for(int i = 1; i < feld.length; i++){
            int zähler = 0;
            for(int j = feld.length; j >= i; j--) {
                
                if(feld[j - 1].equals(feld[i])) {
                    zähler = zähler +1;
                    temp = feld[i];
                    
                }
            }
            
            if(zählerAlt == 0) {
                zählerAlt = zähler;
                wort = temp;
            } else if(zählerAlt < zähler) {
                zählerAlt = zähler;
                wort = temp;
            }
        }
        return wort;
    }
    
}
