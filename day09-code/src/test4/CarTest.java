package test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car [] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();

            System.out.println("请输入车的品牌");
//            String brand = sc.next();
            c.setBrand(sc.next());

            //录入价格
            System.out.println("请输入汽车价格");
//            int price = sc.nextInt();
            c.setPrice(sc.next());

            //录入颜色
            System.out.println("请输入汽车颜色");
//            String color = sc.next();
            c.setColor(sc.next());
            System.out.println("===============");

            arr[i] = c;
        }

        for (Car car: arr) {
            System.out.println(car);
        }
    }
}
