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
public class PersegiPanjang extends BangunDatar{
    // construct 
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // attribute
    private double
            panjang, 
            lebar;
    
    // method
    @Override
    public void hitungLuas(){
        this.luas = panjang * lebar;
    }
    public void hitungKeliling(){
        this.keliling = 2*(panjang + lebar);
    }
    
}
