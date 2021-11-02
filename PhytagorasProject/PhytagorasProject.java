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
public class PhytagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instance input object
        Scanner input = new Scanner(System.in);
        System.out.println(" [ Pythagoras ] : Menu ");
        System.out.println("1 Cek Triple Pythagoras");
        System.out.println("2 Menentukan Sisi Miring");
        System.out.println("3 Menentukan Sisi Siku-sikku");
        System.out.println("4 Exit");
        System.out.println("");
        System.out.println("Pilih Menu (angka) : ");
        int user_input = input.nextInt();
        
        switch(user_input){
            case 1 : 
                program1 p1 = new program1();
                p1.cek_triple_pythagoras();
                break;
            case 2 : 
                program2 p2 = new program2();
                p2.menghitung_sisi_miring();
                break;
            case 3 : 
                program3 p3 = new program3();
                p3.hitung_sisi_siku_siku();
                break;
            case 4 : 
                System.exit(0);
                break;
            default : System.out.println("Angka yang dimasukan salah!");
        }
        
    }
    
}
