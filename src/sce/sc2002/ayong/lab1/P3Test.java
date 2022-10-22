package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.UserInput;

public class P3Test {
    public static void main(String[] args) {
        String[] inputQueue = new String[]{
                "1", "5", "1",
                "0", "40", "5",
                "40", "0", "5",
        };

        for (int i = 0; i < inputQueue.length; i += 3) {
            UserInput input = new UserInput(new String[]{inputQueue[i], inputQueue[i + 1], inputQueue[i + 2]});
            P3 sut = new P3(input);
            sut.main(null);
        }
    }
}
