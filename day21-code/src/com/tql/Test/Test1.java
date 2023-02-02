package com.tql.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序要求1:属性有姓名、年龄、身高。
        要求2:
        按照年龄的大小进行排序，年龄一样，按照身高排序，
        身高一样按照姓名的字母进行排序。
        (姓名中不要有中文或特殊字符，会涉及到后面的知识）*/

        GirlFriend gf1 = new GirlFriend("xiaopaopao", 11, 177);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 22, 188);
        GirlFriend gf3 = new GirlFriend("xiaobaobao", 33, 199);
        GirlFriend [] gfArr = { gf1, gf2, gf3};

        Arrays.sort(gfArr, (o1 , o2) -> o1.getAge()-o2.getAge());
        Arrays.sort(gfArr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                //按照年龄的大小进行排序
                double temp = o1.getAge() - o2.getAge();
                //年龄一样，按照身高排序
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                //身高一样按照姓名的字母进行排序。(姓名中不要有中文或特殊字符，会涉及到后面的知识）
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                //因为返回值只能是int类型，所以根据正负转成整数
                if (temp > 0){
                    return 1;
                } else if (temp < 0) {
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        /*//lambda
        Arrays.sort(gfArr, ( o1, o2)  ->{
                //按照年龄的大小进行排序
                double temp = o1.getAge() - o2.getAge();
                //年龄一样，按照身高排序
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                //身高一样按照姓名的字母进行排序。(姓名中不要有中文或特殊字符，会涉及到后面的知识）
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                //因为返回值只能是int类型，所以根据正负转成整数
                if (temp > 0){
                    return 1;
                } else if (temp < 0) {
                    return -1;
                }else{
                    return 0;
                }
            }
        );*/

        System.out.println(Arrays.toString(gfArr));

    }
}
