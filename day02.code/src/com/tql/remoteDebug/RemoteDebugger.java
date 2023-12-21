package com.tql.remoteDebug;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector.Argument;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;

import java.io.IOException;
import java.util.Map;

public class RemoteDebugger {

    public static void main(String[] args) {
        // 设置远程调试的主机和端口
        String host = "103.99.178.89";
        int port = 17002;

        // 启动远程调试客户端
        startRemoteDebugger(host, port);
    }

    private static void startRemoteDebugger(String host, int port) {
        // 获取 AttachingConnector
        AttachingConnector connector = getAttachingConnector();

        // 设置连接参数
        Map<String, Argument> arguments = connector.defaultArguments();
        Argument hostArg = arguments.get("hostname");
        hostArg.setValue(host);

        Argument portArg = arguments.get("port");
        portArg.setValue(String.valueOf(port));

        try {
            // 连接到远程调试服务器
            VirtualMachine virtualMachine = connector.attach(arguments);

            // 现在你可以使用 virtualMachine 对象进行远程调试操作

            // 例如，列出所有线程
            virtualMachine.allThreads().forEach(thread -> {
                System.out.println("Thread ID: " + thread.uniqueID());
            });

            // 恢复程序运行
            virtualMachine.resume();

            // 关闭连接
            virtualMachine.dispose();
        } catch (IOException | IllegalConnectorArgumentsException e) {
            e.printStackTrace();
        }
    }

    private static AttachingConnector getAttachingConnector() {
        return Bootstrap.virtualMachineManager().attachingConnectors().stream()
                .filter(c -> "com.sun.jdi.SocketAttach".equals(c.name()))
                .map(c -> (AttachingConnector) c)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("No SocketAttachingConnector found"));
    }
}
