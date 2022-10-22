package sce.sc2002.ayong.lab2;

import sce.sc2002.ayong.common.UserInput;

public class Lab2p1Test {
    public static void main(String[] args) {

        String[] inputQueue = new String[]
                {
                        "1","8","8","8","8","8",

                        "2","4","7",
                        "2","7","7",
                        "2","25","7",

                        "3","4","7",
                        "3","7","7",
                        "3","25","7",

                        "4","-12",
                        "4","123",
                        "4","121456",

                        "5","12345","3",
                        "5","123","4",
                        "5","12145","1",

                        "6","12345",
                        "6","54123",
                        "6","246",
                        "6","-12",

                        "7"
                };

        UserInput input = new UserInput(inputQueue);

        Lab2p1 sut = new Lab2p1(input);

        sut.main(null);
    }
}
