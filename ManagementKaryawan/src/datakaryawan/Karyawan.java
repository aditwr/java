/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;
import java.util.Calendar;
/**
 *
 * @author acer
 */
public class Karyawan {
    // constructor
    public Karyawan(
        String kode,
        String nama,
        String alamat,
        String tgl_lahir,
        String golongan,
        int status_menikah,
        int jumlah_anak
    ){
        this.kode_karyawan = kode;
        this.nama_karyawan = nama;
        this.alamat = alamat;
        this.tanggal_lahir = tgl_lahir;
        this.golongan = golongan;
        this.status_menikah = status_menikah;
        this.jumlah_anak = jumlah_anak;
        
        // hitun usia
        // format : YYYY-MM-DD
        
        // inisialisasai kalender
        Calendar kalender = Calendar.getInstance();
        int tahun_sekarang = kalender.get(Calendar.YEAR);
        
        String str_tgl_lahir =  this.tanggal_lahir;
        String[] arrString = str_tgl_lahir.split("-");
        int tahun_lahir = Integer.parseInt( arrString[0] );
        
        int usia_sekarang = tahun_sekarang - tahun_lahir;
        this.usia = usia_sekarang;
        
        
        // penentuan gaji pokok
        switch (this.golongan) {
            case "a":
            case "A":
                this.gaji_pokok = 5000000;
                break;
            case "b":
            case "B":
                this.gaji_pokok = 6000000;
                break;
            case "c":
            case "C":
                this.gaji_pokok = 7000000;
                break;
        }
        
        
        // menentukan dan menghitung tunjangan suami/istri
        // nilai default
        switch( this.status_menikah ){
            case 1 : 
                this.tunjangan_berkeluarga = 10*this.gaji_pokok/100;
                this.status_tunjangan_keluarga = true;
                break;
        }
        
        
        // menentukan dan menghitung tunjangan pegawai
        // nilai default      
        if( this.usia > 30 ){
            this.tunjangan_pegawai = 15*this.gaji_pokok/100;
            this.status_tunjangan_pegawai = true;
            
        }
        
        
        
        // menentukan dan menghitung tunjangan anak
        switch( this.status_menikah ){
            case 1 :
                if( this.jumlah_anak > 0 ){
                    this.tunjangan_anak = this.jumlah_anak *5*this.gaji_pokok/100;
                    this.status_tunjangan_anak = true;
                }
                break;
        }
        
        // menentukan gaji kotor 
        this.gaji_kotor = this.gaji_pokok + this.tunjangan_berkeluarga + this.tunjangan_pegawai + this.tunjangan_anak;
        
        // menentukan potongan 
        this.potongan = 25*this.gaji_kotor/1000;
        
        // menentukan gaji bersih
        this.gaji_bersih = this.gaji_kotor - this.potongan;
        
    }
    
    // atribute
    public String kode_karyawan,
            nama_karyawan,
            alamat,
            tanggal_lahir,
            golongan;
    // default dianggap belum menikah dan belum memiliki anak
    public int status_menikah = 0,
            jumlah_anak = 0,
            usia,
            gaji_pokok = 5000000,
            tunjangan_berkeluarga = 0,
            tunjangan_pegawai = 0,
            tunjangan_anak = 0,
            gaji_kotor = 0,
            potongan = 0,
            gaji_bersih = 0
            ;
    boolean status_tunjangan_keluarga = false,
            status_tunjangan_pegawai = false,
            status_tunjangan_anak = false;
    
    // print object karyawan
    public void print(){
        System.out.println("=================================");
        System.out.println("    DATA PROFIL KARYAWAN");
        System.out.println("---------------------------------");
        System.out.println("Kode Karyawan   : " + this.kode_karyawan);
        System.out.println("Nama Karyawan   : " + this.nama_karyawan);
        System.out.println("Golongan        : " + this.golongan);
              

        System.out.println("Usia            : " + this.usia);
        
        // status menikah dan jumlah anak 
        switch( this.status_menikah ){
            case 0 :
                System.out.println("Status Menikah  : Belum Menikah");
                System.out.println("----------------------------------");
                break;
            
            case 1 :
                System.out.println("Status Menikah  : Sudah Menikah");
                System.out.println("Jumlah Anak     : " + this.jumlah_anak);
                System.out.println("----------------------------------");
        }
        
        
        System.out.println("Gaji Pokok              : Rp" + gaji_pokok);     
        
        if(this.status_tunjangan_keluarga){
            System.out.println("Tunjangan Suami/Istri   : Rp" + this.tunjangan_berkeluarga );
        }
        
        if(this.status_tunjangan_pegawai){
            System.out.println("Tunjangan Pegawai       : Rp" + this.tunjangan_pegawai);
        }
        
        if(this.status_tunjangan_anak){
           System.out.println("Tunjangan Anak          : Rp" + this.tunjangan_anak); 
        }
        
        System.out.println("---------------------------------- ( + )");
        
        
        System.out.println("Gaji Kotor              : Rp" + this.gaji_kotor);
        
        System.out.println("Potongan                : Rp" + this.potongan);
        
        System.out.println("---------------------------------- ( - )");
        System.out.println("Gaji Bersih             : Rp" + this.gaji_bersih);
        
        
        

    }
    
}
