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
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.bilangan1 =  7;
        kalkulator.bilangan2 = 2;
        System.out.println("Masukan Bilangan ke-1 : "+kalkulator.bilangan1);
        System.out.println("Masukan Bilangan ke-2 : "+kalkulator.bilangan2);
        System.out.println("Hasil Penjumlahan\t = "+kalkulator.hasilTambah());
        System.out.println("Hasil Perkurangan\t = "+kalkulator.hasilKurang());
        System.out.println("Hasil Perkalian\t\t = "+kalkulator.hasilKali());
        System.out.println("Hasil Pembagian\t\t = "+kalkulator.hasilBagi());
        System.out.println("Hasil Sisa Pembagian\t = "+kalkulator.sisaBagi());
    }
    
}
