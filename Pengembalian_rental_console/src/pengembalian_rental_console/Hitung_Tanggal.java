/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengembalian_rental_console;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Hitung_Tanggal {
    private int day_1,month_1,year_1,day_2,month_2,year_2,day,month,year,jumlah_hari;
    
    // INPUT DATE
    void Input_Tgl(){
        // INPUT OBJECT
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Tanggal Pinjam (1-31) 	: ");
        day_1 = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)	: ");
        month_1 = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam           : ");
        year_1 = input.nextInt();
       
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        day_2 = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)	: ");
        month_2 = input.nextInt();
        System.out.print("Masukkan Tahun Kembali          : ");
        year_2 = input.nextInt();
    }

    
    // JUMLAH HARI
    public int Menghitung_Jumlah_Hari(){
        LocalDate from = LocalDate.of(year_1, month_1, day_1);
        LocalDate to = LocalDate.of(year_2, month_2, day_2);
        Period period = Period.between(from, to);
        
        
        day = period.getDays();
        month = period.getMonths()*30;
        year = period.getYears()*360;
        
        jumlah_hari = day + month + year;
        return  jumlah_hari;
    }
    
    // PROCESS AND DISPLAY THE DATE RESULT
    void Tanggal(){
        LocalDate from = LocalDate.of(year_1, month_1, day_1);
        LocalDate to = LocalDate.of(year_2, month_2, day_2);
        Period period = Period.between(from, to);
        
        System.out.println("Tanggal Pinjam	: " + day_1 + "-" + month_1 + "-" + year_1);
        System.out.println("Tanggal Kembali	: " + day_2 + "-" + month_2 + "-" + year_2);
        System.out.print("Lama Sewa	: ");
        System.out.println( Menghitung_Jumlah_Hari() +" hari");
    }
    
    
}
