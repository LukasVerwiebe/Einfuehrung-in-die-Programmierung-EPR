/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RationaleZahl;

/**
 *
 * @author Lukas
 */
public class RationaleZahl {
    
    private long zahl;
    private long zähler;
    private long nenner;
    
    
    public RationaleZahl(long zahl){
        this.zahl = zahl;        
    }
    
    public RationaleZahl(long zähler, long nenner){
        this.zähler = zähler;
        this.nenner = nenner;
    }
    
    public RationaleZahl addiere(RationaleZahl zahl) {
        long zähler1 = this.zähler;
        long nenner1 = this.nenner;
        
        long zähler2 = zahl.zähler;
        long nenner2 = zahl.nenner;
        
        long neuerZähler = zähler2 + nenner1;
        long neuerNenner = zähler1 * nenner2;
        
        return new RationaleZahl(neuerZähler, neuerNenner);
    }
    
    
    public String gibAlsText(){
        long zahl = this.zahl;
        long zähler = this.zähler;
        long nenner = this.nenner;
        String ausgabe;
        if(zähler > 0 || nenner > 0) {
            ausgabe = "Rationale Zahl: " + zähler + "/" + nenner;
        } else {
            ausgabe = "Rationale Zahl: " + zahl;
        }
        return ausgabe;
    }
    
    
    
    
    
    
}
