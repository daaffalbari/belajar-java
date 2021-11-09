/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3.tabungan;

public class Tabungan {

    private int saldo;
    private int penarikan;
 
    // Inisialisasi Getter and Setter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPenarikan() {
        return penarikan;
    }

    public void setPenarikan(int penarikan) {
        this.penarikan = penarikan;
    }
    // Akhir getter and setter
    
    
    public Tabungan(int saldoAwal){
        this.saldo = saldoAwal;
    }
    
    public int tarikTabungan(int jumlah){
        saldo = getSaldo() - jumlah;
        return saldo;
    }
    
}
