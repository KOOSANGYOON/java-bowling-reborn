package com.bowling.reborn.service;

import com.bowling.reborn.domain.User;

public class PrintScoreBoard {
    public static void printScoreBoardTitle() {
        System.out.print("|" + "\t" + "NAME" + "\t" + "|");
        for(int i = 0; i < 10; i++) {
            System.out.print("\t" + (i+1) + " frame" + "\t" + "|");
        }
        System.out.println("");
    }

    public static void printPlayersScore(User player) {

    }
}
