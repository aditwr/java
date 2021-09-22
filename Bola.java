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
public class Bola {
    // ATRIBUT
    public int r;
    public double phi = 3.14;
    
    //Method
    public void hitungVol(){
        double volume = ( 4 * phi * (r*r*r))/3;
        System.out.println("Volume : " + volume);
    }
    public void hitungLuasSelimut(){
        double luasSelimut = 4 * phi * (r*r);
        System.out.println("Luas Selimut / Luas Permukaan : " + luasSelimut);
    }
}
