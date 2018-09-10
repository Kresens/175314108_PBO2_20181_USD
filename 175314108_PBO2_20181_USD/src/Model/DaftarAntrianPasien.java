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
public class DaftarAntrianPasien {
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

/**
* constructor untuk mendeklarasikan objek AntrianPasien
*/
public DaftarAntrianPasien() {

}

public Klinik getKlinik() {
return klinik;  //pengambalian nilai dari variabel klnik
}

/**
* method untuk meng-set nilai dari variabel klinik dengan variabel lokal
* klinik yang bertipe Klinik
*
* @param nama
*/
public void setKlinik(Klinik klinik) {
this.klinik = klinik;
}   // pernyataan bahwa nilai dari variabel klinik sama dengan nilai dari variabel lokal klinik

public ArrayList<Pasien> getDaftarPasien() {
return daftarPasien;
 //pengambalian nilai dari variabel daftarPasien


}
    /**
     * method untuk meng-set nilai dari variabel daftarPasien dengan variabel
 lokal daftar pasien yang bertipe ArrayList pasien
     * @param daftarPasien
     * @param nama
     */

/**
* Method untuk menampilkan tanggal dan waktu antrian
*/
public void TanggalAntrian() {
Date date = new Date();
SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
System.out.println(ft.format(date));
}

/**
* Method untuk mendaftar pasien baru di nomor antrian
*
* @param pasien
* @throws Exception
*/
public void Mendaftar(Pasien pasien) {
daftarPasien.add(pasien);   // mengisi data pada variabel daftarPasien dengan variabel lokal daftarPasien 
}

}


