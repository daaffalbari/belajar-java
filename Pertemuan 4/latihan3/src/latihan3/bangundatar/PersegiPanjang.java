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
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    public double getPanjang(){
        return panjang;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public double hitungKeliling(){
        double keliling = (2*panjang) + (2*lebar);
        return keliling;
    }
    
    public double hitungLuas(){
        double luas = panjang*lebar;
        return luas;
    }
}
