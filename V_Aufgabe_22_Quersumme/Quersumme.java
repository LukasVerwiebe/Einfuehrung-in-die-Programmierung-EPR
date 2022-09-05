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
public class Quersumme {
    
    public static void main(String[] args) {
        System.out.println(quersumme(123));
        System.out.println(quersumme(1234));
    }
    
    public static int quersumme(int zahl) {
        int ergebnis = 0;
        int zwischenwert;
        
        while(zahl > 0) {
            zwischenwert = zahl % 10;
            zahl = zahl / 10;        
            ergebnis = ergebnis + zwischenwert;
        }        
        return ergebnis;
    }
}
