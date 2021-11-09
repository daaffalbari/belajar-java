/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.tandanyakamu;

/**
 *
 * @author Daffa Albari
 */
public class Age {

    private int tahunLahir;
    private int tahunSkrg;
    private String keterangan;

    // Membuat Getter aand Setter Untuk setiap atribute
    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunSkrg() {
        return tahunSkrg;
    }

    public void setTahunSkrg(int tahunSkrg) {
        this.tahunSkrg = tahunSkrg;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Age(int tahunSkrg){
        this.tahunLahir = tahunSkrg;
    }
    
    public int hitungUmur(){
        return getTahunSkrg() - getTahunLahir();
    }
    
    public String tandanyaKamu(int umur){
        umur = hitungUmur();
        if(umur>=0 && umur<=5){
            keterangan = "Kamu Lagi Lucu - lucunya";
        } else if(umur>5 && umur<=10){
            keterangan = "Kamu Masih Anak-anak";
        } else if (umur>10 && umur<=13){
            keterangan = "Kamu Masih Remaja";
        } else if (umur>13 && umur<=19){
            keterangan = "Kamu Alay";
        } else if(umur>19 && umur<=29){
            keterangan = "Kamu lagi galau-galaunya nyari jodoh!";
        } else if(umur>29 && umur<=35){
            keterangan = "Kamu lagi sibuk nyari uang";
        } else if(umur>35 && umur<=150){
            keterangan = "Kamu sudah tua";
        } else
            keterangan = "Tidak Terdeteksi di kehidupan";
        return keterangan;
    } 
}
