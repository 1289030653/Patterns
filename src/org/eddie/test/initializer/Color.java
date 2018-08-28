package org.eddie.test.initializer;

public class Color {
    private static int color_id = initId();
    private static int initId() {
        System.out.println("color static field");
        return Color.color_id++;
    }
    private static String initColor() {
        System.out.println("color field");
        return "red";
    }
    static {
        System.out.println("color static init block 111");
    }
    static {
        System.out.println("color static init block 2222");
    }

    private String color = Color.initColor();

    {
        System.out.println("color init block");
    }
    public Color() {
        System.out.println("color constructor");
    }
}

class RedColor extends Color {
    private static int color_id = initId();
    private static int initId() {
        System.out.println("red color static field");
        return RedColor.color_id++;
    }
    static {
        System.out.println("red color static init block");
    }
    private int degree = RedColor.initDegree();
    private static int initDegree() {
        System.out.println("red color field");
        return 10;
    }
    {
        System.out.println("red color init block");
    }
    public RedColor() {
        System.out.println("red color constructor");
    }
}
