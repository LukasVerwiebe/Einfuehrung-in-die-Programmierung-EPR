/**
 * Aufgabe Nr. 27: MatrixDrehen
 * Diese Klasse wird verwendet um ein zweidimensionales Array um 90 Grad zu drehen
 * @author Lukas
 */
public class MatrixDrehen {
    // Methode für ein- und ausgabe von Testwerten
    public static void main(String[] args) {        
        int[][] array = {{1,2,7},
                        {4,5,6},
                        {7,8,9}};        
        // Zur Besseren Übersicht wird die Test Matrix ausgegeben
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
    
    // Methode zum drehen der Matrix
    public static int[][] dreheArray(int[][] array) {
	// Neues Leeres Array
	int[][] neuesArray = new int[array[0].length][array.length];
	/**
	* Die Werte des Eingabe Arrays werden in das neue Array eingefügt.
	* Dabei werden die Werte Gedreht an die entsprechende Stelle eingefügt.
	**/
	for (int i = 0; i < neuesArray.length; i++) {
            for (int j = 0; j < neuesArray[0].length; j++) {
		neuesArray[i][j] = array[j][array[j].length - i - 1];
            }
	}
        
        // Das gedrehte Array ausgeben
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
