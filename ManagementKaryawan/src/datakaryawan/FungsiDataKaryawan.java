/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawan;

/**
 *
 * @author acer
 */
public interface FungsiDataKaryawan {
    public void tambahKaryawan(Karyawan data);
    public void hapusKaryawan(String kode_karyawan);
    public void cariKaryawan(String kode_karyawan);
    public void cetakKaryawan();
}
