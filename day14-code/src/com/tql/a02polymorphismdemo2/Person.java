package com.tql.a02polymorphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置 age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a , String somthing){
        System.out.println("年龄为"+age + "岁的"+name+"养了一只"+
                a.getColor()+"颜色的"+a.getAge()+"岁的宠物");
        a.eat(somthing);

        if(a instanceof Dog dog){
            dog.lookHome();
        } else if (a instanceof Cat cat) {
            cat.catchMouse();
        }else {
            System.out.println("没有这种动物");
        }

    }
}
