package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.UserInput;

public class P1Test {
    public static void main(String[] args) {
        String[] inputQueue = new String[]{"a", "A", "c", "C", "d", "D", "b", "B"};

        for (String in : inputQueue) {
            UserInput input = new UserInput(new String[]{in});
            P1 sut = new P1(input);
            sut.main(null);
        }
    }
}
