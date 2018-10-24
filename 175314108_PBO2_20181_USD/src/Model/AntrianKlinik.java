/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class AntrianKlinik {
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik Klinik;
    
    public static ArrayList<AntrianKlinik> daftarPasienAntri = new ArrayList<AntrianKlinik>();

    public AntrianKlinik() {
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.Klinik = klinik;
    }
    
    public ArrayList<AntrianKlinik> getDaftarPasien() {
        return daftarPasienAntri;
    }
    
     public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        
    }
    
    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        return -1;
    }
    
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik){
        
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }
    
     public Klinik getKlinik(Klinik klinik) {
        return klinik;
    }
     
     public void setKlinik(Klinik klinik) {
        this.Klinik = klinik;
}
    
    public String tostring(){
         return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + Klinik.getIdKlinik()
                + Klinik.getNamaKlinik();
    }

}
