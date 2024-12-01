package com.example.collection;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private int currentIndex = -1; // 현재 index
    private int[] array;

    public MyIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length - 1; // 다음 인덱스가 있는지 체크한다
    }

    @Override
    public Integer next() {
        return array[++currentIndex]; // next()를 호출할 때마다 하나씩 증가시킨다.
    }
}
