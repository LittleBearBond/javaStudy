package com.my;

public class Car {

    private String color;
    // 轮胎个数
    private int num = 4;

    // 颜色
    public Car() {
        this.color = "default color";
        this.num = 6;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int num) {
        this.color = color;
        this.num = num;
    }


    // 行为
    void run() {
        System.out.println("我是" + color + "的小汽车，我有" + num + "个轮子");
    }
}
