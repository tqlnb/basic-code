package com.tql.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //存用户名密码
        String username = "tqlttql";
        String password = "123abc,,";

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(count < 3){
            System.out.println("请输入用户名");
            String getUsername = sc.next();
            System.out.println("请输入密码");
            String getPassword = sc.next();
            if(username.equals(getUsername) && password.equals(getPassword)){
                System.out.println("成功登录");
                return;
            }else{
                count ++;
                System.out.println("用户名或密码错误"+count +"次（共3次机会）");
                if(count < 3)
                    System.out.println("请重新输入");

            }
        }
        System.out.println("输入失败次数过多，拒绝访问");
        return;
    }
}
