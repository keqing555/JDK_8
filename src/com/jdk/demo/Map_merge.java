package com.jdk.demo;

import java.util.*;

public class Map_merge {

    public static void main(String[] args) {
        List<Student> stuList = Arrays.asList(
                new Student("张三", "语文", 70),
                new Student("张三", "数学", 80),
                new Student("李四", "语文", 60),
                new Student("李四", "数学", 70));

        Map<String, Integer> scoreMap = new HashMap<>();

        //常规求总分
        stuList.forEach(stu -> {
            if (scoreMap.containsKey(stu.getName())) {
                scoreMap.put(stu.getName(), scoreMap.get(stu.getName()) + stu.getScore());
            } else {
                scoreMap.put(stu.getName(), stu.getScore());
            }
        });
        System.out.println(scoreMap);

        //merge方法
        Map<String, Integer> scoreMap2 = new HashMap<>();
        stuList.forEach(stu -> {
            scoreMap2.merge(stu.getName(), stu.getScore(), Integer::sum);
        });
        System.out.println(scoreMap2);

        //compute 获取map指定key的value进行操作，ket不存在也会插入
        Map<String, Integer> scoreMap3 = new HashMap<>();
        stuList.forEach(stu -> {
            scoreMap3.compute(stu.getName(), (k, v) -> {
                if (v == null) {
                    v = stu.getScore();
                } else {
                    v += stu.getScore();
                }
                return v;
            });
        });
        System.out.println(scoreMap3);
    }
}
