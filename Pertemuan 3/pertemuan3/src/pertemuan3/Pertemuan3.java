/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Daffa Albari
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai;
        char indeks;
        nilai = 46;
        if(nilai >= 80)
            indeks = 'A';
        else 
        if(nilai >=68)
            indeks = 'B';
        else 
        if(nilai >= 56)
            indeks = 'C';
        else 
        if(nilai >= 45)
            indeks = 'D';
        else
            indeks = 'E';
        System.out.println("Nilai "+nilai+" mempunyai indeks "+indeks);
    }
}
