/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author acer
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HITUNG LUAS DAN KELILING 
        
        // PERSEGI PANJANG
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println(pp.hitungLuas(10, 5));
        System.out.println(pp.hitungKeliling(10, 5));
                
        System.out.println(pp.hitungLuas(3.6, 8));
        System.out.println(pp.hitungKeliling(3.6, 8));
                
        System.out.println(pp.hitungLuas(6, 8.3));
        System.out.println(pp.hitungKeliling(6, 8.3));
        
        System.out.println(pp.hitungLuas(5.6, 8.8));
        System.out.println(pp.hitungKeliling(5.6, 8.8));
        
        // PERSEGI
        Persegi p = new Persegi();
        System.out.println(p.hitungLuas(4.5));
        System.out.println(p.hitungKeliling(4.5));
        
        System.out.println(p.hitungLuas(7));
        System.out.println(p.hitungKeliling(7));
        
        // LINGKARAN 
        Lingkaran l = new Lingkaran();
        System.out.println(l.hitungLuas(5));
        System.out.println(l.hitungKeliling(5));
        
        System.out.println(l.hitungLuas(7.4));
        System.out.println(l.hitungKeliling(7.4));
        
        // SEGITIGA 
        Segitiga s = new Segitiga();
        System.out.println(s.hitungLuas(8, 10));
        System.out.println(s.hitungKeliling(8, 10));
        
        System.out.println(s.hitungLuas(8, 11.5));
        System.out.println(s.hitungKeliling(8, 11.5));
        
        System.out.println(s.hitungLuas(12.2, 9));
        System.out.println(s.hitungKeliling(12.2, 9));
        
        System.out.println(s.hitungLuas(13.9, 20.7));
        System.out.println(s.hitungKeliling(13.9, 20.7));
        
    }
    
}
