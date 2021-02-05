package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] field = {
                {"⬛", "⚪", "⬛", "⚪", "⬛", "⚪", "⬛", "⚪",},
                {"⚪", "⬛", "⚪", "⬛", "⚪", "⬛", "⚪", "⬛",},
                {"⬛", "⬜", "⬛", "⬜", "⬛", "⬜", "⬛", "⬜",},
                {"⬜", "⬛", "⬜", "⬛", "⬜", "⬛", "⬜", "⬛",},
                {"⬛", "⬜", "⬛", "⬜", "⬛", "⬜", "⬛", "⬜",},
                {"⬜", "⬛", "⬜", "⬛", "⬜", "⬛", "⬜", "⬛",},
                {"⬛", "⚫", "⬛", "⚫", "⬛", "⚫", "⬛", "⚫",},
                {"⚫", "⬛", "⚫", "⬛", "⚫", "⬛", "⚫", "⬛",},
        };
        int back;
        while (true) { //i wrote most of this code thinking pieces can move in all 4 directions...
            System.out.println("Can pieces move backwards? 1 == true, 2 == false");
            back = sc.nextInt();
            if (back == 1 || back == 2) {
                break;
            }
        }

        int x;
        int y;

        int dir;

        int player = 1; //1 == white, 2 == black

        System.out.println();
        System.out.println("Please use a dark theme for colors to make sense");

        while (!End.gameOver(field)) {
            GUI.printArrArr(field);
            if (player == 1) System.out.println("White's turn");
            else System.out.println("Black's turn");

            System.out.println("Enter X coordinate of selected piece:");
            x = sc.nextInt();
            if (!Bounds.isInBounds(x)) {
                System.out.println("That x position is out of bounds");
                continue;
            }

            System.out.println("Enter Y coordinate of selected piece:");
            y = sc.nextInt();
            if (!Bounds.isInBounds(y)) {
                System.out.println("That y position is out of bounds");
                continue;
            }

            if (YourPiece.isYours(field, x, y, player)) {
                field[y][x] = "🔘";
                GUI.printArrArr(field);
                while (true) {
                    System.out.println("1 == UpLeft, 2 == UpRight, 3 == DownLeft, 4 == DownRight");
                    dir = sc.nextInt();
                    if (player == 1) { //white
                        if (dir > 4 || dir < 1) {
                            System.out.println("Not a valid direction");
                        } else if (dir == 1 && (x == 0 || y == 0)) {
                            System.out.println("Out of bounds");
                        } else if (dir == 2 && (x == 7 || y == 0)) {
                            System.out.println("Out of bounds");
                        } else if (dir == 3 && (x == 0 || y == 7)) {
                            System.out.println("Out of bounds");
                        } else if (dir == 4 && (x == 7 || y == 7)) {
                            System.out.println("Out of bounds");

                        } else if (dir == 1 && field[y - 1][x - 1].equals("⚫")) {
                            System.out.println("Can't jump over your own piece");
                        } else if (dir == 2 && field[y - 1][x + 1].equals("⚫")) {
                            System.out.println("Can't jump over your own piece");
                        } else if (dir == 3 && field[y + 1][x - 1].equals("⚫")) {
                            System.out.println("Can't jump over your own piece");
                        } else if (dir == 4 && field[y + 1][x + 1].equals("⚫")) {
                            System.out.println("Can't jump over your own piece");

                        } else if (dir == 1 && field[y - 1][x - 1].equals("⚪") && !field[y - 2][y - 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");
                        } else if (dir == 2 && field[y - 1][x + 1].equals("⚪") && !field[y - 2][y + 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");
                        } else if (dir == 3 && field[y + 1][x - 1].equals("⚪") && !field[y + 2][y - 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");
                        } else if (dir == 4 && field[y + 1][x + 1].equals("⚪") && !field[y + 2][y + 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");

                        } else if (back == 2 && (dir == 3 || dir == 4)) {
                            System.out.println("Can't move backwards");

                        } else break;
                    } else { //black
                        if (dir > 4 || dir < 1) {
                            System.out.println("Not a valid direction");
                        } else if (dir == 1 && (x == 0 || y == 0)) {
                            System.out.println("Out of bounds");
                        } else if (dir == 2 && (x == 7 || y == 0)) {
                            System.out.println("Out of bounds");
                        } else if (dir == 3 && (x == 0 || y == 7)) {
                            System.out.println("Out of bounds");
                        } else if (dir == 4 && (x == 7 || y == 7)) {
                            System.out.println("Out of bounds");

                        } else if (dir == 1 && field[y - 1][x - 1].equals("⚪")) {
                            System.out.println("Can't jump over your own piece");
                        } else if (dir == 2 && field[y - 1][x + 1].equals("⚪")) {
                            System.out.println("Can't jump over your own piece");
                        } else if (dir == 3 && field[y + 1][x - 1].equals("⚪")) {
                            System.out.println("Can't jump over your own piece");
                        } else if (dir == 4 && field[y + 1][x + 1].equals("⚪")) {
                            System.out.println("Can't jump over your own piece");

                        } else if (dir == 1 && field[y - 1][x - 1].equals("⚫") && !field[y - 2][y - 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");
                        } else if (dir == 2 && field[y - 1][x + 1].equals("⚫") && !field[y - 2][y + 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");
                        } else if (dir == 3 && field[y + 1][x - 1].equals("⚫") && !field[y + 2][y - 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");
                        } else if (dir == 4 && field[y + 1][x + 1].equals("⚫") && !field[y + 2][y + 2].equals("⬜")) {
                            System.out.println("Can't land on a piece");

                        } else if (back == 2 && (dir == 1 || dir == 2)) {
                            System.out.println("Can't move backwards");

                        } else break;
                    }
                }
                Move.movePiece(field, x, y, dir, player);
                GUI.printArrArr(field);
            } else continue;

            if (player == 1) player = 2;
            else player = 1;
            System.out.println();
        }
        if (player == 1) System.out.println("White won!");
        else System.out.println("Black won!");
    }
}