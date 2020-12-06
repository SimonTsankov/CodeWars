package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> squares = new ArrayList<Integer>();
        int area = lng * wdth;
        while (area > 0) {
            squares.add(Math.min(lng,wdth));
            if (wdth > lng)wdth = wdth - lng;
            else lng = lng - wdth;
            area = lng * wdth;
        }
        return squares;
    }

    public static void main(String[] args) {
        System.out.println(SqInRect.sqInRect(5, 3));
        System.out.println(SqInRect.sqInRect(51, 120));
    }
}
