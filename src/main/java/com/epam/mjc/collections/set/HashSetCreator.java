package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer number: sourceList) {
            if (number % 2 == 0) {
                while (number >= 1) {
                    hashSet.add(number);
                    number = number/2;
                }
            } else {
                hashSet.addAll(Set.of(number, number*2));
            }
        }
        return hashSet;
    }
}
