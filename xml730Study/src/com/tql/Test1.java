package com.tql;

public class Test1 {
    public static void main(String[] args) {
        //打印当前系统所有进程pid
        //1.获取当前系统所有进程
        ProcessHandle.allProcesses().forEach(p -> {
            //2.获取进程的pid
            long pid = p.pid();
            long ppid= -1;
            //获取ppid
            if(p.parent().isPresent()) {
                 ppid = p.parent().get().pid();
            }
            //java打印进程参数


            //3.打印pid
            System.out.println(p.info().toString()+pid + " 爹是 " + ppid);
        });

    }
}
