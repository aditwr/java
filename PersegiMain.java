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
public class PersegiMain {
    public static void main(String[] args){
        // Instansiasi
        Persegi p1 = new Persegi();
        // Assign Atribute
        p1.sisi = 10;
        // Call Method
        p1.hitungLuas();
        p1.hitungKeliling();
        
        // Instansiasi
        Persegi p2 = new Persegi();
        // Assign Atribute
        p2.sisi = 15;
        // Call Method
        p2.hitungLuas();
        p2.hitungKeliling();
    }

}
