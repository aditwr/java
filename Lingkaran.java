/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author acer
 */
public class Lingkaran {
    // ATTRIBUT 
    public int r;
    public double phi = 3.14;

    
    // METHOD
    public void hitungLuas(){
        double luas = phi * (r*r);
        System.out.println("Luas : " + luas);
    }
    public void hitungKeliling(){
        double keliling = phi * (2*r);
        System.out.println("Keliling : " + keliling);
    }
}
