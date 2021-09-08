/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johntravolta;

import java.util.Scanner;



/**
 *
 * @author majid
 */
public class JohnTravolta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nama : Muhammad Syahrul Majid
        // NIM : 11190910000030
        
        
        // SEKARANG TESTING
        
        int jamNormal = 40;
        int gajiNormal = 15000;
        double gajiLemburPerjam = 1.5 * gajiNormal;
        int gajiSeminggu = gajiNormal * jamNormal;
        int jamKerja;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input Jam Kerja : ");
        jamKerja = in.nextInt();
        
        int jamLembur = jamKerja - jamNormal;
        double gajiLembur = jamLembur * gajiLemburPerjam;
        
        double pemasukan = gajiSeminggu + gajiLembur;
        
        if(jamKerja < 40){
            int gaji = jamKerja * gajiNormal;
            System.out.println("Gaji Mr John selama seminggu sebesar Rp" + gaji);
            int pengeluaran;

            System.out.println("Input Pengeluaran : ");
            pengeluaran = in.nextInt();

            System.out.println("Apakah Mr John bisa menabung atau tidak??");

            double tabungan = gaji - pengeluaran;

            if (gaji > pengeluaran) {
                System.out.println("Bisa Menabung");
                System.out.println("Tabungan Mr John selama seminggu sebesar Rp" + tabungan);
            } else if (gaji == pengeluaran) {
                System.out.println("Tidak Bisa Menabung");
            } else {
                System.out.println("Cari Tambahan");
            }
        } else {
            System.out.println("Gaji Mr John selama seminggu sebesar Rp" + pemasukan);
            int pengeluaran;

            System.out.println("Input Pengeluaran : ");
            pengeluaran = in.nextInt();

            System.out.println("Apakah Mr John bisa menabung atau tidak??");

            double tabungan = pemasukan - pengeluaran;

            if (pemasukan > pengeluaran) {
                System.out.println("Bisa Menabung");
                System.out.println("Tabungan Mr John selama seminggu sebesar Rp" + tabungan);
            } else if (pemasukan == pengeluaran) {
                System.out.println("Tidak Bisa Menabung");
            } else {
                System.out.println("Cari Tambahan");
            }
        }
        
        
        
        
        
        
        
        
        
      
    }
    
}
