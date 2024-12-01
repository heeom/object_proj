package com.example.collection;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {

    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(array); // MyArray에서 사용할 반복자 ArrayIterator를 반환
    }
}
