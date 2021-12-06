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
public class Lingkaran extends BangunDatar{
    // construct method
    // input requirement data
    public Lingkaran(double r){
        this.r = r;
    }
    
    // attribute 
    private double r;
    
    // method
    @Override
    public void hitungLuas(){
        this.luas = Math.PI * Math.pow(r, 2);
    }
    public void hitungKeliling(){
        this.keliling = 2 * Math.PI * r;
    }
}
