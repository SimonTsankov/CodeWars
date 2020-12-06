package com.company;


public class Sudoku {

    public static boolean repeat(int arr[]){
        for (int i = 0; i <9 ; i++) {
            for (int j = i+1; j <9 ; j++) {
                if(arr[i]==arr[j])
                    return  false;
            }
        }
        return  true;
    }

    public static boolean check(int[][] sudoku) {
        for (int lines = 0; lines <=8 ; lines++) {
            for (int i = 0; i < 8; i++) {
                for (int j = i+1; j < 9; j++) {

                    if(sudoku[lines][i]==sudoku[lines][j]||sudoku[lines][i]==0||sudoku[lines][j]==0){
                        System.out.println(lines);
                        return  false;
                    }
                }
            }
        }
        int arr[]=new int[9];
        int c=0;
        for (int square = 1; square <=3 ; square++) {
            c=0;
            for (int i = 3*(square-1); i <3*square ; i++) {
                for (int j =3*(square-1) ; j < 3*square; j++) {
                    arr[c]=sudoku[i][j];
                    c++;

                }
            }
            if(repeat(arr)==false){ System.out.println("sqare failed ");return false;}
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 9, 7}
        };
        System.out.println(check(sudoku));
        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;
        System.out.println(check(sudoku));
        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;
        sudoku[4][4] = 0;
        System.out.println(check(sudoku));
    }
}
