
/**
 * Aufgabe Nr 3: Stromrechnung
 * Der Rechnungsbetrag einer Stromrechnung soll ausgegeben und dabei 
 * auf 2 Nachkommastellen gerundet werden.
 * @author Lukas
 */
public class Stromrechnung {
    
    /**
     * In dieser Methode wird die Ausgabe und die Berechnung
     * der Werte realisiert.
     * @param args wird nicht verwendet 
     */
    public static void main(String[] args) {
        
        /**
         * Initialisierung: Grundpreis in EUR pro Monat.
         */
        double tarif1 = 5.75;
        double tarif2 = 9.85;        
        /**
         * Initialisierung: Verbrauchspreis in Cent pro kWh.
         */
        double verbrauchsPreis1 = 23.49;
        double verbrauchsPreis2 = 22.10;        
        /**
         * Initialisierung: Jahresverbrauch in kWh.
         */
        int stromVerbrauch1 = 3536;
        /**
         * Initalisierung: Rechnungsbetrag.
         */
        double rechnungsbetrag1 = 0.0;
        double rechnungsbetrag2 = 0.0;
        
        /**
         * Berechnung des Gesamtpreises für ein Jahr nach Tarif 1.
         */
        rechnungsbetrag1 = (stromVerbrauch1 * verbrauchsPreis1) / 100 
                + (12 * tarif1);
        /**
         * Berechnung des Gesamtpreises für ein Jahr nach Tarif 2.
         */
        rechnungsbetrag2 = (stromVerbrauch1 * verbrauchsPreis2) / 100 
                + (12 * tarif2);
        /**
         * Rundung der Werte auf 2 Nachkommastellen.
         */
        rechnungsbetrag1 = (int) ((rechnungsbetrag1 * 100) + 0.5) / 100.0;
        rechnungsbetrag2 = (int) ((rechnungsbetrag2 * 100) + 0.5) / 100.0;
        
        
        /**
         * Ausgabe der Werte für Tarif 1 und Tarif 2.
         */      
        System.out.println("Tarif 1:");
        System.out.println("Jahresverbrauch: " + stromVerbrauch1 + " kWh");
        System.out.println("Grundpreis: " + tarif1 + " EUR");
        System.out.println("Verbrauchspreis: " + verbrauchsPreis1 + " Cent");
        System.out.println("Jahres Rechnungsbetrag = " + rechnungsbetrag1 
                + " EUR");
        System.out.println("");
        
        System.out.println("Tarif 2:");
        System.out.println("Jahresverbrauch: " + stromVerbrauch1 + " kWh");
        System.out.println("Grundpreis: " + tarif2 + " EUR");
        System.out.println("Verbrauchspreis: " + verbrauchsPreis2 + " Cent");
        System.out.println("Jahres Rechnungsbetrag = " + rechnungsbetrag2 
                + " EUR");
        
    }
    
}
