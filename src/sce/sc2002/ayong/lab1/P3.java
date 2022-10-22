package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;

public class P3 {
    private static IUserInput userInput;

    public P3(IUserInput input) {
        userInput = input;
    }

    public static void main(String[] args) {
        if (userInput == null) {
            userInput = new UserInput();
        }
        Request request = GetUserInput();
        if (Validate(request)) {
            ForLoop(request);
            WhileLoop(request);
            DoWhileLoop(request);
        } else {
            PrintError();
        }
    }

    public static void ForLoop(Request request) {
        int start = request.Start;
        int end = request.End;
        int step = request.Step;
        PrintHeader();
        for (int i = start; i <= end; i += step) {
            double sgd = Convert(i);
            Println(i + "        " + sgd);
        }
    }

    public static void WhileLoop(Request request) {
        PrintHeader();
        int i = request.Start;
        int step = request.Step;
        while (i <= request.End) {
            double sgd = Convert(i);
            PrintRow(i, sgd);
            i += step;
        }
    }

    public static void DoWhileLoop(Request request) {
        PrintHeader();
        int i = request.Start;
        int step = request.Step;
        do {
            double sgd = Convert(i);
            PrintRow(i, sgd);
            i += step;
        } while (i <= request.End);
    }

    public static double rate = 1.82;

    public static double Convert(int usd) {
        return usd * rate;
    }

    public static void PrintHeader() {
        Println("US$        S$");
        Println("-------------");
    }

    public static void PrintRow(int usd, double sgd) {
        Println(usd + "        " + sgd);
    }

    public static void PrintError() {
        Println("Error input!!");
    }

    public static void Print(String message) {
        System.out.print(message);
    }

    public static void Println(String message) {
        System.out.println(message);
    }

    public static Request GetUserInput() {
        int start, end, step;
        Print("starting: ");
        start = userInput.nextInt();
        Print("ending: ");
        end = userInput.nextInt();
        Print("increment: ");
        step = userInput.nextInt();
        userInput.close();
        return new Request(start, end, step);
    }

    public static boolean Validate(Request request) {
        int diff = (request.End - request.Start);
        if (diff < 0) {
            return false;
        }
        if (diff % request.Step != 0) {
            return false;
        }
        return true;
    }

    public static class Request {
        public int Start;
        public int End;
        public int Step;

        public Request(int start, int end, int step) {
            Start = start;
            End = end;
            Step = step;
        }
    }


}
