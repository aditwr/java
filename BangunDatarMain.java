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
public class BangunDatarMain {
    public static void main(String[] args){
        // Instansiasi
        PersegiPanjang pp1 = new PersegiPanjang();
        // Assign Attribut 
        pp1.panjang = 25;
        pp1.lebar = 38;
        // Call & Excecute Method
        pp1.hitungLuas();
        pp1.hitungKeliling();
    }
    
}
