package com.xn2001.jvm;

public class TestJVM {
    public static void main(String[] args) {
        String str = System.getProperty("str");
        if (str == null) {
            System.out.println("strNull");
        } else {
            System.out.println(str);
        }
    }
}
