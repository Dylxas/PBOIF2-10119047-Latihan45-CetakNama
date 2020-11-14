/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan45.cetaknama;

import data.Printer;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENCETAK NAMA SEBANYAK 
 *                     JUMLAH YANG USER MASUKKAN
 */

public class PBOIF210119047Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        Printer printer = new Printer();
        
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(input.nextInt());

        printer.cetak(printer.getNama());

        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
