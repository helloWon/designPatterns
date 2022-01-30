package me.designpatterns.structural.flyweight.java;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 내부적으로 캐싱
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(10000);
        Integer i4 = Integer.valueOf(10000);
        System.out.println(i1 != i2); // == 하지말고 equals 사용하도록 하자
    }
}
