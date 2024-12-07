package com.example.collection;

import java.util.*;

public class IterableMain {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println("ArrayList : " + integers.iterator());
        integers.iterator().hasNext();


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        System.out.println("HashMap : " + map.keySet().iterator());

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        System.out.println("LinkedList : " + linkedList.iterator());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        System.out.println("HashSet : " + set.iterator());

    }
}
