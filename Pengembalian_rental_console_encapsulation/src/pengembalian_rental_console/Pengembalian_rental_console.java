/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengembalian_rental_console;

// IMPORT SEMUA CLASS YANG DIBUTUHKAN TERLEBIH DAHULU 
import membership.Gold_Class;
import membership.Silver_Class;
import membership.Platinum_Class;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Pengembalian_rental_console {
    public static void main(String[] args) {
        Member MembersObject = new Member();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member              : ");
        MembersObject.member = input.nextLine();
        // CEK INDEX DATA
        int index = MembersObject.Get_Index_Member();
        if(index < 0){
            System.out.println("Member tidak ditemukan");
            System.exit(0);
        }
        
        // INPUT DATA TANGGAL
        // ASSIGN DATA TANGGAL KE ATTRIBUTE CLASS Hitung_Tanggal DENGAN SET METHOD
        // Terdapat proses validasi di dalam method nya
        Hitung_Tanggal date = new Hitung_Tanggal();
        
        System.out.print("Masukkan Tanggal Pinjam (1-31) 	: ");
        int day_1 = input.nextInt();
        date.set_day_1(day_1);
        
        System.out.print("Masukkan Bulan Pinjam (1-12)	: ");
        int month_1 = input.nextInt();
        date.set_month_1(month_1);
        
        System.out.print("Masukkan Tahun Pinjam (2000 - 3000)  : ");
        int year_1 = input.nextInt();
        date.set_year_1(year_1);
       
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        int day_2 = input.nextInt();
        date.set_day_2(day_2);
        
        System.out.print("Masukkan Bulan Kembali (1-12)	: ");
        int month_2 = input.nextInt();
        date.set_month_2(month_2);
        
        
        System.out.print("Masukkan Tahun Kembali (2000 - 3000)  : ");
        int year_2 = input.nextInt();
        date.set_year_2(year_2);
        
        
   
        System.out.println("RESULT : ");
        String membership_type = MembersObject.Membership();
        
        
        
        // IF UNTUK MENENTUKAN JENIS MEMBERSHIP
        if(membership_type == "Silver"){
            Silver_Class silver_class = new Silver_Class(1, 25000, 1, date.Menghitung_Jumlah_Hari());
            
            System.out.println("Tanggal Pinjam	: " + date.get_day_1() + "-" + date.get_month_1() + "-" + date.get_year_1());
            System.out.println("Tanggal Kembali	: " + date.get_day_2() + "-" + date.get_month_2() + "-" + date.get_year_2());
            System.out.print("Lama Sewa	: ");
            System.out.println( date.Menghitung_Jumlah_Hari() +" hari");
            System.out.println("");
            System.out.println("Total Sewa	: " + silver_class.Hitung_Biaya_Sewa());
            System.out.println("Jumlah Poin	: " + silver_class.Hitung_Poin());
        }
        else if (membership_type == "Gold"){
            Gold_Class gold_class = new Gold_Class(2, 3000, 5, date.Menghitung_Jumlah_Hari(), 5000);  
            System.out.println(gold_class.biaya_sewa_perhari);
            System.out.println("");
            System.out.println("Tanggal Pinjam	: " + date.get_day_1() + "-" + date.get_month_1() + "-" + date.get_year_1());
            System.out.println("Tanggal Kembali	: " + date.get_day_2() + "-" + date.get_month_2() + "-" + date.get_year_2());
            System.out.print("Lama Sewa	: ");
            System.out.println( date.Menghitung_Jumlah_Hari() +" hari");
            System.out.println("");
            System.out.println("Total Sewa	: " + gold_class.Hitung_Biaya_Sewa());
            System.out.println("Jumlah Poin	: " + gold_class.Hitung_Poin());
            System.out.println("Jumlah Cashback : " + gold_class.Hitung_Cashback());
        }
        else if (membership_type == "Platinum"){
            Platinum_Class platinum_class = new Platinum_Class(3, 45000, 10, date.Menghitung_Jumlah_Hari(), 10000, 5000);

            System.out.println("");
            System.out.println("Tanggal Pinjam	: " + date.get_day_1() + "-" + date.get_month_1() + "-" + date.get_year_1());
            System.out.println("Tanggal Kembali	: " + date.get_day_2() + "-" + date.get_month_2() + "-" + date.get_year_2());
            System.out.print("Lama Sewa	: ");
            System.out.println( date.Menghitung_Jumlah_Hari() +" hari");
            System.out.println("");
            System.out.println("Total Sewa	: " + platinum_class.Hitung_Biaya_Sewa());
            System.out.println("Jumlah Poin	: " + platinum_class.Hitung_Poin());
            System.out.println("Jumlah Cashback : " + platinum_class.Hitung_Cashback());
            System.out.println("Bonus Pulsa     : " + platinum_class.Hitung_Pemberian_Pulsa());
        }

    }
    }
    
