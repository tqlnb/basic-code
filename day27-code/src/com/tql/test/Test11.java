package com.tql.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gf gf1 = new Gf();
        while (true){
            try {
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                gf1.setName(name);

                System.out.println("请输入年龄");
                String aa = sc.nextLine();
                int age = Integer.parseInt(aa);
                gf1.setAge(age);
                break;
            } catch (NumberFormatException e){
                System.out.println("年龄的格式有误，请输入数字");
            } catch (RuntimeException e) {
                System.out.println("姓名长度或者年龄范围有误");
            }
        }

        System.out.println(gf1.toString());
    }
}
