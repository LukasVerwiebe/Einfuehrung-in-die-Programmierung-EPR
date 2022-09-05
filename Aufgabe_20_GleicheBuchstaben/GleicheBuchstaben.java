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
public class GleicheBuchstaben {
    
    public static void main(String[] args) {
        System.out.println(gibLaengstesKonstantesStueck("AAAABBCCDDDDDDDDDeeeeeAeeeeee"));
    }
    
    public static String gibLaengstesKonstantesStueck(String text) {
        String zwischenwert = "";
        for (int i = 0; i < text.length(); i++) {
            int lastEqual = i;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    lastEqual = j;
                } else {
                    j = text.length() + 10;
                }
            }
            if (text.substring(i, lastEqual + 1).length()
                    > zwischenwert.length()) {
                zwischenwert = text.substring(i, lastEqual + 1);
            }
        }
        
        return zwischenwert;
    }   
}
