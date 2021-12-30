package com.jdk.label;

/**
 * java 标签
 */
public class LabelDemo {

    public static void main(String[] args) {
        label_1:
        for (int i = 1; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (j == i) {
                    System.out.println();
                    continue label_1;//等价于break
                }
                System.out.print(j);

            }

        }
    }
}
