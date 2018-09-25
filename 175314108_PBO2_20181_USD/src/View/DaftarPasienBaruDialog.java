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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class DaftarPasienBaruDialog extends JDialog implements ActionListener{

     private JLabel judulLabel;
     private JLabel namaLabel;
     private JLabel alamatLabel;
     private JLabel tanggalLahirLabel;
     private JLabel bulanLahirLabel;
     private JLabel TahunLahirLabel;
     private JLabel JenisKelaminLabel;
     private JLabel NoRMLabel; 
     private JTextField namaText, AlamatText, NoLabelText;
     private JButton saveButton;
     private JComboBox tglLahir;
     private JComboBox blnLahir;
     private JComboBox thnLahir;
     private JComboBox JenisKelamin;
     private JMenuBar menuBar;
    
     public DaftarPasienBaruDialog() {
        init();
     }
    public DaftarPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }
        public void init() {
        this.setLayout(null);
         
        menuBar = new JMenuBar();
        this.setTitle("TAMBAH PASIEN BARU");
        
        judulLabel = new JLabel(" PASIEN BARU ");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE,16));
        judulLabel.setBounds(200, 5 , 200, 40);
        this.add(judulLabel);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 72, 120, 20);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds (100,77,95,20);
        namaText.setBackground(Color.white);
        this.add(namaText); 
        
        alamatLabel = new JLabel("Alamat ");
        alamatLabel.setBounds(20, 90, 70, 65);
        this.add(alamatLabel);
        
        AlamatText = new JTextField();
        AlamatText.setBounds (100,110,100,30);
        AlamatText.setBackground(Color.white);
        this.add(AlamatText);
        
        tanggalLahirLabel = new JLabel("Tgl");
        tanggalLahirLabel.setBounds(20, 130, 100, 65);
        this.add(tanggalLahirLabel);
        
        JComboBox tglLahir = new JComboBox();
         for (int i = 1; i <=31; i++) {
           tglLahir.addItem(i);
        }
        tglLahir.setBounds(45,153,67,20);
        tglLahir.setBackground(Color.white);
        this.add(tglLahir);
        
        bulanLahirLabel = new JLabel("Bln");
        bulanLahirLabel.setBounds(120, 130, 100, 65);
        this.add(bulanLahirLabel);
        
        JComboBox blnLahir = new JComboBox();
        blnLahir.addItem("Jan");
        blnLahir.addItem("Feb");
        blnLahir.addItem("Mar");
        blnLahir.addItem("Apr");
        blnLahir.addItem("May");
        blnLahir.addItem("Jun");
        blnLahir.addItem("Jul");
        blnLahir.addItem("aug");
        blnLahir.addItem("Sep");
        blnLahir.addItem("Oct");
        blnLahir.addItem("Nov");
        blnLahir.addItem("Dec");
        blnLahir.setBackground(Color.white);
        blnLahir.setBounds(149,153,67,20);
        this.add(blnLahir);
        
        TahunLahirLabel = new JLabel("Thn");
        TahunLahirLabel.setBounds(225,130,100, 65);
        this.add(TahunLahirLabel);
        
        JComboBox thnLahir = new JComboBox();
        for (int i = 1990; i <=2018; i++) {
            thnLahir.addItem(i);
        }
        thnLahir.setBackground(Color.white);
        thnLahir.setBounds(255,153,67,20);
        this.add(thnLahir);
        
        
        
        JenisKelaminLabel = new JLabel("Jenis Kelamin");
        JenisKelaminLabel.setBounds(20, 170,100, 65);
        this.add(JenisKelaminLabel);
        
        JComboBox Jeniskelamin = new JComboBox();
        Jeniskelamin.addItem("Laki-Laki");
        Jeniskelamin.addItem("Perempuan");
        Jeniskelamin.setBounds(110,193,80,20);
        Jeniskelamin.setBackground(Color.white);
        this.add(Jeniskelamin);
        
        NoRMLabel = new JLabel("No RM");
        NoRMLabel.setBounds(20, 210, 100, 65);
        this.add(NoRMLabel);
        
        NoLabelText = new JTextField();
        NoLabelText.setBounds(100, 235, 100, 20);
        this.add(NoLabelText);
        
        saveButton = new JButton("Simpan");
        saveButton.setBackground(Color.lightGray);
        saveButton.setBounds(220,300,80,20);
        saveButton.setSize(85, 30);
        this.add(saveButton);
        
        
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
