/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import View.DaftarPasienBaruDialog;

/**
 *
 * @author Priska
 */
public class FrameUtama extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem DaftarAntrianDialog;
    private JMenuItem DaftarPasienBaruDialog;
    
    public FrameUtama() throws HeadlessException{
        init();
    }

    public void init() {

        menuBar = new JMenuBar();
        this.setTitle("RS Permata Bunda");
        
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        DaftarPasienBaruDialog = new JMenuItem("TambahPasien");
        DaftarAntrianDialog = new JMenuItem("Tambah Antrian");
        fileMenu.add(DaftarPasienBaruDialog);
        fileMenu.add(DaftarAntrianDialog);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        DaftarPasienBaruDialog.addActionListener(this);
        DaftarAntrianDialog.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == DaftarPasienBaruDialog) {
            DaftarPasienBaruDialog test = new DaftarPasienBaruDialog();
            test.setSize(550, 400);
            test.setVisible(true);
        }
        
        if(e.getSource() == DaftarAntrianDialog){
            DaftarAntrianDialog test1 = new DaftarAntrianDialog();
            test1.setSize(550, 400);
            test1.setVisible(true);
        }
    }

    }

   

