package com.my;

public class extendTest {

}


/**
 * 基类
 *
 * @author LGL
 */
class Base {

    void speak() {
        System.out.println("Hello");
    }
}

/**
 * 学生
 *
 * @author LGL
 */
class student extends Base {

    void speak() {
        System.out.println("学习");
    }
}

/**
 * 工人
 *
 * @author LGL
 */
class worker extends Base {

    void speak() {
        System.out.println("工作");
    }
}


abstract class Employee {
    // 姓名
    private String name;
    // 工号
    private String id;
    // 工资
    private double pay;

    // 这个员工一生成，这三个属性必须有
    public Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    // 员工做什么是不确定的
    public abstract void work();

}

/**
 * 经理类
 *
 * @author LGL
 */
class Manager extends Employee {

    // 奖金
    private int bonus;

    public Manager(String name, String id, double pay, int bonus) {

        super(name, id, pay);
        this.bonus = bonus;
    }

    // 复写
    @Override
    public void work() {
        System.out.println("管理");
    }

}

/**
 * 时间类
 *
 * @author LGL
 */
abstract class GetTime {
    // 获取时间
    public long getTime() {
        long start = System.currentTimeMillis();
        runCode();
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * 耗时方法
     */
    /**
     * 耗时方法
     */
    public abstract void runCode();
}

class Test extends GetTime {
    @Override
    public void runCode() {
        // 耗时
        for (int i = 0; i < 50000; i++) {
            System.out.print("" + i);
        }
    }

}

class Student implements Person, Person2 {

    @Override
    public void speak() {

    }

    @Override
    public void work() {

    }

}

/**
 * 人的接口
 *
 * @author LGL
 */
interface Person {

    public static final int AGE = 20;

    /**
     * 说话
     */
    public abstract void speak();
}

interface Person2 {
    public abstract void work();
}