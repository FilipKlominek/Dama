package com.company;

public class Bounds {
    public static boolean isInBounds(int number) {
        if (number >= 0 && number < 8) return true;
        else return false;
    }
}