package com.company;

public class End {
    public static boolean gameOver(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("⚪") || field[i][j].equals("⚫")) return false;
            }
        }
        return true;
    }
}