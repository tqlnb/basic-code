package com.tql.test7;

import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //1.读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("day30-code\\src\\com\\tql\\test7\\userinfo.txt"));
        String line = br.readLine();
        br.close();

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");

        String rightUsername = arr1[1];
        String rightPassword = arr2[1];
        int count = Integer.parseInt(arr3[1]);

        //2.用户录入键盘密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //3.判断输入错误次数
        if(count >= 3){
            System.out.println("用户名或密码错误三次,账户已被锁定");
            return;
        }

        //4.判断用户名密码
        if((rightUsername.equals(username) && rightPassword.equals(password))){
            System.out.println("登陆成功");
            count = 0;
        }else {
            count ++;
            System.out.println("登陆失败");
        }
        //5.将新的数据写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("day30-code\\src\\com\\tql\\test7\\userinfo.txt"));
        bw.write(userInfo[0] +"&"+ userInfo[1] + "&count=" + count);
        bw.close();

    }
}
