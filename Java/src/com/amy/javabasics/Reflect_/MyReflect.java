package com.amy.javabasics.Reflect_;

import java.lang.reflect.Field;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class MyReflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.amy.javabasics.Reflect_.Student");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

    }
}
