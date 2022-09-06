/**
 * Aufgabe Nr. 14: Zahl Umdrehen
 * Diese Klasse dreht eine Zahl um un gibt die neue Zahl als Integer Wert aus
 * @author Lukas
 */
public class ZahlUmdrehen {
    // Eingabe und Ausgabe von Testwerten
    public static void main(String[] args) {
        System.out.println(dreheUm(0));
        System.out.println(dreheUm(1));
        System.out.println(dreheUm(180));
        System.out.println(dreheUm(155));
        System.out.println(dreheUm(123456789));
    }
    // Methode um eine Zahl zum umdrehen anzugeben und diese mit einem Leerwert an eine 
    // weitere Methode weiterzugeben. Die Leerzahl wird mit dem umgedrehten Wert gefüllt.
    public static long dreheUm(long umzudrehendeZahl) { 
        return dreheUm(umzudrehendeZahl, 0); 
    }
    // Methode mit der die Zahl umgedreht wird. Die neue Zahl wird zurückgegeben.
    private static long dreheUm(long zahl, long umgedrehteZahl) {  
        return 0 == zahl 
            ? umgedrehteZahl 
            : dreheUm(zahl / 10, umgedrehteZahl * 10 + zahl % 10); 
    }   
    
}
