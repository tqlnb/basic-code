package com.tql.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登陆界面

    public LoginJFrame(){
        //设置界面的宽高
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图登陆界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        this.setVisible(true);
    }
}
