package com.jdk.git.impl;

import com.jdk.git.Demo;

public class DemoImpl implements Demo {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
