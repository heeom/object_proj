package com.example.collection;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray integers = new MyArray(new int [] {1,2,3,4});
        for (Integer next : integers) {
            System.out.println(next);
        }
    }
}
