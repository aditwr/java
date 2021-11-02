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
public class program3 {
    double a,c, sisi_siku_siku;
    Scanner input = new Scanner(System.in);
    
    void hitung_sisi_siku_siku(){
        // input
        System.out.println("Masukan Salah satu sisi Siku-siku : ");
        a = input.nextDouble();
        System.out.println("Masukan Sisi Miring : ");
        c = input.nextDouble();
        
        // instansiasi object sisi
        Sisi s = new Sisi(a, c);
        sisi_siku_siku = s.hitung_sisi_siku_siku();
        System.out.println("Sisi Siku-Siku : " + sisi_siku_siku);
    }
    
}
