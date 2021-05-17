package umrechnungen;

/**
 * @author Lukas
 */
public class Umrechnung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Aufgabe 1: Umrechnung von Temperaturen
        */
        int fahrenheit;
        int celsius;
        
        fahrenheit = 40;
        int temperatur = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahreheit: " + fahrenheit + " Celsius: " + temperatur);
        
        fahrenheit = 41;
        int temperatur2 = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahreheit: " + fahrenheit + " Celsius: " + temperatur2);
        System.out.println("");
        
        /*
            Aufgabe 2: Geld Umrechnen
        */
        int schweizerFranken;
        
        schweizerFranken = 100;
        double umrechnung = schweizerFranken / 1.1401;
        System.out.println("Franken: " + schweizerFranken + " Euro: " + (int) umrechnung);
                
        schweizerFranken = 10000;
        double umrechnung2 = schweizerFranken / 1.1401;
        System.out.println("Franken: " + schweizerFranken + " Euro: " + (int) umrechnung2);
        System.out.println("");
        
        /*
            Aufgabe 3: Umrechnung Zeit
        */
        int minuten;
        int stunden;
        int restMinuten;
        
        minuten = 5;
        stunden = minuten / 60;
        restMinuten = minuten % 60;        
        System.out.println(stunden + ":" + restMinuten);
        
        minuten = 59;
        stunden = minuten / 60;
        restMinuten = minuten % 60;        
        System.out.println(stunden + ":" + restMinuten);
        
        minuten = 60;
        stunden = minuten / 60;
        restMinuten = minuten % 60;        
        System.out.println(stunden + ":" + restMinuten);
        
        minuten = 61;
        stunden = minuten / 60;
        restMinuten = minuten % 60;        
        System.out.println(stunden + ":" + restMinuten);
        
        minuten = 825;
        stunden = minuten / 60;
        restMinuten = minuten % 60;        
        System.out.println(stunden + ":" + restMinuten);  
    }
    
}
