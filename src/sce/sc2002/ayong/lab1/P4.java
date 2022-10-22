package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;

public class P4 {
    private static IUserInput userInput;

    public P4(IUserInput input) {
        userInput = input;
    }

    public static void main(String[] args) {
        if (userInput == null) {
            userInput = new UserInput();
        }

        Print("Enter Height: ");
        int height = userInput.nextInt();
        userInput.close();
        if (height <= 0){
            Println("Error input!!");
            return;
        }

        String output = "";
        for (int i = 0; i < height; i++) {
            PrintPattern(i);
        }
    }


    public static void PrintPattern(int row) {
        Boolean aa = row % 2 == 0;
        String output = "";
        for (int i = 0; i <= row; i++) {
            if (aa) {
                output += "AA";
            } else {
                output += "BB";
            }
            aa = !aa;
        }
        Println(output);
    }

    public static void Println(String message) {
        System.out.println(message);
    }
    public static void Print(String message) {
        System.out.print(message);
    }

}
