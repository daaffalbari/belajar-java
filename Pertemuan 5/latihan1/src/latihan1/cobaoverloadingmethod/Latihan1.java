/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.cobaoverloadingmethod;

public class Latihan1 {

    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan();
        System.out.println("Tampil hasil penjumlahan 2 bilangan pecahan\t = "
                +bilangan.penjumlahanBilangan(0.11, 1.5, 8));
        
        System.out.println("Tampil hasil penjumlahan 3 bilangan bulat\t = "
                +bilangan.penjumlahanBilangan(13, 5, 12));
        
        System.out.println("Tampil hasil penjumlahan 2 bilangan bulat\t = "
                +bilangan.penjumlahanBilangan(4, 4));
    }
    
}
