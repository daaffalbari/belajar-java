/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
import java.util.Scanner;
/**
 *
 * @author Daffa Albari
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, saldo_target;
        double saldo_awal, saldo, bunga;
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Saldo Awal  : Rp. ");
        saldo_awal = myObj.nextDouble();
        System.out.print("Bunga/Bulan : ");
        bunga = myObj.nextDouble();
        System.out.print("Saldo Target: Rp. ");
        saldo_target = myObj.nextInt();
        
        bunga = bunga/100;
        saldo = saldo_awal;
        for( i = 1; saldo <= saldo_target; i++){
            saldo = saldo + bunga*saldo;
            System.out.println("Saldo di bulan ke-"+i+" : Rp. "+saldo);
        }
    }
    
}
