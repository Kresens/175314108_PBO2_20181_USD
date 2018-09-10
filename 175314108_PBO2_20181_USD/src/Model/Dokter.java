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
public class Dokter {
    
    private String nomorPegawai;    //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan nomor pegawai.
    private String nama;    //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan nama.
    private String tempatLahir; //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan tempay lahir.
    private int tanggalLahir;   //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan tanggal lahir.
    private int bulanLahir;
    private int tahunLahir;

/**
* constructor untuk mendeklarasikan objek Dokter
*/

public Dokter(String nama) {
// pernyataan bahwa nilain variabel nama sama dengan nilai dari variabel lokal nama
this.nama = nama;
}

/**
* method untuk mengambil nilai dari variabel nomorPegawai
*
* @return
*/
public String getNomorPegawai() {
//pengambalian nilai dari variabel nomorPegawai
return nomorPegawai;
}

/**
* method untuk meng-set nilai dari variabel nomorPegawai dengan variabel
* lokal nomorPegawai dengan tipe data String
*
* @param nomorPegawai
* @throws Exception
*/
public void setNomorPegawai(String nomorPegawai) throws Exception {
if (nomorPegawai.length() == 5) {
this.nomorPegawai = (nomorPegawai + nama.substring(0, 3));
} else {
throw new Exception("Salah No Pegawai... ");
}
}

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
this.nama = nama;
}// pernyataan nilai dari variabel nama sama dengan nilai dari variabel nama

/**
* method untuk mengambil nilai dari variabel tempatLahir
*
* @return
*/
public String getTempatLahir() {
return tempatLahir;
}   //pengambalian nilai dari variabel tempatLahir

/**
* method untuk mengset nilai dari variabel tempatLahir dengan parameter
* lokal tempatLahir yang bertipe String
*
* @param tempatLahir
*/
public void setTempatLahir(String tempatLahir) {
this.tempatLahir = tempatLahir;
}   // pernyataan bahwa nilai dari variabel tempatLahir sama dengan nilai dari variabel lokal tempatLahir

/**
* method untuk mengambil nilai dari variabel tanggalLahir
*
* @return
*/
public int getTanggalLahir() {
return tanggalLahir;
}   //pengambalian nilai dari variabel tanggalLahir

/**
* method untuk meng-set nilai dari variabel tanggalLahir dengan variabel
* lokal tanggalLahir dengan tipe data String
*
* @param tanggalLahir
* @throws Exception
*/
public void setTanggalLahir(int tanggalLahir) throws Exception {
if (tanggalLahir > 0) {
if (tanggalLahir <= 31) {
this.tanggalLahir = tanggalLahir;
} else {
throw new Exception("Input Tanggal Lebih Dari 31");
}
} else {
throw new Exception("Input Tanggal Kurang Dari 0");
}
}

public int getBulanLahir() {
return bulanLahir;
}   // pengambalian nilai dari variabel bulanLahir

/**
* method untuk meng-set nilai dari variabel bulanLahir dengan variabel
* lokal bulanLahir dengan tipe data String
*
* @param bulanLahir
* @throws Exception
*/
public void setBulanLahir(int bulanLahir) throws Exception {
if (bulanLahir > 0) {
if (bulanLahir <= 12) {
this.bulanLahir = bulanLahir;
} else {
throw new Exception("Input Bulan Lebih Dari 12");
}
} else {
throw new Exception("input Bulan Kurang Dari 0");
}

}

/**
* method untuk mengambil nilai dari variabel tahunLahir
*
* @return
*/
public int getTahunLahir() {
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
if (tahunLahir > 0) {
this.tahunLahir = tahunLahir;
} else {
throw new Exception("Salah Input Tahun");
}
}

    public void setAlamat(String jogja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    



