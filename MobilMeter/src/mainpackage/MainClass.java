/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;
import data.DataJarak;
import mobil.*;
/**
 *
 * @author acer
 */
public class MainClass {
    // main method
    public static void main(String[] args){
        // 1. Menentukan jumlah bahan bakar minimal ( jarak / jarak_tempuh_per_liter )
        // 2. Menentukan waktu pejalanan ( t = jarak / kecepatan_rata_rata )
    
        // instansiasi object input
        DataInput data_input = new DataInput();
        // memasukan data nama mobil 
        data_input.inputDataNamaMobil();
        // memasukan data jenis mobil
        data_input.inputDataJenisMobil();
        // memasukan data perjalanan
        data_input.inputDataPerjalanan();
        // memasukan data kecepatan rata - rata mobil
        data_input.inputDataKecepatanRataRata();
        
        
        // jenis mobil menentukan class apa yang akan di instansiasi
        // pendefinisian variable untuk perhitungan, penambahan default_value
        double  jarak = 0,
                kecepatan_rata_rata = 0,
                jarak_tempuh_per_liter = 0;
                
        switch(data_input.jenis_mobil.toLowerCase()){
            case "sedan":
                // instansiasi object class sedan
                Sedan mobil_sedan = new Sedan( data_input.nama_mobil );
                // set kecepatan di class sedan
                mobil_sedan.setKecepatanRataRata( data_input.kecepatan_rata_rata );
                //  set perjalanan, ini akan dgunakan di method getJarakPerjalanan
                mobil_sedan.setPerjalanan( data_input.perjalanan );
                
                // persiapan proses komputasi dengan class MobilMeter
                // hitung jarak perjalanan dan simpan ke variabel
                jarak = mobil_sedan.getJarakPerjalanan();
                // masukan value jarak_tempuh_per_liter ke dalam variabel
                jarak_tempuh_per_liter = mobil_sedan.getJarakTempuhPerLiter();
                // masukan value kecepatan_rata_rata ke dalam variabel
                kecepatan_rata_rata = mobil_sedan.getKecepatanRataRata(); 
                System.out.println();
                
                break;
                
            case "suv" :
                SUV mobil_suv = new SUV( data_input.nama_mobil );
                mobil_suv.setKecepatanRataRata( data_input.kecepatan_rata_rata );
                mobil_suv.setPerjalanan( data_input.perjalanan );
                
                jarak = mobil_suv.getJarakPerjalanan();
                jarak_tempuh_per_liter = mobil_suv.getJarakTempuhPerLiter();
                kecepatan_rata_rata = mobil_suv.getKecepatanRataRata();
                break;
                
            case "mpv" : 
                MPV mobil_mpv = new MPV( data_input.nama_mobil );
                mobil_mpv.setKecepatanRataRata( data_input.kecepatan_rata_rata );
                mobil_mpv.setPerjalanan( data_input.perjalanan );
                
                jarak = mobil_mpv.getJarakPerjalanan();
                jarak_tempuh_per_liter = mobil_mpv.getJarakTempuhPerLiter();
                kecepatan_rata_rata = mobil_mpv.getKecepatanRataRata();
                break;
                
            default: 
                System.out.println(" !input tidak sesuai");
                System.exit(0);
        }
        
        // instansiasi class MobilMeter sebagai class khusus untuk proses perhitungan
        MobilMeter mobilmeter = new MobilMeter();
        // melakukan perhitungan dengan method mobilmeter
        mobilmeter.hitungJumlahMinimalBahanBakar(jarak, jarak_tempuh_per_liter);
        mobilmeter.hitungWaktuPerjalanan(jarak, kecepatan_rata_rata);
        
        // menampilkan semua hasil akhir output
        System.out.println(" // OUTPUT // ");
        System.out.println("Nama Mobil      : " + data_input.nama_mobil);
        System.out.println("Jenis Mobil     : " + data_input.jenis_mobil);
        System.out.println("Perjalanan      : " + data_input.perjalanan);
        
        // menampilkan output mesin mobilmeter
        mobilmeter.tampilkanOutputMobilMeter();

    }
}
