package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {

    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squares = new TreeSet<>();
        sourceList.forEach(el -> squares.add((int) Math.pow(el, 2)));
        return squares.subSet(lowerBound, true, upperBound, true);
    }
}
