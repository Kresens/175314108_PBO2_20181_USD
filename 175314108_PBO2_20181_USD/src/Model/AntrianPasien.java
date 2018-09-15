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
    public void TanggalAntrian() {
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
        // menampilkan data dari objek ft dengan format date
        System.out.println(ft.format(date));
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
}



