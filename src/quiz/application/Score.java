package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(0, 0, 1700, 820);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 830);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for playing Quiz");
        heading.setBounds(550, 0, 450, 80);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(heading);

        JLabel lblscore = new JLabel("Your score is  " + score);
        lblscore.setBounds(1050, 150, 300, 310);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 37));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(1050, 400, 220, 50);
        submit.setBackground(new Color(50, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
