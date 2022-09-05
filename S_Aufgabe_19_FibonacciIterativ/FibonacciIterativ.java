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
public class FibonacciIterativ {
    
    public static void main(String[] args) {
        
        System.out.println(fib(5));
    }
    
    public static long fib(int n) {        
        int vorl = 0;
        int letztes = 1;
        
        for (int i = 1; i < n; i++) {
            int zwischenwert = letztes;
            letztes = vorl + letztes;
            vorl = zwischenwert;
        }
        
        return (n != 0) ? letztes : 0;
    }
}
