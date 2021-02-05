package com.company;

public class Move {
    public static String[][] movePiece(String[][] field, int x, int y, int dir, int player) {

        field[y][x] = "⬜";

        if (player == 1) {

            if (dir == 1) { //UpLeft
                if (field[y - 1][x - 1].equals("⬜")) {
                    field[y - 1][x - 1] = "⚫";
                    field[y][x] = "⬜";
                } else if (field[y - 1][x - 1].equals("⚪")) {
                    field[y - 1][x - 1] = "⬜";
                    field[y - 2][x - 2] = "⚫";
                }
            }
            else if (dir == 2) { //UpRight
                if (field[y - 1][x + 1].equals("⬜")) {
                    field[y - 1][x + 1] = "⚫";
                    field[y][x] = "⬜";
                } else if (field[y - 1][x + 1].equals("⚪")) {
                    field[y - 1][x + 1] = "⬜";
                    field[y - 2][x + 2] = "⚫";
                }
            }
            else if (dir == 3) { //DownLeft
                if (field[y + 1][x - 1].equals("⬜")) {
                    field[y + 1][x - 1] = "⚫";
                    field[y][x] = "⬜";
                } else if (field[y + 1][x - 1].equals("⚪")) {
                    field[y + 1][x - 1] = "⬜";
                    field[y + 2][x - 2] = "⚫";
                }
            }
            else if (dir == 4) { //DownRight
                if (field[y + 1][x + 1].equals("⬜")) {
                    field[y + 1][x + 1] = "⚫";
                    field[y][x] = "⬜";
                } else if (field[y + 1][x + 1].equals("⚪")) {
                    field[y + 1][x + 1] = "⬜";
                    field[y + 2][x + 2] = "⚫";
                }
            }
            else {
                System.out.println("There are 4 directions, I thought I patched this");
                System.exit(0);
            }
        }
        if (player == 2) {
            if (dir == 1) { //UpLeft
                if (field[y - 1][x - 1].equals("⬜")) {
                    field[y - 1][x - 1] = "⚪";
                    field[y][x] = "⬜";
                } else if (field[y - 1][x - 1].equals("⚫")) {
                    field[y - 1][x - 1] = "⬜";
                    field[y - 2][x - 2] = "⚪";
                }
            }
            else if (dir == 2) { //UpRight
                if (field[y - 1][x + 1].equals("⬜")) {
                    field[y - 1][x + 1] = "⚪";
                    field[y][x] = "⬜";
                } else if (field[y - 1][x + 1].equals("⚫")) {
                    field[y - 1][x + 1] = "⬜";
                    field[y - 2][x + 2] = "⚪";
                }
            }
            else if (dir == 3) { //DownLeft
                if (field[y + 1][x - 1].equals("⬜")) {
                    field[y + 1][x - 1] = "⚪";
                    field[y][x] = "⬜";
                } else if (field[y + 1][x - 1].equals("⚫")) {
                    field[y + 1][x - 1] = "⬜";
                    field[y + 2][x - 2] = "⚪";
                }
            }
            else if (dir == 4) { //DownRight
                if (field[y + 1][x + 1].equals("⬜")) {
                    field[y + 1][x + 1] = "⚪";
                    field[y][x] = "⬜";
                } else if (field[y + 1][x + 1].equals("⚫")) {
                    field[y + 1][x + 1] = "⬜";
                    field[y + 2][x + 2] = "⚪";
                }
            }
            else {
                System.out.println("There are 4 directions, I thought I patched this");
                System.exit(0);
            }
        }
        return field;
    }
}