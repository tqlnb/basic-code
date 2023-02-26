package com.tql.domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {

    //属性
    //1.牌的名字 格式 数字-数字
    private String name;

    //牌显示的是正面还是反面
    private boolean up;

    //当前的牌是否能被点击
    private boolean canClick = false;

    //当前的状态     表示当前的牌是否已经被点击
    //如果未被点击的状态,此时被点击了,会执行弹起的操作
    //如果是被点击的状态,会执行降落的操作
    private boolean clicked = false;

    public Poker(String name, boolean up){
        this.name = name;
        this.up = up;

        //判断当前的牌显示的是正面还是反面
        if(this.up){
            //显示正面
            turnFront();
        }else {
            //显示反面
            turnRear();
        }

        //设置牌的宽高
        this.setSize(71,96);
        //把牌显示出来
        this.setVisible(true);
        //给每一张牌添加监听
        this.addMouseListener(this);


    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isCanClick() {
        return canClick;
    }

    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    //显示正面
    public void turnFront(){
        this.setIcon(new ImageIcon("doudizhu-login\\image\\poker\\"+ name +".png"));
        this.up = true;

    }

    //显示反面
    public void turnRear(){
        //给牌设置反面
        this.setIcon(new ImageIcon("doudizhu-login\\image\\poker\\rear.png"));
        this.up = false;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //点击
        //判断当前牌是否可以被点击
        if(canClick){
            //当前牌被点击之后要么升起要么降落
            //表示牌的位移像素
            int step = 0;
            //判断当前牌的状态
            if(clicked){
                //当前牌升起状态
                //降落(y增加20像素)
                step = 20;

            }else {
                //当前牌降落状态
                //升起(y减少20像素)
                step = -20;

            }
            //需要修改一下clicked变量记录的值
            clicked = !clicked;
            //修改一下牌的位置
            Point from = this.getLocation();
            //创建一个point对象,表示牌的结束位置
            Point to = new Point( from.x , from.y + step);
            //把最新的 位置设置给牌
            this.setLocation(to);

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //自己练习
}
