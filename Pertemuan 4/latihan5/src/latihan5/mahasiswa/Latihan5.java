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
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Daffa Albari";
        mahasiswa.nim = "10120212";
        mahasiswa.nilaiKehadiran = 100;
        mahasiswa.nilaiTugas = 80;
        mahasiswa.nilaiUTS = 75;
        mahasiswa.nilaiUAS = 50;        
        
        System.out.println("Tampil Data Nilai Mahasiswa");
        System.out.println("------------------------------------------------");
        System.out.println("Nama Mahasiswa\t\t : "+mahasiswa.nama);
        System.out.println("NIM Mahasiswa\t\t : "+mahasiswa.nim);
        System.out.println("Tampil Nilai Kehadiran\t : "+mahasiswa.nilaiKehadiran);
        System.out.println("Tampil Nilai Tugas\t : "+mahasiswa.nilaiTugas);
        System.out.println("Tampil Nilai UTS\t : "+mahasiswa.nilaiUTS);
        System.out.println("Tampil Nilai UAS\t : "+mahasiswa.nilaiUAS);
        System.out.println("Tampil Nilai Akhir Anda\t : "+mahasiswa.hitungNilaiAkhir());
        
        mahasiswa.tampilIndeksNilai();
    }      
    
}
