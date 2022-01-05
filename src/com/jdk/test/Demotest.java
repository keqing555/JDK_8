package com.jdk.test;

import com.jdk.git.Demo;
import com.jdk.git.impl.DemoImpl;

import java.util.Random;

public class Demotest {
    public static void main(String[] args) {
        int a = 1500;
        int b = 1650;
        Demo demo = new DemoImpl();
        System.out.println(demo.add(a, b));

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(5)  );
        }

        System.out.println("---------------=-");

        for(int i=0;i<10;i++){
            System.out.println(Math.random()*100);
        }

    }
}
