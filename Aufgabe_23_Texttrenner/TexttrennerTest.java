/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Texttrenner;

/**
 *
 * @author Lukas
 */
public class TexttrennerTest {
    
    public static void main(String[] args) {
        
       Texttrenner test = new Texttrenner("--xx+--yy--abc--", "+-");
    
       System.out.println(test.gibNaechstesWort()); 
       System.out.println(test.gibNaechstesWort());
       System.out.println(test.gibNaechstesWort());
       System.out.println(test.gibNaechstesWort());
       
       System.out.println(test.hatNochWoerter()); 
    }
    
}
