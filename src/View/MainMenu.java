package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainMenu extends JPanel{
    private JButton loginPengguna;
    private JButton regristrasiPengguna;
    private JButton lihatPengguna;

    MainMenu() {
        //construct components
        loginPengguna = new JButton ("Login Pengguna");
        loginPengguna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuLogin();
            }
        });
        regristrasiPengguna = new JButton ("Regristrasi Pengguna Baru");
        regristrasiPengguna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuRegristrasi();
            }
        });
        lihatPengguna = new JButton ("Lihat Data Pengguna Berdasarkan Kategori Dipilih");
        lihatPengguna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 571));
        GridLayout layout = new GridLayout(3, 2, 0, 0);
        setLayout (layout);

        //add components
        add (loginPengguna);
        add (regristrasiPengguna);
        add (lihatPengguna);


        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (this);
        frame.pack();
        frame.setVisible (true);
    }


    public static void main (String[] args) {
        new MainMenu();
    }
}
