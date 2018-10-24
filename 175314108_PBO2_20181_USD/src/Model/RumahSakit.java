/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Pasien.daftarPasien;
import static Model.Pasien.tambahPasienBaru;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class RumahSakit {
    private String nama;
    private String alamat;
    private Pasien daftarPasien;
    private Klinik daftarKlinik;
    
    private ArrayList<RumahSakit> tambahPasien = new ArrayList<RumahSakit>();
    
    private ArrayList<RumahSakit> getTambahPasien() {
        return tambahPasien;
    }
    private ArrayList<AntrianKlinik> daftarAntrianKlinik;
    
    public Pasien getDaftarPasien() {
        return daftarPasien;
}
    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        daftarPasien = daftarPasien;
    }

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tambahPasien (Pasien pasien){
        Pasien.daftarPasien.add(pasien);
    }
    
    public void tambahPasienBaru(Pasien pasien) {
        Pasien.daftarPasien.add(pasien);
    }
    
    public static Pasien cariPasien(String nama) {
        for (int i = 0; i < tambahPasien.size(); i++) {
            if (tambahPasien.get(i).getNama()== nama) {
                return tambahPasien.get(i);
            }
        }
        return null;
    }
    
     public void tambahKlinik(Klinik klinik){
        getDaftarKlinik().add(klinik);
    }
    
    public static Klinik cariKlinik(String namaKlinik){
        for (int i = 0; i < tambahPasien.size(); i++) {
            if(tambahPasien.get(i).getNama().equalsIgnoreCase(namaKlinik))
            {
//                return daftarKlinik.get(i);
            }
        }
        return null;
    }
    
    public void buatAntrianKlinik(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        
        if (cariAntrianKlinik(tanggal, bulan, tahun, klinik) <0) {
            
            daftarAntrianKlinik.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
}
    
    public int cariAntrianKlinik(
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        return -1; 
}
    
    public void tambahPasienAntrianKlinik(
            Pasien pasien,
            int tanggal,
            int bulan,
            int tahun,
            Klinik klinik) {
        
    }
    
    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        this.daftarAntrianKlinik = daftarAntrianKlinik;
}
    
    public Klinik getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        daftarKlinik = daftarKlinik;
}
    
    public static void simpanObjekDaftarPasien(File file) throws IOException{
       try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
//                String data = daftarPasien.get(i).toString();
//                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void bacaObjekDaftarPasien(File file){
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
//                    tambahPasienBaru(temp);
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

    public void simpanObjekRumahSakit(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bacaObjekRumahSakit(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class daftarAntrianKlinik {

        public daftarAntrianKlinik() {
        }
    }
}
