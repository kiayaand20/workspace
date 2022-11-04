package com.transportation.test.BicycleValidationTest;

import com.transportation.Bicycle.Bicycle;

public class BicycleValidationTest {

    public static void main(String[] args) {
        Bicycle bikeTest1 = null;
        try {
            bikeTest1 = new Bicycle("Schwinn", "carbon", 30);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        bikeTest1.setFrameSize(25);
//        System.out.println(bikeTest1);

    }
}
