package com.company;

import java.util.HashMap;
import java.util.Map;

public class JomoPipi {
    public static String numericals(String s) {
        StringBuilder str= new StringBuilder();
        char[] arr = s.toCharArray();
        Map<Character,Integer> counters= new HashMap<Character, Integer>();
        for( int i = 0; i < arr.length; i++ ) {
            Integer count = counters.get(arr[i]);
            if(count==null){
                count=1;
            }else count++;
            str.append(count);
            counters.put(arr[i],count);
            System.out.println(count);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(JomoPipi.numericals("Hello, World!"));
    }
}