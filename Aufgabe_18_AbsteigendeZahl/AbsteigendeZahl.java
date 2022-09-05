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
public class AbsteigendeZahl {
    
    public static void main(String[] args) {
        System.out.println(istAbsteigend(54321));
        System.out.println(istAbsteigend(123456));
    }
    
    public static boolean istAbsteigend(int zahl) {
        boolean ergebnis = false;
        int zwischenWert1;
        int zwischenWert2;
        
        while(zahl > 0) {
            zwischenWert1 = zahl % 10;
            zahl = zahl / 10;
            zwischenWert2 = zahl % 10;
            
            if(zwischenWert1 <= zwischenWert2) {
                ergebnis = true;
                zahl = 0;
            } else {
                ergebnis = false;
                
            }
        }
        
        return ergebnis;
    }
}
