package com.example.collection;

import java.util.*;

public class IterableMain {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println("List : " + integers.iterator());


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        System.out.println("Map : " + map.keySet().iterator());


        Set<Integer> set = Set.of(1, 2);
        System.out.println("Set : " + set.iterator());

    }
}
