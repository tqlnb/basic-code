package com.tql.test2;

public class LegendsFight {
    public static void main(String[] args) {


        Role r1 = new Role("吴亦凡", 100,'男');
        Role r2 = new Role("李易峰", 100,'男');

        r1.showInfo();
        r2.showInfo();

/*
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
*/

    }
}
