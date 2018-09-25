/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JLabel JudulLabel;
    private JLabel NamaLabel;
    private JLabel Alamat;
    private JLabel NoRM;
    private JLabel Tanggal;
    private JLabel Bulan;
    private JLabel Tahun;
    private JTextField namaText;
    private JTextField NoRMText;
    private JTextField AlamatText;
    private JComboBox Tanggaltext;
    private JComboBox Tahuntext;
    private JComboBox Bulantext;
    private JButton saveButton;
    private JMenuBar menuBar;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        
        menuBar = new JMenuBar();
        this.setTitle("TAMBAH ANTRIAN ");

        JudulLabel = new JLabel("TAMBAH ANTRIAN");
        JudulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        JudulLabel.setBounds(190, 5, 200, 40);
        this.add(JudulLabel);
        
        NoRM = new JLabel("NoRM");
        NoRM.setBounds(50, 50, 50, 60);
        this.add(NoRM);
        
        NamaLabel = new JLabel("Nama");
        NamaLabel.setBounds(300, 50, 50, 60);
        this.add(NamaLabel);
       
        namaText = new JTextField();
        namaText.setBounds (345,72,120, 20);
        namaText.setBackground(Color.pink);
        this.add(namaText); 
        
        Alamat = new JLabel("Alamat ");
        Alamat.setBounds(300, 70, 70, 80);
        this.add(Alamat);
        
        AlamatText = new JTextField();
        AlamatText.setBounds (345,105,120,60);
        AlamatText.setBackground(Color.pink);
        this.add(AlamatText);
        
        Tanggal = new JLabel("Tanggal ");
        Tanggal.setBounds(50, 70, 70, 80);
        this.add(Tanggal);
        
        Bulan = new JLabel("Bulan ");
        Bulan.setBounds(50, 60, 60, 180);
        this.add(Bulan);

        Tahun = new JLabel("Tahun ");
        Tahun.setBounds(50, 90, 80, 200);
        this.add(Tahun);

        saveButton = new JButton("Simpan");
        saveButton.setBounds(230, 240, 80, 20);
        saveButton.setSize(85, 30);
        this.add(saveButton);

        this.setLayout(null);
        NoRMText = new JTextField();
        NoRMText.setBounds(100, 70, 100, 20);
        NoRMText.setBackground(Color.pink);
        this.add(NoRMText);

        this.setLayout(null);
        Tanggaltext = new JComboBox();
        for (int i = 1; i <= 31; i++) {
            Tanggaltext.addItem(i);

        }
        Tanggaltext.setBounds(100, 100, 100, 20);
        Tanggaltext.setBackground(Color.pink);
        this.add(Tanggaltext);

        this.setLayout(null);
        Bulantext = new JComboBox();

        Bulantext.addItem("Januari");
        Bulantext.addItem("Februari");
        Bulantext.addItem("Maret");
        Bulantext.addItem("April");
        Bulantext.addItem("Mei");
        Bulantext.addItem("Juni");
        Bulantext.addItem("Juli");
        Bulantext.addItem("Agustus");
        Bulantext.addItem("September");
        Bulantext.addItem("Oktober");
        Bulantext.addItem("November");
        Bulantext.addItem("Desember");

        Bulantext.setBounds(100, 140, 100, 20);
        Bulantext.setBackground(Color.pink);
        this.add(Bulantext);

        this.setLayout(null);
        Tahuntext = new JComboBox();

        for (int i = 1990; i <= 2018; i++) {

            Tahuntext.addItem(i);

        }
        Tahuntext.setBounds(100, 180, 100, 20);
        Tahuntext.setBackground(Color.pink);
        this.add(Tahuntext);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(AlamatText.getText());
            

            Pasien.daftarPasienBaru(baru);

        }

    }
 }

