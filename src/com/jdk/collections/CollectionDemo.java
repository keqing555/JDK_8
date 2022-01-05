package com.jdk.collections;

import com.jdk.bean.Student;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        //使ArrayList线程安全
        List<Object> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        //使HashMap线程安全，HashTable线程安全（put方法前加了synchronized）
        Map<Object, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        /*
         * 遍历Map
         */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        //keySet遍历
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "--" + value);
        }

        //Lambda遍历
        map.forEach((k, v) -> System.out.println(k + "-:-" + v));

        //Arrays.asList
        List<String> asList = Arrays.asList("br1", "br2", "br3");
        asList.forEach(l -> System.out.println(l));

        List<Student> list = Arrays.asList(
                new Student("张三", "语文", 70),
                new Student("张三", "数学", 80),
                new Student("李四", "语文", 60),
                new Student("李四", "数学", 70));
        Random r=new Random();
        System.out.println(list.get(r.nextInt(1)+3));

    }
}
