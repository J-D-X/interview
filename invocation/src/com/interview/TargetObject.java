package com.interview;

public class TargetObject {
    private String value;

    public TargetObject(){
        this.value = "hfkkk";
    }

    public void publicMethod(String s){
        System.out.println("I love " + s);
    }

    private void privateMethod(){
        System.out.println("value is " + value);
    }
}
