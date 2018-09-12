package com.my.TypeStudy;

class Demo {

    private int num;

    public Demo(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.num == ((Demo) obj).num;
    }

}
