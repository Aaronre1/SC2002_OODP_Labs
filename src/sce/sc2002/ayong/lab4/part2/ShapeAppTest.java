package sce.sc2002.ayong.lab4.part2;

import sce.sc2002.ayong.common.UserInput;

public class ShapeAppTest {
    public static void main(String[] args) {
        String[] inputQueue = new String[]{
                "9",
                "1", "10", "1", "2",
                "2", "10", "20", "1", "2",
                "3", "10", "1", "2",
                "4", "10", "20", "1", "2",
                "5", "10", "1", "2", "3",
                "6", "10", "20", "1", "2", "3",
                "7", "10", "20", "30", "1", "2", "3",
                "8", "10", "20", "1", "2", "3",
                "9", "10", "20", "1", "2", "3",
        };

        UserInput input = new UserInput(inputQueue);

        ShapeApp sut = new ShapeApp(input);
        sut.main(null);
    }
}
