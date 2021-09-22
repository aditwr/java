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
public class Persegi {
    // ATTRIBUT 
    public int sisi;
    
    // METHOD
    public void hitungLuas(){
        int luas = sisi * sisi;
        System.out.println("Luas : " + luas);
    }
    public void hitungKeliling(){
        int keliling = 4 * sisi;
        System.out.println("Keliling : " + keliling);
    }
    
}
