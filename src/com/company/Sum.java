package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.of;

public class Sum
{
    public static int sumGroups1(int[] arrtemp) {
        LinkedList<Integer> arr = new LinkedList<Integer>();
        for (int fuck:
                arrtemp) {
            arr.add(fuck);
        }
        for (int x = 0; x <arr.size() ; x++) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i) % 2 == 0 && arr.get(j) % 2 == 0) {
                        arr.set(i, arr.get(i) + arr.get(j));
                        arr.remove(j);
                        j--;
                    } else break;
                }
                for (int jj = i + 1; jj < arr.size(); jj++) {
                    if (arr.get(i) % 2 == 1 && arr.get(jj) % 2 == 1) {
                        arr.set(i, arr.get(i) + arr.get(jj));
                        arr.remove(jj);
                        jj--;
                    } else break;
                }
            }
        }
        return arr.size();
    }

    //second try

    static int sumGroups(int[] arr) {
        String a=of(arr).mapToObj(i->i%2+"").collect(Collectors.joining());
        return a.replaceAll("1(11)*", "1").replaceAll("(0|11)+", "0").length();
    }

    public static void main(String[] args) {
        System.out.println(sumGroups(new int[] {2, 1, 2, 2, 6, 5, 0, 2, 0, 5, 5, 7, 7, 4,2, 3, 3, 9}));

    }
}
