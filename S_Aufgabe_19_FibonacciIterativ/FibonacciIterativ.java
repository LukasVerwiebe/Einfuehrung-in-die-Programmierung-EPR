/**
 * Aufgabe Nr. 19: Fibonacci Iterativ
 * Klasse zur Berechnung der Fibonacci-Funktion ohne Rekursion
 * @author Lukas
 */
public class FibonacciIterativ {
    // Einagbe und Ausgabe von Testwerten
    public static void main(String[] args) {        
        System.out.println(fib(5));
    }
    // Methode zur Berechnung der Fibonacci-Funktion
    public static long fib(int n) {        
        int vorl = 0;
        int letztes = 1;
        // Berechnung mittels einer For Schleife
        for (int i = 1; i < n; i++) {
            int zwischenwert = letztes;
            letztes = vorl + letztes;
            vorl = zwischenwert;
        }
        
        return (n != 0) ? letztes : 0;
    }
}
