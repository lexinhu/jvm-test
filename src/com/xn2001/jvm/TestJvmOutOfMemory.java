package com.xn2001.jvm;

import java.util.ArrayList;
import java.util.UUID;


/**
 * 模拟内存溢出
 */
public class TestJvmOutOfMemory {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < 1000; j++) {
                str.append(UUID.randomUUID().toString());
            }
            list.add(str.toString());
        }
        System.out.println("OK");
    }
}
