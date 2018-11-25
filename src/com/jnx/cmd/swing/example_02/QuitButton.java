package com.jnx.cmd.swing.example_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class QuitButton extends JFrame {

    public QuitButton() {
        initUI();
    }

    public final void initUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);

        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(40, 60, 80, 30);
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        JButton printButton = new JButton("Print");
        printButton.setBounds(140, 60, 80, 30);
        printButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    printText();
                }
            });

        panel.add(quitButton);
        panel.add(printButton);

        setTitle("Quit button");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void printText() {
        System.out.println("Funciona!!!");
    } 

    public static void main(String[] args) {
        QuitButton qb = new QuitButton();
        qb.setVisible(true);
    }

}