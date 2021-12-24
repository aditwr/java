/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementkaryawan;
import java.util.Scanner;
import datakaryawan.*;
/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // intansiasi object 
        DataKaryawan data_karyawan = new DataKaryawan();
        // diberi data karyawan default, untuk contoh saja
        data_karyawan.tambahKaryawan(new Karyawan("A1","Aditya Wahyu","Solo","2001-2-4","A",0,0));
        data_karyawan.tambahKaryawan(new Karyawan("A2","Dewi Kumalasari","Tasikmadu","1990-2-4","B",1,1));
        data_karyawan.tambahKaryawan(new Karyawan("A3","Budi Prihantoro","Solo","1980-2-4","C",1,3));
        
        
        boolean menu_utama = true;
        while( menu_utama ){
                       
            System.out.println("==================================");
            System.out.println( "MENU UTAMA - MANAGEMENT KARYAWAN");
            System.out.println("----------------------------------");
            System.out.println("1 Tambah Data");
            System.out.println("2 Hapus Data");
            System.out.println("3 Cari Data");
            System.out.println("4 Lihat Data");
            System.out.println("5 Exit");
            
            Scanner input = new Scanner( System.in );
            System.out.print("Menu Pilihan  : ");
            int pilihan_user = input.nextInt();
            
            switch( pilihan_user ){
                case 1 : 
                    boolean menu_tambah_data = true;
                    while( menu_tambah_data ){
                        System.out.println("==================");
                        System.out.println(" Menu Tambah Data");
                        System.out.println("------------------");
                        
                        // debug 
                        // terjadi keanehan disini, mungkin sedikit aneh saya 
                        // memasukan input yg tidak diguanakan, tapi ini untuk mengatasi keanehan 
                        // ketika input otomatis terisi nilai enter ( tiba-tiba ter skip )
                        System.out.println(" !masukan data yang diperlukan ");
                        String debug = input.nextLine();
                        // akhir solusi keanehan
                        
                        System.out.print("Masukan Kode Karyawan : ");
                        String kode_karyawan = input.nextLine();
                        System.out.print("Masukan Nama Karyawan : ");
                        String nama_karyawan = input.nextLine();
                        System.out.print("Masukan Alamat        : ");
                        String alamat = input.nextLine();
                        System.out.print("Masukan Tanggal Lahir ( YYYY-MM-DD ) :");
                        String tanggal_lahir = input.nextLine();
                        System.out.print("Masukan Golongan ( A/B/C )    : ");
                        String golongan = input.nextLine();
                        System.out.print("Masukan Status Menikah ( 0 -> belum, 1->sudah menikah ) : ");
                        int status_nikah = input.nextInt();
                        int jumlah_anak;
                        if( status_nikah == 1 ){
                            System.out.print("Jumlah Anak       : ");
                            jumlah_anak = input.nextInt();
                        } else {
                            status_nikah = 0;
                            jumlah_anak = 0;
                        }
                        
                        // buat object dan masukan ke dalam array list 
                        // buat object karyawan
                        Karyawan karyawan = new Karyawan(
                                kode_karyawan,
                                nama_karyawan,
                                alamat,
                                tanggal_lahir,
                                golongan,
                                status_nikah,
                                jumlah_anak
                        );
                        // masukan ke array list
                        data_karyawan.tambahKaryawan(karyawan);
                        
                        System.out.println("");
                        System.out.println(" !berhasil menambah");
                        System.out.println("");
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Tambah data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int pilihan_user_menu_tambah = input.nextInt();
                        if( pilihan_user_menu_tambah == 1 ){
                            menu_tambah_data = false;
                        }else if(pilihan_user_menu_tambah != 2) {
                            System.out.println(" !input salah");
                        }
                        
                        
                    }
                
                    break;
                
                case 2 : 
                    boolean menu_hapus_data = true;
                    while( menu_hapus_data ) {
                        // input 
                        System.out.println("==================");
                        System.out.println(" Menu Hapus Data");
                        System.out.println("------------------");
                        
                        // keanehan
                        System.out.println("");
                        String debug = input.nextLine();
                        // akhir solusi keanehan
                        
                        System.out.print("Masukan kode karyawan yg ingin dihapus : ");
                        String kode_karyawan = input.nextLine();
                        
                        // hapus 
                        data_karyawan.hapusKaryawan(kode_karyawan);
                        
                        // notif
                        System.out.println("");
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Hapus data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int pilihan_user_menu_hapus = input.nextInt();
                        if( pilihan_user_menu_hapus == 1 ){
                            menu_hapus_data = false;
                        } else if(pilihan_user_menu_hapus != 2) {
                            System.out.println(" !input salah");
                        }
                        
                    }
                    break;
                
                case 3 :                     
                    boolean menu_cari_data = true;
                    while( menu_cari_data ){
                        // input 
                        System.out.println("==================");
                        System.out.println(" Menu Cari Data");
                        System.out.println("------------------");
                        
                        // keanehan
                        System.out.println("");
                        String debug = input.nextLine();
                        // akhir solusi keanehan
                        
                        System.out.print("Masukan Kode Karyawan untuk dicari : "
                                + "");
                        
                        String kode_karyawan = input.nextLine();

                        // cari
                        data_karyawan.cariKaryawan(kode_karyawan);

                        System.out.println("");

                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Cari data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");

                        int pilihan_user_menu_cari = input.nextInt();
                        if( pilihan_user_menu_cari == 1 ){
                            menu_cari_data = false;
                        } else if(pilihan_user_menu_cari != 2) {
                            System.out.println(" !input salah");
                        }
                    }
                    break;
                
                case 4 : 
                    boolean menu_lihat_data = true;
                    while( menu_lihat_data ){
                        // tampilkan data
                        data_karyawan.cetakKaryawan();
                        
                        System.out.println("");

                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                  
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");

                        int pilihan_user_menu_lihat = input.nextInt();
                        if( pilihan_user_menu_lihat == 1 ){
                            menu_lihat_data = false;
                        } else {
                            System.out.println(" !input salah");
                        }
                    }
                    break;
                    
                case 5 : 
                    menu_utama = false;
                    System.exit(0);
                
                default: 
                    System.out.println(" !input salah");
                
            }   
            
        }
    }
    
}
