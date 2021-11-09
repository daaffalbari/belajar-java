/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.bangundatar;

/**
 *
 * @author Daffa Albari
 */
public class Lingkaran {
    private double jari_jari;
    private final double PHI = 3.14;
    
    public double getJari_jari(){
        return jari_jari;
    }
    public void setJari_jari(double jari_jari){
        this.jari_jari = jari_jari;
    }
    
    public double hitungKeliling(){
        double keliling = 2*PHI*jari_jari;
        return keliling;
    }
    
    public double hitungLuas(){
        double luas = PHI* Math.pow(jari_jari, 2);
        return luas;
    }
}
