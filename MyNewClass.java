/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author acer
 */
public class MyNewClass {
    public static void main (String[] args) {
        // Instansiasi
        OperasiBilangan op1 = new OperasiBilangan();
        // Assign Variable
        op1.bilPertama = 100;
        op1.bilKedua = 150;
        // Jalankan Methods
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        op1.hitungPerkalian();
        op1.hitungPembagian();
        
    }
}
