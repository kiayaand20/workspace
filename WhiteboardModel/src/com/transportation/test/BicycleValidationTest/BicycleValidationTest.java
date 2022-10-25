package com.transportation.test.BicycleValidationTest;

import com.transportation.Bicycle.Bicycle;

public class BicycleValidationTest {

    public static void main(String[] args) {
        Bicycle bikeTest1 = new Bicycle("Schwinn", "carbon", 25);

        System.out.println(bikeTest1);
        bikeTest1.setFrameSize(30);
        bikeTest1.setFrameSize(18);
        System.out.println(bikeTest1);

    }
}
