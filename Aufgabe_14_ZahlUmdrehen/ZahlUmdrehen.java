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
public class ZahlUmdrehen {
    
    public static void main(String[] args) {
        System.out.println(dreheUm(0));
        System.out.println(dreheUm(1));
        System.out.println(dreheUm(180));
        System.out.println(dreheUm(155));
        System.out.println(dreheUm(123456789));
    }
    
    public static long dreheUm(long umzudrehendeZahl) { 
        return dreheUm(umzudrehendeZahl, 0); 
    }
    
    private static long dreheUm(long zahl, long umgedrehteZahl) {  
        return 0 == zahl 
            ? umgedrehteZahl 
            : dreheUm(zahl / 10, umgedrehteZahl * 10 + zahl % 10); 
    }   
    
}
