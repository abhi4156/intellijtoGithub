package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton rules, back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 950, 750);
        add(image);

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(1060, 100, 300, 45);
        heading.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(1060, 250, 300, 40);
        name.setFont(new Font("Arial Black", Font.BOLD, 30));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(1050, 350, 300, 55);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(1060, 470, 120, 55);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(1230, 470, 120, 55);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1700, 820);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new quiz.application.Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

