/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

import data.DataJarak;

/**
 *
 * @author acer
 */
public class MPV extends Mobil{
    // construct
    public MPV(String nama){
        super.setNama(nama);
        super.setJenis("MPV");
        super.setJarakTempuhPerLiter(10);
    }
    
    
    // method 
    
    // setter perjalanan
    public void setPerjalanan(String perjalanan){
        this.perjalanan = perjalanan;
    }
    
    public double getJarakPerjalanan(){
        DataJarak data_jarak = new DataJarak();
        double jarak = data_jarak.getDataJarak(this.perjalanan);
        return jarak;
    }
}
