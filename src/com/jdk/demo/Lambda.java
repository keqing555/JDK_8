package com.jdk.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("创建接口实例对象");

        Thread thread = new Thread(runnable);
        thread.run();

        Thread thread1 = new Thread(() -> System.out.println("创建线程"));
        thread1.run();

        /**
         * 函数式编程接口
         */
        //Function 一个入参，一个返回值，二者参数类型一致
        Function<String, String> function = (x) -> {
            return x;
        };
        System.out.println(function.apply("function"));

        //Consumer 消费者 一个入参，无返回值
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("consumer");

        //Supplier 提供者 无入参，有返回值
        Supplier<String> supplier = () -> "supplier";
        System.out.println(supplier.get());

        //Predicate 一个入参，返回布尔值
        Predicate<Integer> predicate = (x) -> {
            if (x > 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate.test(2));


//        Supplier<Student> studentSupplier=()->new Student("n","c",0);
        Supplier<Student> studentSupplier=Student::new;
        Student student = studentSupplier.get();
        System.out.println(student);
    }
}
