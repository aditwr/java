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
public class LingkaranMain {
    public static void main(String[] args){
        Lingkaran l1 = new Lingkaran();
        l1.r = 25;
        l1.hitungLuas();
        l1.hitungKeliling();
        
        Lingkaran l2 = new Lingkaran();
        l2.r = 37;
        l2.hitungLuas();
        l2.hitungKeliling();
    }
}
