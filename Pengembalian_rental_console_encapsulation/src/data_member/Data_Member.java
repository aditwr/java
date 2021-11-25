/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_member;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Data_Member {
    // ATRIBUT DATA MEMBER DALAM ARRAYLIST 
    
    // ==== USING ENCAPSULATION HERE ===
    // ATTRIBUTE ARRAY LIST INI DIBUAT READ-ONLY
    private ArrayList<String> id_member = new ArrayList<>();
    
    // ATTRIBUTE INI DIBUAT READ-ONLY
    private String[][] data_member = {
        {"Mr.X","Silver"},
        {"Mr.Y","Gold"},
        {"Mr.Z","Platinum"}
    };
    
    // GET METHOD UNTUK MENGAMBIL VALUE ATTRIBUTE
    public ArrayList get_arraylist(){
        return id_member;
    }
    public String[][] get_array_data_member(){
        return data_member;
    }
    
    // MENAMBAHKAN DATA KE ARRAY
    public void tambah_data(String data){
        this.id_member.add(data);
    }
}
