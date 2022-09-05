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
public class VerschiedeneZiffern {
 
    public static void main(String[] args) {
        System.out.println(anzahlZiffern(12345));
        System.out.println(anzahlZiffern(1123));
        System.out.println(anzahlZiffern(112233545));
        
    }
    
    public static int anzahlZiffern(int wievieleZiffern) {
         return (anzahlZiffern(wievieleZiffern, 0)); 
    }
    
    public static int anzahlZiffern(long zahl, int verschiedeneZiffern) { 
         return (zahl < 10) 
                 ? verschiedeneZiffern + 1 
                 : enthaelt(zahl / 10, (int) zahl % 10) 
                    ? anzahlZiffern(zahl / 10, verschiedeneZiffern) 
                    : anzahlZiffern(zahl / 10, verschiedeneZiffern + 1);                                          
    }
    
    public static boolean enthaelt(long zahl, int ziffer) { 
        return (zahl < 10) 
                ? zahl == ziffer 
                : zahl % 10 == ziffer 
                    ? true 
                    : enthaelt(zahl / 10, ziffer);   
    }    

    
}
