package com.tql.mytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day28-code\\a.txt"));

        //2.读取数据
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student student : list) {
            System.out.println(student);
        }


        //3.释放资源
        ois.close();

    }
}
