package com.jdk.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_merge {

    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("张三", "语文", 70));
        stuList.add(new Student("张三", "数学", 80));
        stuList.add(new Student("李四", "语文", 60));
        stuList.add(new Student("李四", "数学", 70));

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
        Map<String,Integer> scoreMap2=new HashMap<>();
        stuList.forEach(stu->{
            scoreMap2.merge(stu.getName(),stu.getScore(),Integer::sum);
        });

        System.out.println(scoreMap2);
    }
}