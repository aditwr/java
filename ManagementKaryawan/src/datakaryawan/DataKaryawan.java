/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class DataKaryawan implements FungsiDataKaryawan {
    // attribute
    ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
    
    
    // method tambah karyawan
    
    @Override
    public void tambahKaryawan(Karyawan data){
        this.dataKaryawan.add(data);
    }
    
    // hapus karyawan
    boolean terhapus = false;
    @Override
    public void hapusKaryawan(String kode_karyawan ){
        for(int i = 0; i < this.dataKaryawan.size(); i++){
            if( this.dataKaryawan.get(i).kode_karyawan.equals(kode_karyawan)){
                //hapus
                this.dataKaryawan.remove(i);
                terhapus = true;
                System.out.println("data ditemukan");
            }
        }
        
        if( terhapus ){
            System.out.println("Data Karyawan Berhasil dihapus!");
        } else {
            System.out.println("Data Karyawan tidak ditemukan, Gagal menghapus!");
        }
    }
    
    // cari karyawan 
    boolean ditemukan = false;
    int index = 0;
    @Override
    public void cariKaryawan(String kode){
        for(int i = 0; i < this.dataKaryawan.size(); i++){            
            if( this.dataKaryawan.get(i).kode_karyawan.equals(kode) ){
                // catat index
                index = i;
                ditemukan = true;
                System.out.println("data ditemukan");
            }
        }
        
        // cetak
        if( ditemukan ){
            this.dataKaryawan.get(index).print();
        }
        
    }
    
    // cetak data karyawan 
    @Override
    public void cetakKaryawan(){
        System.out.println("==================================");
        System.out.println("    DATA KARYAWAN");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(" KODE       NAMA            GOL     USIA    STATUS_NIKAH        JUMLAH ANAK ");
        System.out.println("-----------------------------------------------------------------------------");
    for( int i = 0; i < this.dataKaryawan.size(); i++){
        String kode = this.dataKaryawan.get(i).kode_karyawan;
        String nama = this.dataKaryawan.get(i).nama_karyawan;
        String gol = this.dataKaryawan.get(i).golongan;
        int usia = this.dataKaryawan.get(i).usia;
        String status_nikah = "Belum Menikah";
        int jumlah_anak = 0;
        if( this.dataKaryawan.get(i).status_menikah == 1 ){
            status_nikah = "Sudah Menikah";
            jumlah_anak = this.dataKaryawan.get(i).jumlah_anak;
        } else if( this.dataKaryawan.get(i).status_menikah == 0 ){
            status_nikah = "Belum Menikah";
            jumlah_anak = 0;
        }
        System.out.println(" "+kode+"         "+nama+"        "+gol+"      "+usia+"        "+status_nikah+"           "+jumlah_anak);
        
    }
    
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Jumlah Data : " + this.dataKaryawan.size());
        System.out.println("");
    }
    
}
