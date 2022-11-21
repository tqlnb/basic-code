package com.tql.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //输入数直到和大于200
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(count <= 200){
            System.out.println("请输入整数");
            String line = sc.nextLine();
            list.add(Integer.valueOf(line));
            count += Integer.parseInt(line);
        }
        System.out.println(count);
    }
}
