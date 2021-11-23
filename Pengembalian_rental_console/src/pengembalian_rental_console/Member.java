/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengembalian_rental_console;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import data_member.Data_Member;
/**
 *
 * @author acer
 */
public class Member {
    Data_Member members = new Data_Member();
    String member;
    public int Get_Index_Member(){  
        members.tambah_data("M001");
        members.tambah_data("M002");
        members.tambah_data("M003");

        // GET INDEX
        int i = binarySearch(members.id_member, member);
        return i;
    }

   
    public String Membership(){
        int n = Get_Index_Member();
        String item = members.data_member[n][1];
        String membership_type = null;
        
        if (item == "Silver") {
            membership_type= "Silver";
        } else if (item == "Gold"){
            membership_type= "Gold";
        } else if (item == "Platinum"){
            membership_type= "Platinum";
        }
        System.out.println("ID Member       : " + members.id_member.get(n));
        System.out.println("Nama Member     : " + members.data_member[n][0]);
        System.out.println("Jenis Member    : " + members.data_member[n][1]);
        // RETURN TYPE MEMBERSHIP, AKAN DIGUNAKAN DI MAIN METHOD
        return membership_type;
    }
}
