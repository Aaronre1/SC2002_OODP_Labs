package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;

public class P1 {
    private static IUserInput userInput;

    public P1(IUserInput input) {
        userInput = input;
    }

    public static void main(String[] args) {
        if (userInput == null) {
            userInput = new UserInput();
        }
        Print("Enter choice A, C, D");

        char choice = userInput.next().charAt(0);

        switch (choice) {
            case 'A', 'a' -> Print("Action movie fan");
            case 'C', 'c' -> Print("Comedy movie fan");
            case 'D', 'd' -> Print("Drama movie fan");
            default -> Print("Invalid choice");
        }
        userInput.close();

    }

    public static void Print(String message) {
        System.out.println(message);
    }
}