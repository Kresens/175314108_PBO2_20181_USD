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
public class Frame extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenu DaftarPasienMenu;
    private JMenu tambahAntrianMenu;
    private JMenu exitMenu;
    
    public Frame() {
        init();
    }

    public void init() {

        menuBar = new JMenuBar();

        this.setTitle("Frame");
        pasienMenu = new JMenu("Pasien");
        DaftarPasienMenu = new JMenu("Tambah Pasien");
        tambahAntrianMenu = new JMenu("Tambah Antrian");
        exitMenu = new JMenu("Keluar");

        menuBar.add(pasienMenu);
        pasienMenu.add(DaftarPasienMenu);
        pasienMenu.add(tambahAntrianMenu);
        pasienMenu.add(exitMenu);

        this.setJMenuBar(menuBar);

        DaftarPasienMenu.addActionListener(this);
        tambahAntrianMenu.addActionListener(this);
        exitMenu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent antri) {
        if (antri.getSource() == DaftarPasienMenu) {
            DaftarPasienBaruDialog test = new DaftarPasienBaruDialog("Formulir Tambah Pasien");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (antri.getSource() == tambahAntrianMenu) {
            DaftarAntrianDialog test1 = new DaftarAntrianDialog("Formulir Tambah Antrian Pasien");
            test1.setSize(600, 500);
            test1.setVisible(true);
        }
        if (antri.getSource() == exitMenu) {
            System.exit(0);
        }
    }
}
