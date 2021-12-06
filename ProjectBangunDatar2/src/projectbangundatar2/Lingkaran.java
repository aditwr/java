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
public class Lingkaran {
    // hitung luas
    double phi = 3.14;
    double hitungLuas(int r){
        return phi * (r * r);
    }
    double hitungLuas(double r){
        return phi * (r * r);
    }
    
    // hitung keliling 
    double hitungKeliling(int r){
        return 2 * phi * r;
    }
    double hitungKeliling(double r){
        return 2 * phi * r;
    }
}
