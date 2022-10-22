package sce.sc2002.ayong.lab1;

import sce.sc2002.ayong.common.UserInput;

public class P4Test {
    public static void main(String[] args) {
        String[] inputs = new String[]{ "0", "3", "7"};

        for (int i = 0; i < inputs.length; i ++) {
            UserInput input = new UserInput(new String[]{inputs[i]});
            P4 sut = new P4(input);
            sut.main(null);
        }
    }
}
