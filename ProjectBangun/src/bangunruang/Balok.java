/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author acer
 */
public class Balok extends BangunRuang{
    // constract 
    public Balok(double panjang, double lebar, double tinggi){
        this.p = panjang;
        this.l = lebar;
        this.t = tinggi;
    }
    
    // attribute
    private double 
            p,
            l,
            t;
    
    // method
    @Override
    public void hitungVolume(){
        this.volume = p * l * t;
    }
    public void hitungLuasPermukaan(){
        this.luas_permukaan = 2*(p*l + l*t + p*t);
    }
}
