package com.company;

public class GuessNumber {
    private static int num = 123;

    public static String guess(int number) {
        if (number > num)
            return "Too high!";
        if (number < num)
            return "Too low!";
        return "Correct!";
    }

    public static int getNumber() {
        int upper = 1000;
        int lower = 0;
        String answer;
        for (int i = 0; i < 10; i++) {
            int number = (upper + lower) / 2;
            answer = guess(number);

            if (answer.equals("Correct!")) {
                return number;
            }
            if (answer.equals("Too high!")) {
                upper = number;
            } else
                if(answer.equals("Too low!")) {
                    lower = number;
                }
        }

        return 1000;
}

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
