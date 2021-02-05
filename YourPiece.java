package com.company;

public class YourPiece {
    public static boolean isYours(String[][] field, int x, int y, int player) {
        if (player == 1) {
            if (field[y][x].equals("⚪")) {
                System.out.println("This is the opponent's piece");
                return false;
            } else if (field[y][x].equals("⬛") || field[y][x].equals("⬜")) {
                System.out.println("This is not a piece");
                return false;
            } else return true;
        } else if (player == 2) {
            if (field[y][x].equals("⚫")) {
                System.out.println("This is the opponent's piece");
                return false;
            } else if (field[y][x].equals("⬛") || field[y][x].equals("⬜")) {
                System.out.println("This is not a piece");
                return false;
            } else return true;
        } else System.out.println("How did you get here?");
        System.exit(0);
        return false;
    }
}