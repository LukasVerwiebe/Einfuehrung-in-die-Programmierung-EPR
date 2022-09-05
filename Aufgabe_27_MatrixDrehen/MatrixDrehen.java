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
public class MatrixDrehen {
    
    public static void main(String[] args) {
        
        int[][] array = {{1,2,7},
                        {4,5,6},
                        {7,8,9}};
        
        
        System.out.println("Matrix 1");
        for ( int zeile = 0; zeile < array.length; zeile++ )
        {
            System.out.print("Zeile " + zeile + ": ");
            for ( int spalte=0; spalte < array[zeile].length; spalte++ ) {
                System.out.print( array[zeile][spalte] + " ");
            }                
            System.out.println();
        }
        
        
        dreheArray(array);
        
        
    }
    
    public static int[][] dreheArray(int[][] array) {
	int[][] neuesArray = new int[array[0].length][array.length];
		
	for (int i = 0; i < neuesArray.length; i++) {
            for (int j = 0; j < neuesArray[0].length; j++) {
		neuesArray[i][j] = array[j][array[j].length - i - 1];
            }
	}
        
        // das Array ausgeben
	System.out.println("Matrix 2");        
        for (int zeile = 0; zeile < neuesArray.length; zeile++ ) {
            System.out.print("Zeile " + zeile + ": ");
            for (int spalte = 0; spalte < neuesArray[zeile].length; spalte++ ) {
                System.out.print(neuesArray[zeile][spalte] + " ");
            }                      
            System.out.println();
        }
                
		return neuesArray;
	}
}
