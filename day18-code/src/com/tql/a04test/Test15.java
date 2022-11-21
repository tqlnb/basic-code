package com.tql.a04test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test15 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 8, 29);
        System.out.println(ChronoUnit.DAYS.between(birthday, now));
    }
}
