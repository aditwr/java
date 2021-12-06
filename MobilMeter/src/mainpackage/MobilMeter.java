/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author acer
 */
public class MobilMeter {
    /* 
    class ini sebagai mesin/program utama menghitung jumlah minimal
    bahan bakar dan waktu perjalanan
    class ini akan di instansiasi di main class
    */
    // construct
    
    // property
    private double
            jumlah_minimal_bahan_bakar,
            waktu_perjalanan;
    
    // method
    public void hitungJumlahMinimalBahanBakar
        (double jarak, double jarak_tempuh_per_liter){
        this.jumlah_minimal_bahan_bakar = jarak / jarak_tempuh_per_liter;
    }
    
    public void hitungWaktuPerjalanan
        (double jarak, double kecepatan_rata_rata){
        this.waktu_perjalanan = jarak / kecepatan_rata_rata;    
    }
        
    public void tampilkanOutputMobilMeter(){
        System.out.println("Jumlah Minimal Bahan Bakar : " + this.jumlah_minimal_bahan_bakar + " Liter");
        System.out.println("Lama Waktu Perjalanan : +- " + this.waktu_perjalanan + " Jam");
}   }
