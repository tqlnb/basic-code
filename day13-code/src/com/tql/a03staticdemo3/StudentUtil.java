package com.tql.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private  StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        int max = 0;
        for (Student student : list) {
            int age = student.getAge();
            if(max < age){
                max = age;
            }
        }
        return max;
    }

}
