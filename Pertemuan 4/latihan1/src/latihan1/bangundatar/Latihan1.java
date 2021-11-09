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
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang persegi_panjang = new PersegiPanjang();
        persegi_panjang.panjang = 10;
        persegi_panjang.lebar = 5;
        System.out.println("Tampih hasil perhitungan keliling dan Luas Persegi Panjang");
        System.out.println("Keliling persegi panjang\t =  "+persegi_panjang.hitungKeliling());
        System.out.println("Luas persegi panjang \t\t =  "+persegi_panjang.hitungLuas());        
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari_jari = 7;        
        System.out.println("Tampil hasil perhitungan keliling dan luas lingkaran");
        System.out.println("Keliling Lingkaran\t\t = "+lingkaran.hitung_keliling());
        System.out.println("Luas Lingkaran\t\t\t = "+lingkaran.hitung_luas());
    }
    
}
