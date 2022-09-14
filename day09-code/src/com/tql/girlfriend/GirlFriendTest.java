package com.tql.girlfriend;

public class GirlFriendTest {
    public static void main(String[] args) {
        Girlfriend gf1 = new Girlfriend("张三",18,"唱");
        Girlfriend gf2 = new Girlfriend("李四",21,"跳");
        Girlfriend gf3 = new Girlfriend("王五",25,"Rap");
        Girlfriend gf4 = new Girlfriend("赵六",23,"篮球");

        Girlfriend [] arr = new Girlfriend[4];

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }

        int ave = sum /4;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < ave){
                count ++;
                System.out.println(arr[i].getName()+","+arr[i].getAge()+"岁,喜欢"+arr[i].getHobby());
            }
        }

        System.out.println("共有"+count +"个");


    }
}
