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
public class Platinum_Class extends Gold_Class{
    public Platinum_Class(int disc, int biaya_sewa, int poin, int jumlah_hari, int cashback, int pulsa){
        super(disc, biaya_sewa, poin, jumlah_hari, cashback);
        this.nominal_pulsa = pulsa;
    }
    // MENGHITUNG JUMLAH PULSA 
    public int Hitung_Pemberian_Pulsa(){
        return nominal_pulsa * jumlah_hari;
    }
    
}
