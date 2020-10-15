/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan4.kambing;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi program untuk mendeklarasian variabel 
 * lokal dan mengakses variabel lokal pada main program
 */
public class PBOIF210119064Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBOIF210119064Latihan4Kambing KambingJantan = new PBOIF210119064Latihan4Kambing();
        KambingJantan.tambahKambing();
    }
    
}
