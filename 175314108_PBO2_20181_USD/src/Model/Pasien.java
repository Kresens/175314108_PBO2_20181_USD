
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Pasien {
    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String nik;
    
    
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    
     public Pasien() {
    }
     
    /**
     * constructor untuk mendeklarasikan objek pasien
     */
    public Pasien(String nama, String noRekamMedis) {
        this.nama = nama;
        this.noRekamMedis = noRekamMedis;
    }
    

    /**
     * method untuk mengambil nilai dari variabel noRekamMedis
     *
     * @return
     */
    public String getNoRekamMedis() {
//pengambalian nilai dari variabel noRekamMedis
        return noRekamMedis;
    }

    /**
     * method untuk meng-set nilai dari variabel noRekamMedis dengan variabel
     * lokal noRekamMedis dengan tipe data String
     *
     * @param noRekamMedis
     * @throws Exception
     */
    public void setNoRekamMedis(String noRekamMedis) throws Exception {

        if (noRekamMedis.length() > 6) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("Nomor rekam Medis Salah.....");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        return nama;    // pengambalian nilai dari variabel nama
    }

    /**
     * suatu method untuk set nilai dari variabel nama dengan parameter lokal nama
     * dan bertipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama; // pernyataan nilai dari variabel nama sama dengan nilai dari variabel nama
    }

    /**
     * method untuk mengambil nilai dari variabel alamat
     *
     * @return
     */
    public String getAlamat() {
        return alamat;  //pengambalian nilai dari variabel alamat
    }

    /**
     * suatu method untuk set nilai dari variabel alamat dengan parameter lokal
     * alamat dan bertipe data String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;   // pernyataan nilai dari variabel alamat sama dengan nilai dari variabel alamat
    }

    /**
     * method untuk mengambil nilai dari variabel tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir; //pengambalian nilai dari variabel tempatLahir
    }

    /**
     * method untuk mengset nilai dari variabel tempatLahir dengan parameter
     * lokal tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
// pernyataan bahwa nilai dari variabel tempatLahir sama dengan nilai dari variabel lokal tempatLahir
        this.tempatLahir = tempatLahir;
    }

    /**
     * method untuk mengambil nilai dari variabel tanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;    //pengambalian nilai dari variabel tanggalLahir
    }

    /**
     * method untuk meng-set nilai dari variabel tanggalLahir dengan variabel
     * lokal tanggalLahir dengan tipe data String
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
//pengecekan nilai variabel lokal tanggalLahir harus kurang dari atau sama dengan 31
            if (tanggalLahir <= 31) {
//pernyataan bahwa nilai dari variabel tanggalLahir sama dengan nilai dari variabel lokal tanggalLahir
                this.tanggalLahir = tanggalLahir;
            } else {
// pesan apabila input tanggalLahir lebih dari 31 
                throw new Exception("Input Tanggal Lebih Dari 31");
            }
        } else {
            throw new Exception("Tanggal Salah...");
        }
    }

    /**
     * method untuk mengambil nilai dari variabel bulanLahir
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;  // pengambalian nilai dari variabel bulanLahir
    }

    /**
     * method untuk meng-set nilai dari variabel bulanLahir dengan variabel
     * lokal bulanLahir dengan tipe data String
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
//pengecekan nilai variabel lokal bulanLahir harus kurang dari atau sama dengan 12
            if (bulanLahir <= 12) {
//pernyataan  nilai dari variabel bulanLahir sama dengan nilai dari variabel bulanLahir
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan Salah...");
            }

        }
    }

    /**
     * method untuk mengambil nilai dari variabel tahunLahir
     *
     * @return
     */
    public int getTahunLahir() {
// pengambalian nilai dari variabel tahunLahir
        return tahunLahir;
    }

    /**
     * method untuk meng-set nilai dari variabel tahunLahir dengan variabel
     * lokal tahunLahir dengan tipe data String
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
//pengecekan nilai variabel lokal tahunLahir harus lebih dari 0
        if (tahunLahir > 0) {
//pernyataan nilai dari variabel tahunLahir sama dengan nilai dari variabel tahunLahir
            this.tahunLahir = tahunLahir;
        } else {
// pesan apabila input tahunLahir
            throw new Exception("Tahunnya Salah...");
        }
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    

    /**
     * method untuk membuat nomor rekam medis yang terdiri dari tanggal pasien
     * mengatri ditambah 3 huruf pertama dari nama
     *
     * @return
     */
    public String BuatNomorRekamMedis() {
        String noRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat(" ");
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        return noRekamMedis;
    }
    public static void daftarPasienBaru(Pasien pasien) {
         daftarPasien.add(pasien);
    }
    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
}
    public static void tambahPasienBaru(Pasien pasien) {
        Pasien.daftarPasien.add(pasien);
    }
    
    public static Pasien cariPasien(String noRekamMedis) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNoRekamMedis() == noRekamMedis) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }
    
    public static void simpanDaftarPasien(File file) throws IOException{
       try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void bacaDaftarPasien(File file){
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String tostring(){
        return noRekamMedis+"/t"+ nama+"/t"+ alamat+"/t";
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
