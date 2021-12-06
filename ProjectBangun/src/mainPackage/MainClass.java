/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author acer
 */
public class MainClass {
    public static void main(String[] args ){
        // menghitung luas bangun datar 
        System.out.println("Persegi : ");
        Persegi persegi = new Persegi(8);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.tampilHasil();
        System.out.println("-----");
        
        System.out.println("Persegi Panjang : ");
        PersegiPanjang persegi_panjang = new PersegiPanjang(10, 6);
        persegi_panjang.hitungLuas();
        persegi_panjang.hitungKeliling();
        persegi_panjang.tampilHasil();
        System.out.println("-----");
        
        System.out.println("Lingkaran : ");
        Lingkaran lingkaran = new Lingkaran(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilHasil();
        System.out.println("-----");
        
        // menghitung luas bangun ruang
        System.out.println("Balok : ");
        Balok balok = new Balok(16, 8, 5);
        balok.hitungVolume();
        balok.hitungLuasPermukaan();
        balok.tampilHasil();
        System.out.println("------");
        
        System.out.println("Tabung : ");
        Tabung tabung = new Tabung(7, 10);
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();
        tabung.tampilHasil();
        System.out.println("------");
        
        System.out.println("Bola : ");
        Bola bola = new Bola(7);
        bola.hitungVolume();
        bola.hitungLuasPermukaan();
        bola.tampilHasil();
        System.out.println("------");
    }
}
