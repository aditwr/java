/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagorasproject;

/**
 *
 * @author acer
 */
public class Sisi {
    Sisi(double a, double c){
        this.a = a;
        this.c = c;
    }
    double a,c;
    
    double hitung_sisi_siku_siku(){
        double sisi_siku_siku = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
        return sisi_siku_siku;
    }
}
