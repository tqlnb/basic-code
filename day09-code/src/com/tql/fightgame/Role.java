package com.tql.fightgame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

/*
    public String toString() {
        return "Legends{name = " + name + ", blood = " + blood + "}";
    }
*/
    //定义一个方法攻击敌人
    //Role l1 = new Role();
    //Role l2 = new Role();
    //l1 攻击 l2
    //方法的调用者攻击参数
    public void attack (Role role){
        //随机造成的伤害1-20
        Random r = new Random();
        int damage = r.nextInt(20) + 1;
        int remain = role.getBlood() - damage;
        //对剩余血量验证是否小于0
        remain = Math.max(remain, 0);
        //修改敌人的血量
        role.setBlood(remain);
        //this表示方法的调用者
        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+"一下"+
         "造成了"+damage+"点伤害，"+role.getName()+"还剩下"+remain+"点血");
    }

}
