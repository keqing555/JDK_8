package com.jdk.string;

public class StringDemo {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuffer buffer = new StringBuffer("abcdefg");
        String concat = str.concat("1");
        buffer.append("1");
        System.out.println(str);
        System.out.println(buffer);
        System.out.println(concat);

        int i = str.compareTo(String.valueOf(buffer));
        int i1 = concat.compareTo(buffer.toString());
        System.out.println(i + "--" + i1);

        System.out.println(str.replace(str.charAt(4), 'E'));


        //StringBuilder
        StringBuilder stringBuilder_1 = new StringBuilder();//默认容量16
        StringBuilder stringBuilder_2 = new StringBuilder("3");//length+16
        System.out.println(stringBuilder_1.length());
        System.out.println(stringBuilder_1.capacity());
        System.out.println(stringBuilder_2);
        System.out.println(stringBuilder_2.length());
        System.out.println(stringBuilder_2.capacity());
        stringBuilder_1.append(stringBuilder_2);
        System.out.println(stringBuilder_1);
        System.out.println(stringBuilder_1.capacity());
    }
}
