/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author acer
 */
public class ProjectLuasBangunKompleks {
// public : class diakses / dapat di instansiasi di class lain / class manapun
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat object dan hitung luas pesegi
        Persegi p = new Persegi();
        double luasPersegi = p.hitungLuas(42);
        
        // buat object dan hitung luas lingkaran * 2
        Lingkaran l = new Lingkaran();
        double luasLingkaran = l.hitungLuas(21);
        
        // hitung luas bangun total
        // luas total = luas persegi + luas lingkaran dikali 2
        double luasTotal = luasPersegi + (luasLingkaran*2);
        
        System.out.println("Luas Persegi : " + luasPersegi + " cm");
        System.out.println("Luas 1/2 Lingkaran : " + luasLingkaran/2 + " cm");
        System.out.println("Luas Total : " + luasTotal + " cm");
       
       
        System.out.println(l.hitungLuas(7)); 
    }
    
}

