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
public class FeldRotieren {
 
    public static void main(String[] args) {
        int[] test = {7,4,2,5,10,-3,19};
        rotiere(test, 3);
        
        for(int j = 0; j < test.length; j++) {
            System.out.println(test[j]);
        }
      
    }
    
    public static void rotiere(int[] feld, int schrittweite) {
        int[] neuesFeld = new int [feld.length];
        
        while (schrittweite >= feld.length) {
            schrittweite = schrittweite - feld.length;
        }
        
        for(int i = 0; i <= feld.length-1; i++) {            
            
            if(i < schrittweite) {
                 neuesFeld[i] = feld[feld.length - schrittweite + i];
            } else {
                neuesFeld[i] = feld[i - schrittweite];
            }
        }
        
        for(int i = 0; i < feld.length; i++) {
            feld[i] = neuesFeld[i];
        }
        
        
        
    }
}
