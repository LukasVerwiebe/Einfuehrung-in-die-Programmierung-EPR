/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RationaleZahl;

/**
 *
 * @author Lukas
 */
public class RationaleZahlTest {
    
     public static void main(String[] args) {
        
       RationaleZahl test = new RationaleZahl(13, 12);  
       System.out.println(test.gibAlsText());
       
       RationaleZahl test2 = new RationaleZahl(4);  
       System.out.println(test2.gibAlsText());
       
       
       RationaleZahl test3 = new RationaleZahl(2, 8);
       RationaleZahl test4 = new RationaleZahl(5, 6);
       RationaleZahl test5 = test3.addiere(test4);
       System.out.println(test5.gibAlsText());
       
       RationaleZahl test6 = test4.addiere(test3);
       System.out.println(test6.gibAlsText());
       
       
       
    }
}
