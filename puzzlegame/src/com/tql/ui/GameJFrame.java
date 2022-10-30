package com.tql.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame {
    int [] [] data = new int[4][4];
    //JFrame 界面，窗体
    //子类呢? 也表示界面，窗体
    ///规定: GameJFrame这个界面表示的就是游戏的主界面
    // 以后跟游戏相关的所有逻辑都写在这个类中
    public GameJFrame(){


        //初始化
        jFrameInit();

        //初始化菜单
        JMenuBar jMenuBar = initJMenuBar();

        //初始化数据(打乱)
        initData();


        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);

        //初始化图片
        initImage();

        //显示界面,建议写在最后
        this.setVisible(true);
    }

    private void initData() {
        //1.定义一个一维数组
        int [] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for(int i = 0;i < tempArr.length;i ++){
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i : tempArr) {
            System.out.print(i+" ");
        }

        System.out.println();


        //5.给二维数组添加数据
        //遍历二维数组，给里面的每一个数据赋值、
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArr[index];
                index ++;
            }
        }


    }

    //初始化图片
    private void initImage() {

        //路径分为两种:
        //绝对路径:一定是从盘符开始的。C: \  D: \
        //相对路径:不是从盘符开始的
        //相对路径相对当前项目而言的。 aaa\ bbb
        //在当前项目下，去找aaa文件夹，里面再找bbb文件夹。

        //细节:
        //先加载的图片在上方，后加载的图片塞在下面。


        for (int i = 0; i < 16; i++) {
            //创建一个JLabel的对象（管理容器)
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\animal\\animal3\\"+data[i/4][i%4]+".jpg"));
            //指定图片的位置
            jLabel.setBounds(105*(i%4)+83,105*(i/4)+134,105,105);//105*(i%4)是横坐标  105*(i/4)是纵坐标
            //给图片添加边框
            //0:表示让图片凸起来
            //1:表示让图片凹下去
            jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
            //把管理容器添加到界面中
            this.getContentPane().add(jLabel);

        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40,40,508,560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);


        
/*
        //创建一个图片ImageIcon的对象
        ImageIcon icon = new ImageIcon("C:\\Users\\tql\\IdeaProjects\\basic-code\\puzzlegame\\image\\animal\\animal3\\1.jpg");
        //创建一个JLabel的对象（管理容器)
        JLabel jLabel1 = new JLabel(icon);
        //指定图片的位置
        jLabel1.setBounds(0,0,105,105);
        //把管理容器添加到界面中(默认在最中央)
        //this.add(jLabel);
        //获取隐藏容器并添加管理容器
        this.getContentPane().add(jLabel1);
*/



    }

    private void jFrameInit() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中放置，只有取消了才会按xy轴的方式添加组件
        this.setLayout(null);
    }

    private static JMenuBar initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();


        //创建菜单上面的选项对象(功能 关于我们)
        JMenu function = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("作者信息");

        //将选项下面的条目加入选项
        function.add(replayItem);
        function.add(reLoginItem);
        function.add(closeItem);

        aboutJMenu.add(accountItem);

        //菜单的选项加入菜单
        jMenuBar.add(function);
        jMenuBar.add(aboutJMenu);
        return jMenuBar;
    }
}