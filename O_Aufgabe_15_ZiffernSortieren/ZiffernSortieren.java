/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika1;

/**
 *
 * @author Lukas
 */
public class ZiffernSortieren {
    public static void main(String[] args) {
        
        System.out.println("Sortiere");
        System.out.println("Soll: 1 Ist: " + sortiere(1)); 
        System.out.println("Soll: 15 Ist: " + sortiere(5001)); 
        System.out.println("Soll: 12345 Ist: " + sortiere(13542)); 
        System.out.println("Soll: 23459 Ist: " + sortiere(504030209)); 
        
        System.out.println("Soll: 12 Ist: " + mische(1, 2)); 
        System.out.println("Soll: 112256789 Ist: " + mische(11569, 2278)); 
        System.out.println("Soll: 112345678 Ist: " + mische(5, 11234678));
        
    }
    
    public static int laenge(long zahl) { 
        return ((zahl == 0) 
                ? 0 
                : laenge(zahl / 10) + 1); 
    }
    
    public static long sortiere(long zahl) { 
        // Ist die Zahl kleiner als 10?         
        return zahl < 10
                // Ja gebe Zahl zurück
                ? zahl
                // Nein, halbiere die Zahl mithilfe von laenge und Potenz 
                // 1e Haelfte wird zur ersten Zahl in mische(,) 2e zur 2en! 
                // Durch den Aufruf entsteht ein binärer Baum der sich bei  
                // dem Rekursionsende ausrechnet.
                : mische(sortiere(zahl / (long)Math.pow(10, laenge(zahl) / 2)), sortiere(zahl % (long)(Math.pow(10, laenge(zahl) / 2))));
    }

    public static long mische(long zahl1, long zahl2) { 
        // Eine von beiden Zahlen muss noch Zahlen haben. 
        return (zahl1 > 0 || zahl2 > 0) 
                // Vergleiche die hinteren Zahlen miteinander und schreibe 
                // die greossere auf, der Rest geht mit * 10 in die Rekursion 
                ? (zahl1 % 10 > zahl2 % 10) 
                // Die letzte Ziffer der zahl1 ist groesser 
                    ? mische(zahl1 / 10, zahl2) * 10 + zahl1 % 10 
                    // Die letzte Ziffer der zahl2 ist groesser 
                    : mische(zahl1, zahl2 / 10) * 10 + zahl2 % 10                  
                    // Sind beide Zahlen auf 0 gesunken gebe 0 zurueck 
                        : 0;
    }
    
}
