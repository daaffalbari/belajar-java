/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.tandanyakamu;
import java.util.Scanner;
public class Latihan4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Tahun Lahir Anda : ");
        Age age = new Age(keyboard.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda\t : "+age.getTahunLahir());
        System.out.print("Hari ini Tahun\t\t : ");
        age.setTahunSkrg(keyboard.nextInt());
        System.out.println("Umur Anda Saat Ini\t : "+age.hitungUmur());
        System.out.println("Tandanya Kamu\t\t : "+age.tandanyaKamu(age.hitungUmur()));        
    }  
}
