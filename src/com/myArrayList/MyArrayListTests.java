package com.myArrayList;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println("strings = " + strings);
        strings.remove(1);
        System.out.println("strings = " + strings);
        System.out.println("strings.get(1) = " + strings.get(1));
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings = " + strings);
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.get(1) = " + strings.get(1));


        strings.clear();
        System.out.println("strings = " + strings);
        System.out.println("strings.get(1) = " + strings.get(1));


    }
}

