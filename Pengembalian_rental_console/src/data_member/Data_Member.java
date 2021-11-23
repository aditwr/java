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
    public ArrayList<String> id_member = new ArrayList<>();
    
    public String[][] data_member = {
        {"Mr.X","Silver"},
        {"Mr.Y","Gold"},
        {"Mr.Z","Platinum"}
    };
    
    // MENAMBAHKAN DATA KE ARRAY
    public void tambah_data(String data){
        this.id_member.add(data);
    }
}
