/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
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
    private JLabel nikLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField noRekamMedisText;
    private JRadioButton priaRadio;
    private JRadioButton wanitaRadio;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton tambahButton;
    private JButton saveButton;
    
    private String tanggalArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    
    private String bulanArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    
    private String tahunArray[] = {"1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
        "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
        "2015", "2016", "2017", "2018"};
    
     public DaftarPasienBaruDialog() {
        init();
    }

    public DaftarPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }
    
    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("FORMULIR DAFTAR PASIEN");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        judulLabel.setBounds(50, 20, 250, 50);
        this.add(judulLabel);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 90, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 90, 120, 20);
        this.add(namaText);

        priaRadio = new JRadioButton("Male");
        priaRadio.setBounds(150, 120, 80, 20);
        this.add(priaRadio);

        wanitaRadio = new JRadioButton("Female");
        wanitaRadio.setBounds(240, 120, 100, 20);
        this.add(wanitaRadio);

        ButtonGroup JenisKelaminButonGroup = new ButtonGroup();
        JenisKelaminButonGroup.add(priaRadio);
        JenisKelaminButonGroup.add(wanitaRadio);

        tanggalLahirLabel = new JLabel("Tanggal Lahir");
        tanggalLahirLabel.setBounds(50, 180, 80, 20);
        this.add(tanggalLahirLabel);

        tanggalCombo = new JComboBox(tanggalArray);
        tanggalCombo.setBounds(150, 180, 80, 20);
        this.add(tanggalCombo);

        bulanLahirLabel = new JLabel("Bulan Lahir");
        bulanLahirLabel.setBounds(250, 150, 80, 20);
        this.add(bulanLahirLabel);

        bulanCombo = new JComboBox(bulanArray);
        bulanCombo.setBounds(250, 180, 80, 20);
        this.add(bulanCombo);

        tahunLahirLabel = new JLabel("Tahun Lahir");
        tahunLahirLabel.setBounds(350, 150, 80, 20);
        this.add(tahunLahirLabel);

        tahunCombo = new JComboBox(tahunArray);
        tahunCombo.setBounds(350, 180, 80, 20);
        this.add(tahunCombo);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 210, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(150, 210, 120, 20);
        this.add(alamatText);

        nikLabel = new JLabel();
        nikLabel.setText("NIK");
        nikLabel.setBounds(50, 250, 80, 20);
        this.add(nikLabel);

        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(150, 250, 120, 20);
        this.add(noRekamMedisText);
        
        tambahButton = new JButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(150, 180, 80, 30);
        this.add(tambahButton);

        tambahButton.addActionListener((ActionListener) this);

        saveButton = new JButton();
        saveButton.setText("Simpan");
        saveButton.setBounds(150, 280, 80, 30);
        this.add(saveButton);
        saveButton.addActionListener((ActionListener) this);

    }
    @Override
    public void actionPerformed(ActionEvent pasien) {
        if (pasien.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            try {
                baru.setNoRekamMedis(noRekamMedisText.getText());
            } catch (Exception ex) {
                Logger.getLogger(DaftarPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Pasien.daftarPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Ditambahkan");

            this.dispose();
        }
    }
}
