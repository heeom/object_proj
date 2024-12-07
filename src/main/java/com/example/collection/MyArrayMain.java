package com.example.collection;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray integers = new MyArray(new int [] {1,2,3,4});
        if (integers.iterator().hasNext()) {
            System.out.println(integers.iterator().next());
        }
    }
}
