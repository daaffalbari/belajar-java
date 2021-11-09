/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.massajenis;

public class Kotak {

    private int panjang;
    private int lebar;
    private int tinggi;
    private int volume;
    
    // Deklarasi Konstruktor class Kotak
    public Kotak(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public Kotak(int sisi){
        this.panjang = this.lebar = this.tinggi = sisi;
    }
    // Akhir Deklarasi class Kotak
    
    // Deklarasi Method untuk menghitung nilai volume dan massa jenis
    public int hitungVolume(Kotak kotak){
        return kotak.panjang * kotak.lebar * kotak.tinggi;
    }
    
    public double hitungMassaJenis(int massa, int volume){
        return (double)massa/volume;
    }
    // akhir method untuk menghitung nilai volume dan massa jenis
    
    // Deklarasi Getter and Setter class Kotak
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    // akhir Deklarasi Getter and Setter class Kotak
    

}
