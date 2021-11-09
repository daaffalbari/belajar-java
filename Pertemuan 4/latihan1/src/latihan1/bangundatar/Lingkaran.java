/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.bangundatar;

/**
 *
 * @author Daffa Albari
 */
public class Lingkaran {
    public double jari_jari;
    public final double PHI = 3.14;
    

    public double hitung_keliling(){
        return(2*PHI*jari_jari);
    }
    
    public double hitung_luas(){
        return(PHI * Math.pow(jari_jari, 2));
    }
}
