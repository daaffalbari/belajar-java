/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.Scanner;
/**
 *
 * @author Daffa Albari
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan jumlah Bilangan: ");
        number = keyboard.nextInt();
        System.out.println("Tampil Bilangan Ganjil dari 1 sampai "+number);
        
        for(int i = 1; i <= number; i++){
            if(i % 2 == 1 )
                System.out.println(i);
   
        }
    }
    
}
