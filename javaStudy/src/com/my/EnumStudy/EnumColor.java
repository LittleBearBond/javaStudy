package com.my.EnumStudy;


import java.util.EnumSet;

public enum EnumColor {
    BLANK("白色", 3, "c"), GREEN("绿色", 2, "b"), RED("红色", 1, "a"), YELLO("黄色", 4, "d");
    // 成员变量
    private String name;
    private int index;
    private String extendName;

    // 构造方法
    private EnumColor(String name, int index, String extendName) {
        this.name = name;
        this.index = index;
        this.extendName = extendName;

    }

    // 普通方法
    public static String getName(int index) {
        for (EnumColor c : values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public static EnumSet<EnumColor> COLOR_NAMES = EnumSet.of(EnumColor.BLANK, EnumColor.GREEN, EnumColor.RED);

    public String getExtendName() {
        return extendName;
    }

    public void setExtendName(String extendName) {
        this.extendName = extendName;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
