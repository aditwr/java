/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;
import data.*;
import java.util.HashMap;

/**
 *
 * @author acer
 */
public class Sedan extends Mobil{
    // construct
    public Sedan(String nama){
        super.setNama(nama);
        super.setJenis("Sedan");
        super.setJarakTempuhPerLiter(10);
    }
    
    
    // method 
    
    // setter perjalanan
    public void setPerjalanan(String perjalanan){
        this.perjalanan = perjalanan;
    }
    
    @Override
    public double getJarakPerjalanan(){
        DataJarak data_jarak = new DataJarak();
        double jarak = data_jarak.getDataJarak(this.perjalanan);
        return jarak;
    }
}
