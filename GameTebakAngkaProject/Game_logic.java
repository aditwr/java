/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author acer
 */
public class Game_logic {
    Random random_integer = new Random();
    int i = random_integer.nextInt(100), user_input;
    Scanner input = new Scanner(System.in);
    
    void menebak_angka(){
        int banyak_percobaan = 0;
        
        do {
            System.out.println("");
            System.out.println("Masukan Angka Tebakan Anda : ");
            user_input = input.nextInt();
            
            if(user_input > i) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if(user_input < i){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            }
        } while (user_input != i );
    }
    
}
