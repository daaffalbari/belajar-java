/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.kalkulator;

/**
 *
 * @author Daffa Albari
 */
public class Kalkulator {
    public double bilangan1;
    public double bilangan2;
    
    public double hasilTambah(){
        double tambah = bilangan1 + bilangan2;
        return tambah;
    }
    public double hasilKurang(){
        double kurang = bilangan1 - bilangan2;
        return kurang;
    }
    public double hasilKali(){
        double perkalian = bilangan1 * bilangan2;
        return perkalian;
    }
    public double hasilBagi(){
        double pembagian = bilangan1 / bilangan2;
        return pembagian;
    }
    public double sisaBagi(){
        double sisa = bilangan1 % bilangan2;
        return sisa;
    }
}
