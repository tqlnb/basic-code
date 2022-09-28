package com.tql.a04oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("123","张三",12000,12333);
        System.out.println(m.getId()+", "+m.getName()+", "
                +m.getSalary()+", "+m.getBouns());
        m.work();
        m.eat();


        Cook c = new Cook();
        c.setId("1234");
        c.setName("李四");
        c.setSalary(3000);
        System.out.println(c.getId()+", "+c.getName()+", " +c.getSalary());
        c.work();
        c.eat();
    }
}
