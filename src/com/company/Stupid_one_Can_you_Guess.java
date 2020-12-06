package com.company;

public class Stupid_one_Can_you_Guess {
    public static int lambda(int x) {
        String a = "0123456789abcde";
        String b = "abcde4321098765";
        String s = String.valueOf(x);
        for (int i = 0; i < 15; i++) {
            s = s.replaceAll(a.substring(i, i + 1), b.substring(i, i + 1));
        }
        return Integer.parseInt(s);
    }

    public static int code(int x, int y) {
        return lambda(x) + lambda(y);
    }

}
