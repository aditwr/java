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
public abstract class BangunDatar {
    protected double
            luas,
            keliling;
    
    public abstract void hitungLuas();
    public abstract void hitungKeliling();
    public void tampilHasil(){
        System.out.println("Luasnya : " + this.luas + " satuan");
        System.out.println("Kelilingnya : " + this.keliling + " satuan");
    }
}
