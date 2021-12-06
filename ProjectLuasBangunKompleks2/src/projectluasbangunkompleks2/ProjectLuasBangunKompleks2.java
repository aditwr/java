/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author acer
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hitung luas setengah lingkaran besar
        Lingkaran l1 = new Lingkaran();
        double lingkaranBesar = l1.hitungLuas(14)/2;
        
        // hitung lingkaran kecil 
        Lingkaran l2 = new Lingkaran();
        double lingkaranKecil = l2.hitungLuas(7);
        
        // 1/2 lingkaran besar dikuragi lingkaran kecil 
        double luasDiarsir = lingkaranBesar - lingkaranKecil;
        
        System.out.println("Luas 1/2 Lingkaran Besar : " + lingkaranBesar + " cm");
        System.out.println("Luas 1 Lingkaran Kecil : " + lingkaranKecil + " cm");
        System.out.println("Luas Daerah Abu-abu : " + luasDiarsir + " cm");
        
        
    }
    
}
