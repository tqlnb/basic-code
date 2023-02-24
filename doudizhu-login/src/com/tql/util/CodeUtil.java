package com.tql.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {

    public static String getCode(){
      //自己练习
        ArrayList<Character> codeBox = new ArrayList<>();
        ArrayList<Character> code = new ArrayList<>();
        for (int i = 48; i < 58; i++) {
            codeBox.add((char)i);
        }
        for (int i = 65; i < 91; i++) {
            codeBox.add((char)i);
        }
        for (int i = 97; i < 123; i++) {
            codeBox.add((char)i);
        }
        int o = codeBox.indexOf('o');
        codeBox.remove(o);
        int O = codeBox.indexOf('O');
        codeBox.remove(O);


        //生成随机数 4个字母和1个数字
        Random r = new Random();
        boolean flag = true;
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(60);
            if(!flag){
                flag = true;
                index = r.nextInt(50) + 10;
            }
            if(index < 10){
                flag = false;
            }
            code.add(codeBox.get(index));
        }
/*        for (int i = 0; i < 4; i++) {
            code.add(codeBox.get(r.nextInt(52)+10));
        }
        code.add(codeBox.get(r.nextInt(10)));*/


        //打乱
        //Collections.shuffle(code);
        String codeStr = "";
        for (Character character : code) {
            codeStr += character;
        }

        return codeStr;
    }
}