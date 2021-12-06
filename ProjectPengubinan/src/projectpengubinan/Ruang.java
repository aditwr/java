/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author acer
 */
public class Ruang {
    // panjang ruang 
    int panjang;
    // lebar ruang 
    int lebar;
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
        // hitungluasnya
        return p.perkalian(this.panjang, this.lebar);
    }
}
