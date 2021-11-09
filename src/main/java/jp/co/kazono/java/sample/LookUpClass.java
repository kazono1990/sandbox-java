package jp.co.kazono.java.sample;

import java.lang.invoke.MethodHandles;

public class LookUpClass {
    public static void main(String[] args) {
        Class clazz = MethodHandles.lookup().lookupClass();
        System.out.println("Class: " + clazz);
        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Class Loader: " + clazz.getClassLoader());
    }
}
