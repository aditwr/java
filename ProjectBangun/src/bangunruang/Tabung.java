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
public class Tabung extends BangunRuang{
    // constract 
    public Tabung(double r, double tinggi){
        this.r = r;
        this.t = tinggi;
    }
    
    // attribute
    private double 
            r,
            t,
            luas_alas,
            keliling_alas;
    
    // method
    @Override
    public void hitungVolume(){
        this.volume = Math.PI * Math.pow(r, 2)*t;
    }
    public void hitungLuasPermukaan(){
        this.luas_permukaan = (2*hitungLuasAlas()) + 
                (hitungKelilingAlas() * t);
    }
    
    public double hitungLuasAlas(){
        this.luas_alas = Math.PI * Math.pow(r, 2);
        return this.luas_alas;
    }
    public double hitungKelilingAlas(){
        this.keliling_alas = 2*Math.PI*r;
        return this.keliling_alas;
    }
}
