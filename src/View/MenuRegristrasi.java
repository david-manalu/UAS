package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuRegristrasi extends JPanel {
    private JLabel email;
    private JTextField emailInput;
    private JLabel nama;
    private JTextField namaInput;
    private JLabel photo;
    private JFileChooser photoInput;
    private JLabel kategori;
    private String kategory[] = {"Private Account", "Creator Account", "Business Account"};
    private JComboBox c1;
    private JButton register;
    private JButton back;

    public MenuRegristrasi() {
        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem printItem = new JMenuItem ("Print");
        fileMenu.add (printItem);
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);

        //construct components
        email = new JLabel ("Email");
        emailInput = new JTextField (5);
        nama = new JLabel ("Nama");
        namaInput = new JTextField (5);
        photo = new JLabel ("Photo");
        photoInput = new JFileChooser("C:\\Users\\David Manalu\\Documents\\kuliah\\semester3\\PemrogramanBerbasisObject\\SoalLatihan\\Praktikum\\UAS");
        kategori = new JLabel("Kategori");
        c1 = new JComboBox(kategory);
        register = new JButton("Register");
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
            }
        });

        //adjust size and set layout
        setPreferredSize (new Dimension(944, 900));
        setLayout (null);

        //add components
        add (email);
        add (emailInput);
        add (nama);
        add (namaInput);
        add (photo);
        add (photoInput);
        add (kategori);
        add (c1);
        add (register);
        add (back);

        //set component bounds (only needed by Absolute Positioning)
        email.setBounds (45, 30, 100, 25);
        emailInput.setBounds (160, 30, 200, 25);
        nama.setBounds (45, 65, 100, 25);
        namaInput.setBounds (160, 65, 200, 25);
        photo.setBounds (45, 100, 100, 25);
        photoInput.setBounds (160, 90, 300, 300);
        kategori.setBounds (45, 400, 100, 25);
        c1.setBounds (160, 400, 100, 25);
        register.setBounds (200, 530, 100, 25);
        back.setBounds (45, 530, 100, 25);


        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (this);
        frame.pack();
        frame.setVisible (true);
    }


    public static void main (String[] args) {

    }
}
