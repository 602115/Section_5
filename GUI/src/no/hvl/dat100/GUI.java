package no.hvl.dat100;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private int teller = 0;
    private JLabel label;
    private JLabel label1;
    private JFrame frame;
    private JPanel panel;

    public GUI(){
        frame = new JFrame();

        JButton button = new JButton("Click me");
        JButton button1 = new JButton("Trykk meg");
        button.addActionListener(this);
        button1.addActionListener(this);

        label = new JLabel("Number of clicks: 0");
        label1 = new JLabel("Antall trykk: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30,10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        panel.add (button1);
        panel.add(label1);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Number of clicks: " + count);
    teller++;
    label1.setText("Antall trykk: "+ teller);
    }
}
