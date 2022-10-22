package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;

public class P2 {
    private static IUserInput userInput;

    public P2(IUserInput input) {
        userInput = input;
    }

    public static void main(String[] args) {
        if (userInput == null) {
            userInput = new UserInput();
        }
        Print("salary: ");
        String input = userInput.nextLine();
        Print("merit: ");
        int merit = userInput.nextInt();
        userInput.close();
        int salary = Integer.parseInt(input.replaceAll("[^0-9]", ""));

        String grade = "";
        if (salary >= 700 && salary <= 899) {
            grade = "A";
        } else if (salary >= 600 && salary <= 799) {
            grade = "B";
        } else if (salary >= 500 && salary <= 649) {
            grade = "C";
        }

        if (salary >= 600 && salary <= 649) {
            if (merit < 10) {
                grade = "C";
            } else {
                grade = "B";
            }
        }

        if (salary >= 700 && salary <= 799) {
            if (merit < 20) {
                grade = "B";
            } else {
                grade = "A";
            }
        }

        Print("salary: " + input + ", merit: " + merit + " - Grade " + grade);
    }

    public static void Print(String message) {
        System.out.println(message);
    }
}
