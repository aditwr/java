/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagorasproject;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class program2 {
    double a,b, sisi_miring;
    Scanner input = new Scanner(System.in);
    
    void menghitung_sisi_miring(){
        System.out.println("Masukan sisi A : ");
        a = input.nextDouble();
        System.out.println("Masukan sisi B : ");
        b = input.nextDouble();
        
        Sisi_miring sm = new Sisi_miring(a, b);
        sisi_miring = sm.hitung_sisi_miring();
        
        // output
        System.out.println("Sisi Miring : " + sisi_miring);
    }
    
}
