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
public class Persegi extends BangunDatar {
    // construct method
    // input data
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    // atributte
    private double
            sisi;
    
    // method  
    @Override
    public void hitungLuas(){
        this.luas =  sisi * sisi;
    }
    
    public void hitungKeliling(){
        this.keliling = 4 * sisi;
    }
}
