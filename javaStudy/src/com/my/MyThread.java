package com.my;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("线程名称：" + this.getName());
    }
}
