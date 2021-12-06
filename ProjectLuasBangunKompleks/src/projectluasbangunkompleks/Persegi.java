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
public class Persegi {
    double hasil, luas;
    
    public double perkalian(double a, double b) {
        double hasil = a * b;
        return hasil;
    }
    protected double hitungLuas(double s){
        double luas = perkalian(s, s);
        return luas;
    }
    // access modifier mengatur aturan akses atribut dan method 
    
    
}
