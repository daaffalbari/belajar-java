/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1.cobaoverloadingmethod;

/**
 *
 * @author Daffa Albari
 */
public class Bilangan {
    public int bilangan1;
    public int bilangan2;
    public int bilangan3;
    
    public int penjumlahanBilangan(int bil1, int bil2){
        return bil1+bil2;
    }
    
    public int penjumlahanBilangan(int bil1, int bil2, int bil3){
        return bil1+bil2+bil3;
    }
    
    public double penjumlahanBilangan(double bil1, double bil2, double bil3){
        return bil1+bil2+bil3;
    }
}
