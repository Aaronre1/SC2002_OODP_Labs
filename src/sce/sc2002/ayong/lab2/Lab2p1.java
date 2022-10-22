package sce.sc2002.ayong.lab2;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;

import java.util.Random;

public class Lab2p1 {
    public Lab2p1(IUserInput input){
        sc = input;
    }
    private static IUserInput sc;
    private static Random rand = new Random();

    //private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (sc == null){
            sc = new UserInput();
        }
        int choice;
        PrintOptions();
        do {
            choice = sc.nextInt();
            Run(choice);
        } while (choice < 7);
        sc.close();
    }

    private static void PrintOptions() {
        Println("Perform the following methods:");
        Println("1: multiplication test");
        Println("2: quotient using division by subtraction");
        Println("3: remainder using division by subtraction");
        Println("4: count the number of digit");
        Println("5: position of a digit");
        Println("6: extract all odd digits");
        Println("7: quit");
    }

    private static void Run(int choice) {
        Input in = new Input();
        switch (choice) {
            case 1:
                mulTest();
                break;
            case 2:
                in = GetUserInput(2);
                Println(in.m + "/" + in.n + " = " + divide(in.m, in.n));
                break;
            case 3:
                in = GetUserInput(2);
                Println(in.m + " % " + in.n + " = " + modulus(in.m, in.n));
                break;
            case 4:
                in = GetUserInput(1);
                if (in.n < 1) {
                    Println("n : " + in.n + " - Error input!!");
                } else {
                    Println("n : " + in.n + " - count = " + countDigits(in.n));
                }
                break;
            case 5:
                Print("n: ");
                in.n = sc.nextInt();
                Print("digit: ");
                in.m = sc.nextInt();
                Println("position = " + position(in.n, in.m));
                break;
            case 6:
                Print("n: ");
                long input = sc.nextLong();
                if (input < 1) {
                    Println("oddDigits = Error input!!");
                } else {
                    Println("oddDigits = " + extractOddDigits(input));
                }
                break;
            case 7:
                Println("Program terminating ....");
                break;
        }
    }

    private static void mulTest() {
        int score = 0;
        for (int i = 0; i < 5; i++) {
            int left = rand.nextInt(1, 10);
            int right = rand.nextInt(1, 10);
            int answer = left * right;
            Print("How much is " + left + " times " + right + "? ");
            int input = sc.nextInt();
            if (answer == input) {
                score++;
            }
        }
        Println(score + " answers out of 5 are correct.");
    }

    private static int divide(int m, int n) {
        int count = 0;
        do {
            m -= n;
            if (m >= 0) {
                count++;
            }
        } while (m > 0);
        return count;
    }

    private static int modulus(int m, int n) {
        while (m >= n) {
            m = m - n;
        }
        return m;
    }

    private static int countDigits(int n) {
        String str = String.valueOf(n);
        return str.length();
    }

    private static int position(int n, int m) {
        int result = -1;
        String str = String.valueOf(n);
        String[] split = str.split("(?!^)");

        String comp = String.valueOf(m);
        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase(comp)) { // TODO: .equals() vs == | value vs ref
                result = i + 1;
            }
        }
        return result;
    }

    private static long extractOddDigits(long n) {
        int result = -1;
        String[] split = String.valueOf(n).split("(?!^)"); // TODO: Regular Expressions
        String resultStr = "";

        for (String s : split) {
            int digit = Integer.parseInt(s);
            if (digit % 2 != 0) {
                resultStr += s;
            }
        }

        if (!resultStr.isBlank()) {
            result = Integer.parseInt(resultStr);
        }
        return result;
    }

    private static void Println(String message) {
        System.out.println(message);
    }

    private static void Print(String message) {
        System.out.print(message);
    }

    private static Input GetUserInput(int params) {
        Input input = new Input();
        if (params == 2) {
            Print("m = ");
            input.m = sc.nextInt();
        }
        Print("n = ");
        input.n = sc.nextInt();
        return input;
    }

    private static class Input {
        public int m;
        public int n;
    }
}

