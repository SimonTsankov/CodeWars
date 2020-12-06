package com.company;

public class prime_string {

    public static boolean primeString(String s) {
        if(s.length()==1||(s.length()==2&& s.charAt(0)==s.charAt(1))){
            return  false;
        }else
            if(s.length()==2)return true;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <=s.length()/2+1 ; i++) {
            String temp=s.substring(0,i);
            result=new StringBuilder();
            for (int j = 0; j <s.length()/temp.length() ; j++) {
                result.append(temp);
            }
            if (result.toString().equals(s)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeString("qp"));
//        assertEquals(true, Kata.primeString("abac")); test
//        assertEquals(false, Kata.primeString("abab")); yes
//        assertEquals(false, Kata.primeString("aaaa"));tyes
//        assertEquals(true, Kata.primeString("x"));
//        assertEquals(true, Kata.primeString("abc")); yes
//        assertEquals(false, Kata.primeString("fdsyffdsyffdsyffdsyffdsyf"));
//        assertEquals(true, Kata.primeString("utdutdtdutd"));
//        assertEquals(true, Kata.primeString("abba"));
    }
}
