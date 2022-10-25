package com.entertainment.client;

import com.entertainment.MyMath;

public class MyMathClient {

    public static void main(String[] args) {
        int min1 = MyMath.min(2, 5);
        System.out.println(min1);

        int min2 = MyMath.max(10, 50);
        System.out.println(min2);

        System.out.println(MyMath.isAgeInRange(62));
    }
}
