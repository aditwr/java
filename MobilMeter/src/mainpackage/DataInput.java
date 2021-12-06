/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class DataInput {
    /*
    class ini digunakan khusus untuk input data yang dibutuhkan.
    class ini akan diinstansiasi di main class
    */
    
    // property
    public String
            nama_mobil,
            jenis_mobil,
            perjalanan;
    public double 
            kecepatan_rata_rata;
    protected Scanner input = new Scanner(System.in);
    
    
    // method
    public void inputDataNamaMobil(){
        System.out.print("Masukan Nama Mobil : ");
        this.nama_mobil =  input.nextLine();
    }
    public void inputDataJenisMobil(){
        System.out.print("Masukan Jens Mobil : ");
        this.jenis_mobil = input.nextLine();
    }
    public void inputDataKecepatanRataRata(){
        System.out.print("Msukan Kecepatan Rata-Rata : ");
        this.kecepatan_rata_rata = input.nextDouble();
    }
    public void inputDataPerjalanan(){
        System.out.print("Masukan Perjalanan example: 'solo-jakarta' : ");
        this.perjalanan = input.nextLine();
    }
}
