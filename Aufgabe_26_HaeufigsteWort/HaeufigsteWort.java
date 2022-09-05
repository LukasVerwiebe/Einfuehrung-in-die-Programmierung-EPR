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
public class HaeufigsteWort {
    
    public static void main(String[] args) {
        String[] test = {"Haus", "Baum", "Auto", "Baum", "Auto", "Auto", "Haus", "Test", "Baum", "Auto"};
        String[] test2 = {};
        System.out.println(gibHaeufigsteWort(test));
        

        
    }
    
    public static String gibHaeufigsteWort(String[] feld) {
        String wort = null;
        int zählerAlt = 0;
        
        String temp = "";
        for(int i = 1; i < feld.length; i++){
            int zähler = 0;
            for(int j = feld.length; j >= i; j--) {
                
                if(feld[j - 1].equals(feld[i])) {
                    zähler = zähler +1;
                    temp = feld[i];
                    
                }
            }
            if(zählerAlt == 0) {
                zählerAlt = zähler;
                wort = temp;
            } else if(zählerAlt < zähler) {
                zählerAlt = zähler;
                wort = temp;
            }
        }
        return wort;
    }
    
}
