/**
 * Aufgabe Nr. 23: Texttrenner
 * @author Lukas
 */
public class Texttrenner {
    
    public String zeichenkette;
    private String trennzeichen;
    private int wortanfang;
    
    public Texttrenner(String zeichenkette, String trennzeichen) {
        this.zeichenkette = zeichenkette;
        this.trennzeichen = trennzeichen;
        this.wortanfang = 0;
        this.wortanfang = positionWortanfang(zeichenkette, trennzeichen, wortanfang);
    }
    
    public boolean hatNochWoerter() {
        boolean ergebnis = false;
        int j = 0;
        for(int i = 0; i <= zeichenkette.length() -1; i++) {            
            if(zeichenkette.charAt(i) != trennzeichen.charAt(j)) {
                ergebnis = true;
                i = zeichenkette.length() + 10;
            }      
        }
        return ergebnis;
    }
    
     public String gibNaechstesWort() { 
        String wort; 
        int i = this.wortanfang; 
        while ((i < zeichenkette.length()) && (trennzeichen.indexOf(zeichenkette.charAt(i)) == -1)) { 
                i++;
        } 
        wort = zeichenkette.substring(wortanfang, i);          
        this.wortanfang = positionWortanfang(this.zeichenkette, this.trennzeichen, i); 
        return (wort.length() == 0) 
                ? null 
                : wort; 
    }    
    
//    public String gibNachstesWort() {
//        int zeichenZähler = 0;
//        String zwischenWert = "";
//        String trennzeichen = this.trennzeichen;
//        String zeichenkette = this.zeichenkette;
//        int j = 0;
//        
//        for(int i = 0; i <= zeichenkette.length() -1; i++) {
//            
//            if(zeichenkette.charAt(i) != trennzeichen.charAt(j)) {
//                zwischenWert = zwischenWert + zeichenkette.charAt(i);
//                zeichenZähler = i;            
//            } else if(zeichenkette.charAt(i) == trennzeichen.charAt(j)&& zwischenWert.length() == 0){
//                i = i +1;
//            } else {
//                i = zeichenkette.length() + 1;
//            }            
//        }
//        
//        if(zwischenWert.equals("")) {
//            zwischenWert = null;            
//        } else {
//           this.zeichenkette = zeichenkette.substring(zeichenZähler + 1, zeichenkette.length());           
//        }       
//        return zwischenWert;
//    }
    
    private int positionWortanfang(String text, String trenner, int wortAnfang) { 
        while ((wortAnfang < text.length()) && (trenner.indexOf(text.charAt(wortAnfang)) != -1)) { 
            wortAnfang = wortAnfang + 1; 
        } 
        return wortAnfang; 
    }    
    
    public void ausgabe(){
        System.out.println(this.zeichenkette);
    }
    
}
