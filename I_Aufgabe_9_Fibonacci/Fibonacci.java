/**
 * Aufgabe Nr. 9: Fibonacci
 * Diese Klasse beinhaltet Methoden zur Berechnung der Fibonacci-Funktion
 * @author Lukas
 */
public class Fibonacci {
    /**
     * In dieser Methode werden die Testfälle definiert und die Ergebnise 
     * ausgegeben.
     * @param args wird nicht verwendet 
     */
    public static void main(String[] args) {
		//Testfall Berechnung mit 20 Ergebnis = 6765
        System.out.println(fib(20));
    }
	
    /**
     * Diese Methode wird zur Berechnung der Fibonacci-Funktion aufgerufen
	 * Diese Methode ruft zur Berechnung eine weitere Methode auf
     * @param n
     * @return 
     */
    public static long fib(int n) {        
        return (n <= 1) ? n : fib(n - 2, 0, 1);
    }
	
    /**
     * Diese Methode berechnet die Fibonacci-Funktion je nach größe 
     * @param n
     * @param vorletzte
     * @param letzte
     * @return 
     */
    public static long  fib(int n, long vorletzte, long letzte) {     
        return (n <= 0) ? letzte + vorletzte
                : fib(n - 1, letzte, vorletzte + letzte);
    }
        
}
