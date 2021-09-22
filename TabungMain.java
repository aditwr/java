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
public class TabungMain {
    public static void main(String[] args){
        // Instansiasi
        Tabung t1 = new Tabung();
        // Assign Atribute
        t1.r = 7;
        t1.t = 10;
        
        // Call Method
        t1.hitungVol();
        t1.hitungLuasSelimut();
    }
}
