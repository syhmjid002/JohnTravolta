/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johntravolta;

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
        
        int JamLembur = 52;
        double GajiPerjam = 15000;
        double GajiLemburPerjam = 1.5 * GajiPerjam;
        double TotalGajiLemburSeminggu = GajiLemburPerjam * JamLembur;
        
        int pengeluaran = 10000000;
        
        double tabungan = TotalGajiLemburSeminggu - pengeluaran;
        
        System.out.println("Total gaji lembur Mr John selama seminggu = " + TotalGajiLemburSeminggu);
        
        System.out.println("Apakah Mr John bisa menabung atau tidak??");
        System.out.println("==========================================");
        
        if(TotalGajiLemburSeminggu > pengeluaran){
            System.out.println("Bisa Menabung");
            System.out.println("Besar tabungannya untuk minggu ini adalah " + tabungan);
        } else if(TotalGajiLemburSeminggu == pengeluaran){
            System.out.println("Tidak Bisa Menabung");
        } else{
            System.out.println("Cari Tambahan");
        }
    }
    
}
