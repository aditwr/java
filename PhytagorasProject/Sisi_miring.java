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
public class Sisi_miring {
    Sisi_miring(double a, double b){
        this.a = a;
        this.b = b;
    }
    double a, b;
    double hitung_sisi_miring(){
        double sisi_miring = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return sisi_miring;
    }
}
