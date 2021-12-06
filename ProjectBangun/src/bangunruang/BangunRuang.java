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
public abstract class BangunRuang {
    // attribute
    protected double
            volume, 
            luas_permukaan;
    
    // abstract method
    public abstract void hitungVolume();
    public abstract void hitungLuasPermukaan();
    
    public void tampilHasil(){
        System.out.println("Volume : " + this.volume + " satuan");
        System.out.println("Luas Permukaan " + this.luas_permukaan + " satuan");
    }
    
}
