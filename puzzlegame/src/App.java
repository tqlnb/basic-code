import com.tql.ui.LoginJFrame;

public class App {
    public static void main(String[] args) {
        //表示程序的启动入口
        //如果我们想要开启一个界面，就创建谁的对象就可以了

/*        new Thread(new Runnable() {
            @Override
            public void run() {
                new LoginJFrame();
            }
        }).start();*/
        new LoginJFrame();
        //new GameJFrame();

    }
}
