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
public class Tabung {
    // ATRIBUT
    public int r;
    public int t;
    public double phi = 3.14;
    
    //Method
    public void hitungVol(){
        double volume = t * (r*r) * phi;
        System.out.println("Volume : " + volume);
    }
    public void hitungLuasSelimut(){
        double luasSelimut = 2 * phi * r * t;
        System.out.println("Luas Selimut : " + luasSelimut);
    }
    
    
}
