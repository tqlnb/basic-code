package com.tql.ui;

import cn.hutool.core.io.IoUtil;
import com.tql.domain.GameInfo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Properties;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //JFrame 界面，窗体
    //子类呢？也表示界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //定义一个变量，记录当前展示图片的路径
    String path = "puzzlegame\\image\\animal\\animal3\\";

    //定义一个二维数组，存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义变量用来统计步数
    int step = 0;


    //创建选项下面的条目对象
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenu saveJMenu = new JMenu("存档");
    JMenu loadJMenu = new JMenu("读档");

    JMenuItem saveItem0 = new JMenuItem("存档0(空)");
    JMenuItem saveItem1 = new JMenuItem("存档1(空)");
    JMenuItem saveItem2 = new JMenuItem("存档2(空)");
    JMenuItem saveItem3 = new JMenuItem("存档3(空)");
    JMenuItem saveItem4 = new JMenuItem("存档4(空)");

    JMenuItem loadItem0 = new JMenuItem("读档0(空)");
    JMenuItem loadItem1 = new JMenuItem("读档1(空)");
    JMenuItem loadItem2 = new JMenuItem("读档2(空)");
    JMenuItem loadItem3 = new JMenuItem("读档3(空)");
    JMenuItem loadItem4 = new JMenuItem("读档4(空)");

    JMenuItem accountItem = new JMenuItem("作者信息");


    //创建随机对象
    Random r = new Random();


    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //初始化图片（根据打乱之后的结果去加载图片）
        initImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);

    }


    //初始化数据（打乱）
    private void initData() {
        //1.定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        /*
         *
         *           5   6   8   9
         *           10  11  15  1
         *           4   7   12  13
         *           2   3   0  14
         *
         *           5   6   8   9   10  11  15  1   4   7   12  13  2   3   0   14
         * */

        //4.给二维数组添加数据
        //遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    //添加图片的时候，就需要按照二维数组中管理的数据添加图片
    private void initImage() {

        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            //显示胜利的图标
            JLabel winJLabel = new JLabel(new ImageIcon("C:\\Users\\moon\\IdeaProjects\\basic-code\\puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }


        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);


        //路径分为两种：
        //绝对路径：一定是从盘符开始的。C:\  D：\
        //相对路径：不是从盘符开始的
        //相对路径相对当前项目而言的。 aaa\\bbb
        //在当前项目下，去找aaa文件夹，里面再找bbb文件夹。

        //细节：
        //先加载的图片在上方，后加载的图片塞在下面。
        //外循环 --- 把内循环重复执行了4次。
        for (int i = 0; i < 4; i++) {
            //内循环 --- 表示在一行添加4张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num = data[i][j];
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                //0:表示让图片凸起来
                //1：表示让图片凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }


        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);


        //刷新一下界面
        this.getContentPane().repaint();


    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeImage = new JMenu("更换图片");


        //把5个存档，添加到saveJMenu中
        saveJMenu.add(saveItem0);
        saveJMenu.add(saveItem1);
        saveJMenu.add(saveItem2);
        saveJMenu.add(saveItem3);
        saveJMenu.add(saveItem4);

        //把5个读档，添加到loadJMenu中
        loadJMenu.add(loadItem0);
        loadJMenu.add(loadItem1);
        loadJMenu.add(loadItem2);
        loadJMenu.add(loadItem3);
        loadJMenu.add(loadItem4);


        //把美女，动物，运动添加到更换图片当中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //将更换图片，重新游戏，重新登录，关闭游戏，存档，读档添加到“功能”选项当中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(saveJMenu);
        functionJMenu.add(loadJMenu);

        //将公众号添加到关于我们当中
        aboutJMenu.add(accountItem);

        //绑定点击事件
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        saveItem0.addActionListener(this);
        saveItem1.addActionListener(this);
        saveItem2.addActionListener(this);
        saveItem3.addActionListener(this);
        saveItem4.addActionListener(this);
        loadItem0.addActionListener(this);
        loadItem1.addActionListener(this);
        loadItem2.addActionListener(this);
        loadItem3.addActionListener(this);
        loadItem4.addActionListener(this);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //读取存档信息,修改菜单上表示的内容
        getGameInfo();
        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    public void getGameInfo(){
        //1.创建file对象表示所有存档所在文件夹
        File file = new File("puzzlegame\\save");
        //2.进入文件夹获取到所有存档文件
        File[] files = file.listFiles();
        //3.遍历数组,得到里面的每一个存档
        for (File f : files) {
            //每一个f依次表示一个存档文件
            //获取每一个存档文件中的步数
            GameInfo gi = null;
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                gi = (GameInfo) ois.readObject();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            //获取到了步数
            int step = gi.getStep();

            //把存档步数同步到菜单中
            //获取存档的文件名
            String name = f.getName();
            //存档的序号
            int index = name.charAt(4) - '0';

            //修改菜单上的文字信息
            //3.获取里面的步数,修改菜单
            saveJMenu.getItem(index).setText("存档" + index + "(" + step + ")步");
            loadJMenu.getItem(index).setText("存档" + index + "(" + step + ")步");


        }


    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();


        }
    }

    //松开按键的时候会调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if (victory()) {
            //结束方法
            return;
        }
        //对上，下，左，右进行判断
        //左：37 上：38 右：39 下：40
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            //逻辑：
            //把空白方块右方的数字往左移动
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //每移动一次，计数器就自增一次。
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                //表示空白方块已经在最下方了，他的下面没有图片再能移动了
                return;
            }
            //逻辑：
            //把空白方块下方的数字往上移动
            //x，y  表示空白方块
            //x + 1， y 表示空白方块下方的数字
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            //每移动一次，计数器就自增一次。
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            //逻辑：
            //把空白方块左方的数字往右移动
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //每移动一次，计数器就自增一次。
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            //逻辑：
            //把空白方块上方的数字往下移动
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //每移动一次，计数器就自增一次。
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }


    //判断data数组中的数据是否跟win数组中相同
    //如果全部相同，返回true。否则返回false
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            //i : 依次表示二维数组 data里面的索引
            //data[i]：依次表示每一个一维数组
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //只要有一个数据不一样，则返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历比较完毕，全都一样返回true
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        //判断
        if (obj == replayItem) {
            System.out.println("重新游戏");
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
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
            //直接关闭虚拟机即可
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("作者信息");

            //读取配置文件中的信息
            //1.创建集合
            Properties prop = new Properties();
            //2.读取数据
            try {
                FileInputStream fis = new FileInputStream("puzzlegame\\game.properties");
                prop.load(fis);
                fis.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            //获取图片路径
            String path = (String) prop.get("account");

            showJDialog(path);

        } else if (obj == girl) {
            System.out.println("girl");
            //下列代码重复了，自己思考一下，能否抽取成一个方法呢？
            int number = r.nextInt(13) + 1;
            path = "puzzlegame\\image\\girl\\girl" + number + "\\";
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        } else if (obj == animal) {
            System.out.println("animal");
            //下列代码重复了，自己思考一下，能否抽取成一个方法呢？
            int number = r.nextInt(8) + 1;
            path = "puzzlegame\\image\\animal\\animal" + number + "\\";
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        } else if (obj == sport) {
            System.out.println("sport");
            //下列代码重复了，自己思考一下，能否抽取成一个方法呢？
            int number = r.nextInt(10) + 1;
            path = "puzzlegame\\image\\sport\\sport" + number + "\\";
            //计步器清零
            step = 0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        }else if(obj == saveItem0 || obj == saveItem1 || obj == saveItem2 || obj == saveItem3 ||obj == saveItem4){
            //存档
            //获取当前是哪个存档被点击了,获取当前的序号
            JMenuItem item = (JMenuItem) obj;
            String str = item.getText();
            int index = str.charAt(2) - '0';
            System.out.println(index);

            //把游戏数据写入本地文件
            ObjectOutputStream oos = null;

            try {
                oos = new ObjectOutputStream(new FileOutputStream("puzzlegame\\save\\save"+ index +".data"));

                GameInfo gi = new GameInfo(data , x , y , path , step);
                IoUtil.writeObj(oos , true , gi);
                oos.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            //修改存档item展示信息
            item.setText("存档"+index+"("+step+"步)");

            //修改读档item展示信息
            loadJMenu.getItem(index).setText("读档"+index+"("+step+"步)");


        }else if(obj == loadItem0 || obj == loadItem1 || obj == loadItem2 || obj == loadItem3 ||obj == loadItem4){
            //读档
            //获取当前是哪个读档被点击了,获取其中序号
            JMenuItem item = (JMenuItem) obj;
            String str = item.getText();
            int index = str.charAt(2) - '0';
            System.out.println(index);

            GameInfo gi = new GameInfo();
            try {
                //到本地文件读取数据
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("puzzlegame\\save\\save"+ index +".data"));
                gi = (GameInfo) ois.readObject();
                ois.close();
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            data = gi.getDate();
            path = gi.getPath();
            step = gi.getStep();
            x = gi.getX();
            y = gi.getY();

            //重新刷新界面加载游戏
            initImage();

        }
    }

    //创建一个弹框对象
    JDialog jDialog = new JDialog();
    //展示弹框
    public void showJDialog(String filepath) {
        if(!jDialog.isVisible()){
            JLabel jLabel = null;
            //判断传递的字符串是否是一个路径，且必须以jpg或者png结尾
            //如果满足，则当做图片处理
            //如果不满足，则当做普通字符串处理
            if(new File(filepath).exists() && (filepath.endsWith(".png")||filepath.endsWith(".jpg") )){
                jLabel = new JLabel(new ImageIcon(filepath));
            }else{
                jLabel = new JLabel(filepath);
            }
            //设置位置和宽高
            jLabel.setBounds(0, 0, 258, 258);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344, 344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }
    }
}
