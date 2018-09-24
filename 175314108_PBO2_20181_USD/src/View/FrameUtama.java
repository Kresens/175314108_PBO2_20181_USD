/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Priska
 */
public class FrameUtama extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenuItem DaftarAntrianDialog;
    private JMenuItem DaftarPasienBaruDialog;
    private JMenuItem exitMenu;
    
    public FrameUtama() {
        init();
    }

    public void init() {

        menuBar = new JMenuBar();

        this.setTitle("Frame Utama");
        pasienMenu = new JMenu("Pasien");
        DaftarAntrianDialog = new JMenu("Tambah Pasien");
        DaftarPasienBaruDialog = new JMenu("Tambah Antrian");
        exitMenu = new JMenu("Keluar");

        menuBar.add(pasienMenu);
        pasienMenu.add(DaftarAntrianDialog);
        pasienMenu.add(DaftarPasienBaruDialog);
        pasienMenu.add(exitMenu);

        this.setJMenuBar(menuBar);

        DaftarAntrianDialog.addActionListener(this);
        DaftarPasienBaruDialog.addActionListener(this);
        exitMenu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent antri) {
        if (antri.getSource() == DaftarAntrianDialog) {
            DaftarPasienBaruDialog test = new DaftarPasienBaruDialog("Formulir Tambah Pasien");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (antri.getSource() == DaftarPasienBaruDialog) {
            DaftarAntrianDialog test1 = new DaftarAntrianDialog("Formulir Tambah Antrian Pasien");
            test1.setSize(600, 500);
            test1.setVisible(true);
        }
        if (antri.getSource() == exitMenu) {
            System.exit(0);
        }
    }
}
