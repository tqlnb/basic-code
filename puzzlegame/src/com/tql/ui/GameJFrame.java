package com.tql.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {
    int [] [] data = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x = 0, y = 0;

    String path = "puzzlegame\\image\\animal\\animal3\\";

    //定义一个二维数组，展示正确的路径
    int[][]win = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0},
    };

    //定义变量用来统计步数
    int step = 0;

    //创建下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登陆");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("作者信息");


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
/*        for (int i : tempArr) {
            System.out.print(i+" ");
        }

        System.out.println();*/


        //5.给二维数组添加数据
        //遍历二维数组，给里面的每一个数据赋值、
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(tempArr[index] == 0){
                    x = index / 4;
                    y = index % 4;
                }
                data[i][j] = tempArr[index];
                index ++;
            }
        }


    }

    //初始化图片
    private void initImage() {

        //清空原本已经出现的图片
        this.getContentPane().removeAll();

        //判断胜利
        if(victory()) {
            JLabel winJlable = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJlable.setBounds(203,283,297,73);
            this.getContentPane().add(winJlable);
        }

        //显示步数
        JLabel stepCount = new JLabel("步数"+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        //路径分为两种:
        //绝对路径:一定是从盘符开始的。C: \  D: \
        //相对路径:不是从盘符开始的
        //相对路径相对当前项目而言的。 aaa\ bbb
        //在当前项目下，去找aaa文件夹，里面再找bbb文件夹。

        //细节:
        //先加载的图片在上方，后加载的图片塞在下面。


        for (int i = 0; i < 16; i++) {
            //创建一个JLabel的对象（管理容器)
            JLabel jLabel = new JLabel(new ImageIcon(path+data[i/4][i%4]+".jpg"));
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

        //刷新一下界面
        this.getContentPane().repaint();


        
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
        //添加键盘监听事件
        this.addKeyListener(this);
    }

    private JMenuBar initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();


        //创建菜单上面的选项对象(功能 关于我们)
        JMenu function = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");


        //将选项下面的条目加入选项
        function.add(replayItem);
        function.add(reLoginItem);
        function.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //菜单的选项加入菜单
        jMenuBar.add(function);
        jMenuBar.add(aboutJMenu);
        return jMenuBar;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == 65){
            //把界面中的图片删除
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(path +"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40,40,508,560);
            //把背景图片添加到界面中
            this.getContentPane().add(background);

            //刷新一下界面
            this.getContentPane().repaint();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if(victory()){
            return;
        }

        //对上下左右判断
        //左:37 上: 38 右:39 下:40
        int code = e.getKeyCode();
        if(code == 37){
            //左
            System.out.println("向左移动");
            if(y==3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            //每移动一次,步数自增一次
            step ++;

            initImage();


        } else if (code == 38) {
            //上
            System.out.println("向上移动");
            if(x == 3){
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            //每移动一次,步数自增一次
            step ++;

            initImage();

        } else if (code == 39) {
            //右
            System.out.println("向右移动");
            if(y==0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            //每移动一次,步数自增一次
            step ++;

            initImage();


        } else if (code == 40) {
            //下
            System.out.println("向下移动");
            if(x == 0){
                return;
            }

            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            //每移动一次,步数自增一次
            step ++;

            initImage();


        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            //按w一键通关
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},

            };
            initImage();
        }

    }

    //判断data数组中的数据是否跟win数组中相同
    //如果全部相同，返回true。否则返回false
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] != win[i][j]){
                    //有一个数据不一样,返回false
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数踞
            initData();
            //重新加载图片
            initImage();

        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            //关闭当前的游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);

        } else if (obj == accountItem) {
            System.out.println("作者信息");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel("tqlNb");
            //设置位置和宽高
            jLabel.setBounds(100,100,150,60);
            //把图片添加到弹框
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //弹框置顶
            jDialog.setAlwaysOnTop(true);
            //弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示
            jDialog.setVisible(true);
        }
    }
}
