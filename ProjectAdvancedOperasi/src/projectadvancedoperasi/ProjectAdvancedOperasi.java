/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author acer
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object to call method
        Operasi o1 = new Operasi();
        
        // a
        int hasilA = o1.jumlahkan(3, 4);
        System.out.println("3 + 4 : " + hasilA);
        
        // b 
        int hasilB = o1.jumlahkan(4, 7, -9);
        System.out.println("4 + 7 + (-9) : " + hasilB);
   
        // c 
        double hasilC = o1.jumlahkan(3.4, -0.002, 0.12313);
        System.out.println("3.4 + (-0.002) + 0.12313 : " + hasilC);
        
        // perkalian 
        int hasilKali1 = o1.perkalian(4, 2);
        System.out.println("4 x 2 : " + hasilKali1);
        
        double hasilKali2 = o1.perkalian(2.5, 8.0);
        System.out.println("2.5 x 8.0 : " + hasilKali2);
    }
    
}
