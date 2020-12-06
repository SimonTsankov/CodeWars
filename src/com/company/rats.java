package com.company;

public class rats {
    public int find(int[] rats) {
        //Each number from the array is the index of which possiton there is a 1 in the bin number, but reversed
        StringBuilder num = new StringBuilder("0000000000");
        for(int r : rats) num.setCharAt(r, '1');
        return Integer.parseInt(num.reverse().toString(), 2);
    }
}
