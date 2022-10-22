package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.UserInput;

public class P2Test {


    public static void main(String[] args) {
        String[] inputQueue = new String[]{
                "$500", "10",
                "$610", "5",
                "$610", "10",
                "$710", "15",
                "$710", "20",
                "$800", "30"
        };

        for (int i = 0; i < inputQueue.length; i += 2) {
            UserInput input = new UserInput(new String[]{inputQueue[i], inputQueue[i + 1]});
            P2 sut = new P2(input);
            sut.main(null);
        }
    }
}
