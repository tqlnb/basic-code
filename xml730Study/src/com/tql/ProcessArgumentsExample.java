package com.tql;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class ProcessArgumentsExample {
    public static void main(String[] args) {
        // 获取 RuntimeMXBean 实例
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();

        // 获取进程的参数列表
        List<String> inputArguments = runtimeMXBean.getInputArguments();
        for (String arg : inputArguments) {
            System.out.println("Process Argument: " + arg);
        }

    }
}
