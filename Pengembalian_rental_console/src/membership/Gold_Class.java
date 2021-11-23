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
public class Gold_Class extends Silver_Class {
    public Gold_Class(int disc, int biaya_sewa, int poin, int jumlah_hari, int cashback){
        super(disc, biaya_sewa, poin, jumlah_hari);
        this.nominal_cashback = cashback;
    }
    // MENGHITUNG CASHBACK MEMBER
    public int Hitung_Cashback(){
        return nominal_cashback * jumlah_hari;
    }
}
