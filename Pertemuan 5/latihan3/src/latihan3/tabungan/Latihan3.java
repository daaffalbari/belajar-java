/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.tabungan;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        char status;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(keyboard.nextInt());  
        do{
        System.out.print("Jumlah Uang Yang Diambil : ");
        tabungan.setPenarikan(keyboard.nextInt());
        System.out.println("Jumlah Saldo Anda Sekarang : "
                +tabungan.tarikTabungan(tabungan.getPenarikan()));
        System.out.println("");
        System.out.print("Apakah Masih Ingin Melakukan Penarikan ? (Y/N) : ");
        status = keyboard.next().charAt(0);
        }
        while(status == 'Y');
    }    
}
