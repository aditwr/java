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
public class PersegiPanjang {
    // ATTRIBUT
    public int panjang;
    public int lebar;
    
    public void hitungLuas(){
        int luas = panjang * lebar;
        System.out.println("Luas : " + luas);
    }
    
    public void hitungKeliling(){
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling : " + keliling);
    }
}
