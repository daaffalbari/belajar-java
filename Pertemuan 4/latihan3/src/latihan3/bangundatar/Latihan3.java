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
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(10);
        persegiPanjang.setLebar(5);
        
        System.out.println("Tampil Hasil Perhitungan Keliling dan Luas Persegi Panjang");
        System.out.println("Keliling Persegi Panjang\t = "+persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang\t\t = "+persegiPanjang.hitungLuas());
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari_jari(7);
        
        System.out.println("Tampil Hasil Perhitungan Keliling dan Luas Lingkaran");
        System.out.println("Keliling Lingkaran\t\t = "+lingkaran.hitungKeliling());
        System.out.println("Luas Lingkaran\t\t\t = "+lingkaran.hitungLuas());
        
    }
    
}
