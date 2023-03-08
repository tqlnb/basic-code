package com.tql.test66;

import java.util.ArrayList;
import java.util.Collections;

public class Thread66 extends Thread{
    static ArrayList<Integer> listA = new ArrayList<>();
    public Thread66(ArrayList<Integer> list){
        listA = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> list = new ArrayList<>();

        while (true){
            synchronized (Thread66.class){
                if(listA.size() == 0){
                    System.out.println(getName() + list);
                    break;
                }else {
                    Collections.shuffle(listA);
                    Integer remove = listA.remove(0);
                    list.add(remove);
                }
            }

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
