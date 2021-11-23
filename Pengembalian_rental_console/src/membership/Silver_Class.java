/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership;

/**
 *
 * @author acer
 */
public class Silver_Class {
    public Silver_Class(int disc, int biaya_sewa, int poin, int jumlah_hari){
        this.nominal_discount = disc;
        this.biaya_sewa_perhari = biaya_sewa;
        this.poin = poin;
        this.jumlah_hari = jumlah_hari;
    }
    // ATTRIBUTE 
    public int nominal_discount, biaya_sewa_perhari, poin, nominal_cashback,nominal_pulsa,jumlah_hari;
    
    // MENGHITNG TOTAL BIAYA SEWA CONSOLE
    public int Hitung_Biaya_Sewa(){
        return ( biaya_sewa_perhari * (100-nominal_discount)/100 ) * jumlah_hari;
    }
    // MENGHITUNG POIN
    public int Hitung_Poin(){
        return poin * jumlah_hari;
    }
    
    
}
