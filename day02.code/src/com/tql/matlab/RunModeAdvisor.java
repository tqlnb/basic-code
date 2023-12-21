package com.tql.matlab;

import com.mathworks.engine.MatlabEngine;

public class RunModeAdvisor {
    public static void main(String[] args) {
        // 启动 MATLAB 引擎
        try {
            MatlabEngine matlabEngine = MatlabEngine.startMatlab();

            // 设置模型文件路径
            String modelPath = "路径/到/您的/模型文件.slx"; // 替换为实际模型路径

            // 调用 Mode Advisor
            matlabEngine.eval("open_system('" + modelPath + "')");
            //matlabEngine.eval("ModelAdvisor('Model', '" + modelPath + "')");

            // 这里可以添加其他 MATLAB 命令以打开模型、执行 Mode Advisor 或生成报告
            while (true) {
                Thread.sleep(1000);
            }
            // 关闭 MATLAB 引擎
            //matlabEngine.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
