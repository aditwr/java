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
    
    // ==== USING ENCAPSULATION HERE ====
    // SET & GET METHOD UNTUK ATTRIBUTE ( ATTRIBUTE DIBUAT READ-WRITE )
    // SET METHOD UNTUK ATTRIBUTE
    public void set_day_1(int day){
        if(day > 0 && day <=31) {
            this.day_1 = day;
        } else {
            System.out.println("Inputan salah! Program akan di hentikan...");
            System.exit(0);
        }
    }
    public void set_month_1(int month){
        if(month > 0 && month <=12) {
            this.month_1 = month;
        } else {
            System.out.println("Inputan salah! Program akan di hentikan...");
            System.exit(0);
        }       
    }
    public void set_year_1(int year){
        if(year >= 2000 && year <=3000) {
            this.year_1 = year;
        } else {
            System.out.println("Inputan salah! Program akan di hentikan...");
            System.exit(0);
        }      
    }
    
    public void set_day_2(int day){
        if(day > 0 && day <=31) {
            this.day_2 = day;
        } else {
            System.out.println("Inputan salah! Program akan di hentikan...");
            System.exit(0);
        }
    }
    public void set_month_2(int month){
        if(month > 0 && month <=12) {
            this.month_2 = month;
        } else {
            System.out.println("Inputan salah! Program akan di hentikan...");
            System.exit(0);
        } 
    }
    public void set_year_2(int year){
        if(year >= 2000 && year <=3000) {
            this.year_2 = year;
        } else {
            System.out.println("Inputan salah! Program akan di hentikan...");
            System.exit(0);
        }    
    }
    
    
    
    // GET METHOD UNTUK ATTRIBUTE
    public int get_day_1(){
        return day_1;
    }
    public int get_month_1(){
        return month_1;
    }
    public int get_year_1(){
        return year_1;
    }
    
    public int get_day_2(){
        return day_2;
    }
    public int get_month_2(){
        return month_2;
    }
    public int get_year_2(){
        return year_2;
    }
    

    
    // JUMLAH HARI
    public int Menghitung_Jumlah_Hari(){
        LocalDate from = LocalDate.of(this.year_1, this.month_1, this.day_1);
        LocalDate to = LocalDate.of(this.year_2, this.month_2, this.day_2);
        Period period = Period.between(from, to);
        
        
        day = period.getDays();
        month = period.getMonths()*30;
        year = period.getYears()*360;
        
        jumlah_hari = day + month + year;
        return  jumlah_hari;
    }    
    
    
}
