package com.tql.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame {
    public MyJFrame2() {
        this.setSize(603,680);
        this.setTitle("事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        JButton jb1 = new JButton("点我");

        jb1.setBounds(0,0,100,50);
        jb1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("单击");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("按住不松");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("松开");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("划入");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("划出");
            }
        });


        this.getContentPane().add(jb1);

        this.setVisible(true);
    }
}
