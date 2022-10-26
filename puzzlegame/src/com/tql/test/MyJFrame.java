package com.tql.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class MyJFrame extends JFrame implements ActionListener {
    JButton jb1 = new JButton("点我");
    JButton jb2 = new JButton("别点我");
    public MyJFrame() {
        this.setSize(603,680);
        this.setTitle("事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jb1.setBounds(0,0,100,50);
        jb1.addActionListener(this);

        jb2.setBounds(200,0,100,50);
        jb2.addActionListener(this);

        this.getContentPane().add(jb1);
        this.getContentPane().add(jb2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        //对按钮进行判断
        Object source = e.getSource();
        if(source == jb1){
            jb1.setSize(r.nextInt(300)+100,r.nextInt(100)+100);
        }else if(source == jb2){
            jb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
