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
public class program1 {
    // define attribute
    double a, b, c, sisi_miring;
    // instace input object]
    Scanner input = new Scanner(System.in);
    
    void cek_triple_pythagoras(){
       System.out.println("Masukan sisi siku-siku 1 : ");
       a = input.nextDouble();
       System.out.println("Masukan sisi siku-siku 2 : ");
       b = input.nextDouble();
       System.out.println("Masukan sisi miring : ");
       c = input.nextDouble();
       
       // instansiasi object Sisi_miring
       Sisi_miring sm = new Sisi_miring(a, b);
       sisi_miring = sm.hitung_sisi_miring();
       
       if( c == sisi_miring ){
           System.out.println("Segitiga " + a +", " + b + ", " + c + " memenuhi Triple Pythagoras" );
           System.out.println("Jenis: Segitiga Siku-siku ");
       }
       else {
           System.out.println("Segitiga " + a +", " + b + ", " + c + " bukan Triple Pythagoras" );
           System.out.println("Jenis: Bukan Segitiga Siku-siku ");
       }
    }
    
}
