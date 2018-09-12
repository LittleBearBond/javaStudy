package com.my;

import com.my.EnumStudy.EnumColor;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*int[] arr = new int[]{3, 6, 8, 74, 99, 12};
        int[][] arr2 = {{4, 6, 8}, {99, 22, 88}, {74, 36, 1}};

        printArray(arr);*/

       /* Car car = new Car();
        System.out.println(car.getClass());
        System.out.println(car.getClass().getName());*/

        /*MyThread thread = new MyThread("test thread");
        thread.start();*/

        forEnum();

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void forEnum() {
        for (EnumColor simpleEnum : EnumColor.values()) {
            System.out.println(simpleEnum + "  ordinal  " + simpleEnum.ordinal());
        }
        System.out.println("------------------");
        for (EnumColor type : EnumColor.values()) {
            System.out.println("type = " + type + "    type.name = " + type.name() + "   typeName = " + type.getName() + "   ordinal = " + type.ordinal());
        }

    }
}
