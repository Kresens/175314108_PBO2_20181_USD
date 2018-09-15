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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JButton tambahButton;
    private JButton antriButton;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel();
        judulLabel.setText("Formulir Daftar Antrian");
        judulLabel.setFont(new Font(null, Font.CENTER_BASELINE, 16));
        judulLabel.setBounds(50, 20, 250, 30);
        this.add(judulLabel);

        noRMLabel = new JLabel();
        noRMLabel.setText("No. RM");
        noRMLabel.setBounds(50, 70, 80, 20);
        this.add(noRMLabel);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 100, 80, 20);
        this.add(namaLabel);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 130, 80, 20);
        this.add(alamatLabel);

        noRMText = new JTextField();
        noRMText.setBounds(110, 70, 120, 20);
        this.add(noRMText);

        namaText = new JTextField();
        namaText.setBounds(110, 100, 120, 20);
        this.add(namaText);

        alamatText = new JTextField();
        alamatText.setBounds(110, 130, 120, 20);
        this.add(alamatText);

        saveButton = new JButton();
        saveButton.setText("Save");
        saveButton.setBounds(110, 180, 80, 30);
        this.add(saveButton);

        noRMText.addActionListener(this);
        antriButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noRMText) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            if (cari == null){
                JOptionPane.showConfirmDialog(null, "Orang Tidak Ada");
            }else{
                namaText.setText(cari.getNama());
            }
        }
        if (ae.getSource() == namaText) {
            JOptionPane.showMessageDialog(null, namaText.getText());
        }
        if (ae.getSource() == alamatText) {
            JOptionPane.showMessageDialog(null, alamatText.getText());
        }if (ae.getSource() == tambahButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            
            Pasien.daftarPasienBaru(baru);
            
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
        }
    }
 }

