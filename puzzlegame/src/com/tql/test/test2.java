package com.tql.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603,680);
        jFrame.setTitle("事件演示");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jtb = new JButton("点");
        jtb.setBounds(250,250,100,50);

        //给按钮添加动作监听
        //jtb:组件对象，表示你要给哪个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听（动作监听鼠标左键点击，空格)
        //参数:表示事件被触发之后要执行的代码
        //jtb.addActionListener(new MyActionListener());

        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("别点我");
            }
        });

        jFrame.getContentPane().add(jtb);

        jFrame.setVisible(true);

    }
}
