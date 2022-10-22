package sce.sc2002.ayong.lab3;

import sce.sc2002.ayong.common.UserInput;

public class PlaneAppTest {
    public static void main(String[] args) {
        String[] inputQueue = new String[]
                {
                        "5", "10", "10001",
                        "5", "12", "10002",
                        "5", "8", "10003",

                        "3",

                        "4",

                        "1",

                        "2",

                        "5", "8", "10004",

                        "6", "10",

                        "5", "12", "10005",

                        "6", "12",

                        "3",

                        "1",

                        "2",

                        "7"
                };

        UserInput input = new UserInput(inputQueue);

        PlaneApp sut = new PlaneApp(input);

        sut.main(null);

    }
}
