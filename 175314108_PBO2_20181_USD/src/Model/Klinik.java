/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Klinik {

    private String idKlinik;
    private String nama;

    /**
     * constructor untuk mendeklarasikan objek KLinik
     */
    public Klinik(String idKlinik, String nama) {
        this.idKlinik = idKlinik;   // pernyataan nilai variabel idKlinik sama dengan nilai dari variabel idKlinik
        this.nama = nama;   // pernyataan nilai variabel nama sama dengan nilai dari variabel nama
    }

    /**
     * method untuk mengambil nilai dari variabel idKlinik
     *
     * @return
     */
    public String getIdKlinik() {
        return idKlinik;    //pengambalian nilai dari variabel idKlinik
    }

    /**
     * method untuk meng-set nilai dari variabel idKLinik dengan variabel lokal
     * idKLinik dengan tipe data String
     *
     * @param nama
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }   // pernyataan nilai dari variabel idKlinik sama dengan nilai dari variabel  idKLinik

    /**
     * method untuk mengambil nilai dari variabel nama
     *
     * @return
     */
    public String getNama() {
        return nama;
    }   //pengambalian nilai dari variabel nama

    /**
     * method untuk meng-set nilai dari variabel nama dengan variabel lokal nama
     * dengan tipe data String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;   // pernyataan nilai dari variabel nama sama dengan nilai dari variabel nama
    }
}
