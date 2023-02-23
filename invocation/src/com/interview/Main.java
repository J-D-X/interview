package com.interview;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 使用反射操作类的方法和变量
        Class<?> targetClass = Class.forName("com.interview.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        Method[] methods = targetClass.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        Method publicMethod= targetClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"JavaGuide");

        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject,"JavaGuide");

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
