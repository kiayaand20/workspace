package com.entertainment;

public class MyMath {
    public static final int MINIMUM_AGE = 5;
    public static final int MAXIMUM_AGE = 100;

    public MyMath(){
    }

    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static boolean isAgeInRange(int age) {
        return age >= MINIMUM_AGE && age <= MAXIMUM_AGE;
    }
}
