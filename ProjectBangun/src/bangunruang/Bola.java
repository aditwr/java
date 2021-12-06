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
public class Bola extends BangunRuang{
    // construct 
    public Bola(double r){
        this.r = r;
        this.phi = Math.PI;
    }
    
    // attribute
    private double
            r,
            phi;
    
    // method
    @Override
    public void hitungVolume(){
        this.volume = 4/3*phi* Math.pow(r, 3);
    }
    @Override
    public void hitungLuasPermukaan(){
        this.luas_permukaan = 4*phi*Math.pow(r, 2);
    }
}
