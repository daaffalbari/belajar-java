/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.massajenis;

/**
 *
 * @author Daffa Albari
 */
public class Latihan2 {

    public static void main(String[] args) {
        Kotak balok = new Kotak(10, 5, 7);
        Kotak kubus = new Kotak(5);
        
        // menghitung massa jenis balok
        System.out.println("Massa jenis kotak berbentuk balok");
        System.out.println("Panjang Kotak\t  = "+balok.getPanjang());
        System.out.println("Lebar Kotak\t  = "+balok.getLebar());
        System.out.println("Tinggi Kotak\t  = "+balok.getTinggi());
        balok.setVolume(balok.hitungVolume(balok)); // menyimpan nilai volume
        System.out.println("Volume Kotak\t  = "+balok.getVolume());
        System.out.println("Massa Jenis Kotak = "+balok.hitungMassaJenis(1000, balok.getVolume()));
        System.out.println("");
        
        // menghitung massa jenis kubus
        System.out.println("Massa jenis kotak berbentuk kubus");
        System.out.println("Panjang Kotak\t  = "+kubus.getPanjang());
        System.out.println("Lebar Kotak\t  = "+kubus.getLebar());
        kubus.setVolume(kubus.hitungVolume(kubus)); //menyimpan nilai volume
        System.out.println("Volume Kotak\t  = "+kubus.getVolume());
        System.out.println("Massa Jenis Kotak = "+kubus.hitungMassaJenis(1000, kubus.getVolume()));
    }
    
}
