/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author acer
 */
public class OperasiBilangan {
    // ATTRIBUT
    public int bilPertama;
    public int bilKedua;
    
    // METHODS
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil Penjumlahan : " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil Penguranganya : " + hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil Perkalianya : " + hasil);
    }
    
    public void hitungPembagian(){
        double hasil = bilPertama / bilKedua;
        System.out.println("Hasil Pembagianya : " + hasil);
    }
}
