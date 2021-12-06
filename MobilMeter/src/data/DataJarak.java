package data;


import java.util.HashMap;
import mobil.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class DataJarak {
    /*
    class ini digunakan untuk menyimpan data jarak perjalanan. 
    data jarak perjalanan ini akan digunakan di class MobilMeter 
    untuk proses perhitungan
    */
    // constructor
    public DataJarak(){
        this.data_jarak = new HashMap<String, Integer>();
        this.data_jarak.put("solo-kudus", 10);
        this.data_jarak.put("solo-jakarta", 30);
        this.data_jarak.put("solo-banten", 2);
        this.data_jarak.put("solo-bandung", 5);
        this.data_jarak.put("solo-banyuwangi", 10);
        this.data_jarak.put("solo-jember", 2);
    }
    
    // property
    // property bertype object HashMap
    private HashMap<String, Integer> data_jarak;
    
    // getter 
    public double getDataJarak(String perjalanan){
        return this.data_jarak.get(perjalanan);
    }
}
