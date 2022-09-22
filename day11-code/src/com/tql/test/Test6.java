package com.tql.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        //需求:
        //1.main方法中定义一个集合，存入三个用户对象。
        //用户属性为:id,username,password
        //2.要求:定义一个方法，根据id查找对应的用户信息。
        //如果存在，返回true如果不存在，返回false
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001","tql","123abc");
        User u2 = new User("002","ttql","123456");
        User u3 = new User("003","tqll","123789");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean result = scan(list, "002");
        System.out.println(result);

    }
    public static boolean scan(ArrayList<User> list,String id){
        for (User user : list) {
            if(user.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
