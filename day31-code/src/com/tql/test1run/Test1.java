package com.tql.test1run;

public class Test1 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread r1 = new Thread(mr);
        Thread r2 = new Thread(mr);

        r1.setName("窗口一");
        r2.setName("窗口二");

        r1.start();
        r2.start();
    }
}
