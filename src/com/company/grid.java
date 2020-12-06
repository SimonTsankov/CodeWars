package com.company;

public class grid {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static int travelChessboard(String s) {
        int x1=Integer.parseInt(s.charAt(1)+"");
        int x2=Integer.parseInt(s.charAt(6)+"");
        int y1=Integer.parseInt(s.charAt(3)+"");
        int y2=Integer.parseInt(s.charAt(8)+"");
        int times_down=Integer.parseInt(s.charAt(8)+"")-Integer.parseInt(s.charAt(3)+"");
        int times_right=Integer.parseInt(s.charAt(6)+"")-Integer.parseInt(s.charAt(1)+"");
        int moves=times_down+times_right;
        return factorial(moves)/(factorial(times_down)*factorial(times_right));
    }

    public static void main(String[] args) {
        System.out.println( travelChessboard("(2 3)(4 8)"));
    }
}
