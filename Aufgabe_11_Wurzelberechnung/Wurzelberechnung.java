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
public class Wurzelberechnung {
    
    public static void main(String[] args) {
        
        System.out.println("Soll: 9.5367431640625E-7 Ist: " + wurzel(0, 0.000001));
        System.out.println("Soll: 1.5 Ist: " + wurzel(2, 1));
        System.out.println("Soll: 3.4 Ist: " + wurzel(9, 2));
        System.out.println("Soll: 3.023529411764706 Ist: " + wurzel(9, 0.4));
        
    }
    
     public static double wurzel(double x, double epsilon) { 
         // r0 aus der Formel wird 1 gesetzt 
         return wurzel(x, epsilon, 1); 
    }
     
    private static double wurzel(double x, double epsilon, double wurzelwert) { 
        // Errechnet den neuen Wurzelwert 
        double neuerWurzelwert = 0.5 * (wurzelwert + x / wurzelwert); 
        /* Ist der Wurzelwert genau genug, gib neuerWurzelwert zurueck, 
         * ansonsten gehe in die Rekursion und berechne einen genaueren 
         * Wurzelwert im naechsten Rekursionsdurchlauf. 
        */  
        return (betrag(wurzelwert - neuerWurzelwert) < epsilon)
                ? neuerWurzelwert 
                : wurzel(x, epsilon, neuerWurzelwert); 
    }
     
    public static double betrag(double zahl) { 
        return (zahl >= 0) 
                ? zahl 
                : zahl * -1; 
    } 
    
}
