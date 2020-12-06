package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("reverser:");
        int arr[]=Reverser.reverse(new int[] {5, 4, 3, 2, 1});
        for (int i:
             arr) {
            System.out.print(i+" ,");
        }
        System.out.println("Equations: ");
        System.out.println(SystemOfEq.Solution(14,28));
        System.out.println(SystemOfEq.Solution(9,3));
        System.out.println("Disguised2:");
        System.out.println(Disguised2.v1(16, 68));
        System.out.println(Disguised2.u1(13, 18));
        System.out.println("factorial:");
        System.out.println(Factorial.f(28));
    }
}
