/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class AntrianPasien {
    private Klinik klinik;
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Pasien daftarPasienantri[];
    
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * constructor untuk mendeklarasi objek dari AntrianPasien
     */
    public AntrianPasien() {

    }

    /**
     * suatu method yang mengambil nilai dari variabel klinik
     *
     * @return
     */
    public Klinik getKlinik() {
        return klinik;
    }   //pengambalian nilai dari variabel klnik

    /**
     * suatu method untuk nilai dari variabel klinik dengan variabel lokal
     * klinik yang bertipe Klinik
     *
     * @param nama
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }   // pernyataan bahwa nilai dari variabel klinik sama dengan nilai dari variabel lokal klinik

    /**
     * suatu method untuk mengambil nilai dari variabel daftarPasien
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }     //pengambalian nilai dari variabel daftarPasien

    /**
     * suatu method untuk nilai dari variabel daftarPasien dengan variabel
     * lokal daftarPasien yang bertipe ArrayList pasien
     *
     * @param nama
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }   // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien

    /**
     * Suatu method untuk menampilkan tanggal dan waktu pada antrian
     */
    public void settanggalAntrian(int tanggalAntrian)throws Exception{
        if (tanggalAntrian < 32 && tanggalAntrian > 0) {
            this.tanggalAntrian = tanggalAntrian;
    } else { throw new Exception(" tanggal tidak valid");
        }
    }

    /* 
    *merupakan menthod setBulanAntrian() dengan parameter nilai dari objek BulanAntrian bertipr integer, 
    *menthod ini diberi kode throws exception untuk suatu kondisi untuk mencegah eksekusi berjalan normal atau exception dari menthod setBulanAntrian() */
    public void setBulanAntrian(int bulanAntrian) throws Exception{
        if (bulanAntrian < 13 && bulanAntrian > 0) {
            this.bulanAntrian = bulanAntrian;
        }  else { throw new Exception(" bulan anda salah");
       }
    }
     public void setTahunAntrian(int tahunAntrian) throws Exception {
        if (tahunAntrian > 0) {
            this.tahunAntrian = tahunAntrian;
        } else { throw new Exception(" tahun anda salah");
        }
     }
        

    /**
     * Method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) {
        // mengisi data pada variabel daftarPasien dengan variabel lokal daftarPasien 
        daftarPasien.add(pasien);
    }
    public Pasien cariPasien(String string){
   
     for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).noRekamMedis == string) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }
    
}
