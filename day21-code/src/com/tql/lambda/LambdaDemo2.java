package com.tql.lambda;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Integer [] arr = {2,3,1,5,4,9,7,8,6};
        Arrays.sort(arr, ( o1, o2) -> o2-o1 );

        System.out.println(Arrays.toString(arr));
    }
}
