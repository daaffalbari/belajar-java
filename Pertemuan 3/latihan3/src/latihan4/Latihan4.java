/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;
import java.util.Scanner;
/**
 *
 * @author Daffa Albari
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char indeks;
        int nilai_hadir, tugas, uts, uas;
        double nilai_akhir;
        Scanner keyboard = new Scanner(System.in);    //Create scanner object  
        
        System.out.print("Masukan Nilai Kehadiran       : ");
        nilai_hadir = keyboard.nextInt();
        System.out.print("Masukan Nilai Tugas           : ");
        tugas = keyboard.nextInt();
        System.out.print("Masukan Nilai UTS             : ");
        uts = keyboard.nextInt();
        System.out.print("Masukan Nilai UAS             : ");
        uas = keyboard.nextInt();
        
        System.out.println("---------------------------------------");
        nilai_akhir = 0.15*nilai_hadir + 0.15*tugas + 0.3*uts + 0.4*uas;
        indeks = 0;
        if(nilai_akhir >= 80)
            indeks = 'A';
        else 
        if(nilai_akhir >=68)
            indeks = 'B';
        else
        if(nilai_akhir >= 45)
            indeks = 'C';
        else
        if(nilai_akhir >= 30)
            indeks = 'D';
        else
        if(nilai_akhir <= 29)
            indeks = 'E';
        
        System.out.println("Nilai Akhir Anda                : "+nilai_akhir);
        System.out.println("Indeks Nilai Anda               : "+indeks);
    }
    
}
