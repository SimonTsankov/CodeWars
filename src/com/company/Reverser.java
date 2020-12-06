package com.company;

public class Reverser {
    public static int[] reverse(int[] a) {
        return java.util.stream.IntStream.range(0, a.length).map(i -> a[a.length-1-i]).toArray();
    }
}
