package test4;

import java.util.Scanner;

public class Car {
    private String brand ;
    private String price;
    private String color;

    Scanner sc = new Scanner(System.in);
    public Car() {
    }

    public Car(String brand, String price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor(String brand, String price, String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addCar(){
        System.out.println("请输入车的品牌");
//            String brand = sc.next();
        setBrand(sc.next());

        //录入价格
        System.out.println("请输入汽车价格");
//            int price = sc.nextInt();
        setPrice(sc.next());

        //录入颜色
        System.out.println("请输入汽车颜色");
//            String color = sc.next();
        setColor(sc.next());
        System.out.println("===============");
    }
    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'';
    }
}
