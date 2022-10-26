package com.tql.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
        this.setSize(603,680);
        this.setTitle("事件演示");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.addKeyListener(this);

        this.setVisible(true);
    }

    //细节1:
    //如果我们按下一个按键没有松开，那么会重复的去调用keyPressed方法
    //细节2:
    //键盘里面那么多按键，如何进行区分
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        // System.out.println(keyCode);
        if(e.getKeyCode() == 65){
            System.out.println("按下了a");
        }
        if(e.getKeyCode() == 66){
            System.out.println("按下了b");
        }

    }
}
