/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author acer
 */
public abstract class Mobil {  
    /*
    class Mobil ini digunakan sebagai class abstract. class ini mendefinisikan
    sebagian besar struktur class untuk digunakan di child class nya nantinya
    child class / subclass akan dibuat di package yang sama
    */
    // attribute
    private String
            nama,
            jenis;
    protected String
            perjalanan;
    
    private double
            kecepatan_rata_rata,
            jarak_tempuh_per_liter;
    
    // method
    // abstract method
    public abstract double getJarakPerjalanan();
    
    // setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJenis(String nama){
        this.jenis = jenis;
    }
    public void setKecepatanRataRata(double v){
        this.kecepatan_rata_rata = v;
    }
    public void setJarakTempuhPerLiter(double s){
        this.jarak_tempuh_per_liter = s;
    }
    
    // getter 
    public String getNama(){
        return this.nama;
    }
    public String getJenis(){
        return this.jenis;
    }
    public double getKecepatanRataRata(){
        return this.kecepatan_rata_rata;
    }
    public double getJarakTempuhPerLiter(){
        return this.jarak_tempuh_per_liter;
    }
}
