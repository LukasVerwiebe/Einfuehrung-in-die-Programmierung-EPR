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
public class FelderMischen {
    
    public static void main(String[] args) {
        
        int[] test1 = {-10,-5,0,2,2,3,7};
        int[] test2 = {-4,0,1,2,5,6, -11};
        
        mische(test1, test2);
        
    }
    
    public static int[] mische(int[] feld1, int[] feld2) {
        int[] neuesFeld = new int[feld1.length + feld2.length];
        int a = 0;
        
        for(int i = 0; i <= feld1.length-1; i++) {          
                neuesFeld[i] = feld1[i];        
                a = a + 1;         
        }
        
        for(int j = 0; j <= feld2.length-1; j++) {
            neuesFeld[a] = feld2[j];
            a = a + 1;
        }
        
        
        // Array sortieren mit BubbleSort
        int temp = 0;
        for(int i = 1; i < neuesFeld.length; i++){
            for(int j = neuesFeld.length - 1; j >= i; j--) {
                if(neuesFeld[j - 1] > neuesFeld[j]) {
                    temp = neuesFeld[j - 1];
                    neuesFeld[j - 1] = neuesFeld[j];
                    neuesFeld[j] = temp;
                }
            }                
        }       
        
        // Ausagbe
        for(int j = 0; j < neuesFeld.length; j++) {
            System.out.println(neuesFeld[j]);
        }
        return neuesFeld;
    }
}
