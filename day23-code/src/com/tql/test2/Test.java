package com.tql.test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test<E> {
    public static void main(String[] args) {
        ArrayList<Bosi> list1 = new ArrayList<>();
        ArrayList<Lihua> list2 = new ArrayList<>();
        ArrayList<Teddy> list3 = new ArrayList<>();
        ArrayList<Haskey> list4 = new ArrayList<>();

        keepAnimal(list1);
        keepCat(list2);
        keepDog(list3);
    }

    public static void keepCat(ArrayList<? extends Cat> list) {
        Iterator<? extends Cat> it = list.iterator();
        while (it.hasNext()) {
            Cat next = it.next();
            next.eat();
        }
    }

    public static void keepDog(ArrayList<? extends Dog> list) {
        Iterator<? extends Dog> it = list.iterator();
        while (it.hasNext()) {
            Dog next = it.next();
            next.eat();
        }
    }

    public static void keepAnimal(ArrayList<? extends Animal> list) {
        Iterator<? extends Animal> it = list.iterator();
        while (it.hasNext()) {
            Animal next = it.next();
            next.eat();
        }
    }
}

