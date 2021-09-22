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
public class Kerucut {
    // ATRIBUT
    public int r;
    public int t;
    public double s = Math.pow(( Math.pow(r, 2) + Math.pow(t, 2) ), (1/2));
    public double phi = 3.14;
    
    //Method
    public void hitungVol(){
        double volume;
        volume = ( phi * (r*r) * t )/3 ;
        System.out.println("Volume : " + volume);
    }
    public void hitungLuasSelimut(){
        double luasSelimut = phi * r * s;
        System.out.println("Luas Selimut : " + luasSelimut);
    }
}
