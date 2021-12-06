/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author acer
 */
public class ProjectPengubinan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat objeck setiap ruang dengan attribute p & l
        Ruang A = new Ruang();
        A.panjang = 3;
        A.lebar = 3;
        
        Ruang B = new Ruang();
        B.panjang = 5;
        B.lebar = 2;
        
        Ruang C = new Ruang();
        B.panjang = 4;
        B.lebar = 3;
        
        // hitung luas total ruang 
        int totalLuasRuang = A.hitungLuas() + B.hitungLuas() + C.hitungLuas();
        
        // buat object ubin dengan attribute p & l 
        Ubin X = new Ubin();
        X.panjang = 40;
        X.lebar = 40;
        
        // hitung luas ubin
        double luasUbin = X.hitungLuas();
        System.out.println("Luas Total Ruangan : " + totalLuasRuang + "m");
        System.out.println("Luas Ubin : " + luasUbin + "cm");
        
        // hitung jumlah ubin yang diperlukan 
        double jumlahUbin = (totalLuasRuang*10000) / luasUbin;
        System.out.println("Banyaknya ubin yang diperlukan: " + jumlahUbin + " buah");
        
    }
    
}
