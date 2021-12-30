package com.jdk.test;

import com.jdk.git.Demo;
import com.jdk.git.impl.DemoImpl;

public class Demotest {
    public static void main(String[] args) {
        int a=1500;
        int b=1650;
        Demo demo=new DemoImpl();
        System.out.println(demo.add(a,b));
    }
}
