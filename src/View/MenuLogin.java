package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLogin extends JPanel {
    private JLabel emailL;
    private JPasswordField passwordInput;
    private JLabel passwordL;
    private JTextField jcomp4;
    private JButton login;
    private JButton back;

    private ImageIcon icon;
    private JLabel imageLabel;

    public MenuLogin() {
        //construct components
        icon = new ImageIcon("icon.JPG");
        imageLabel = new JLabel(icon);
        emailL = new JLabel ("Email");
        passwordInput = new JPasswordField (5);
        passwordL = new JLabel ("Password");
        jcomp4 = new JTextField (5);
        login = new JButton ("Login");
        back = new JButton ("Back");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
            }
        });

        //adjust size and set layout
        setPreferredSize (new Dimension(944, 571));
        setLayout (null);

        //add components
        add (imageLabel);
        add (emailL);
        add (passwordInput);
        add (passwordL);
        add (jcomp4);
        add (login);
        add (back);

        //set component bounds (only needed by Absolute Positioning)
        imageLabel.setBounds (100, 5, 200, 100);
        emailL.setBounds (70, 115, 100, 25);
        passwordInput.setBounds (175, 160, 162, 25);
        passwordL.setBounds (70, 165, 100, 25);
        jcomp4.setBounds (175, 115, 162, 25);
        login.setBounds (235, 220, 100, 25);
        back.setBounds (70, 220, 100, 25);




        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (this);
        frame.pack();
        frame.setVisible (true);
    }


    public static void main (String[] args) {

    }
}
