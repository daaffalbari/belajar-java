/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5.mahasiswa;

/**
 *
 * @author Daffa Albari
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    public double nilaiKehadiran;
    public double nilaiTugas;
    public double nilaiUTS;
    public double nilaiUAS;
    private double nilaiAkhir;
    private char indeks;

    public double hitungNilaiAkhir(){
        double nilaiAkhir = 0.15*nilaiKehadiran + 0.15*nilaiTugas + 0.3*nilaiUTS + 0.4*nilaiUAS;
        return nilaiAkhir;
    }
    
    public void tampilIndeksNilai(){
        double nilaiAkhir = hitungNilaiAkhir();
        if(nilaiAkhir>=80){
            indeks = 'A';
        } else if(nilaiAkhir>=68){
            indeks = 'B';
        } else if(nilaiAkhir>=45){
            indeks = 'C';
        } else if(nilaiAkhir>=30){
            indeks = 'D';
        } else if(nilaiAkhir<30){
            indeks = 'E';
        };
        System.out.println("Tampil Indeks Akhir Anda : "+indeks);
    }
        
}
