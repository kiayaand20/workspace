package com.transportation.client.BicycleClient;

import com.transportation.Bicycle.Bicycle;
import com.transportation.BicycleGearType.BicycleGearType;

public class BicycleClient {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle("Cannondale");
        Bicycle bike2 = new Bicycle("Trek", "metal", 22);
        Bicycle bike3 = new Bicycle("Specialized", "carbon", 18, BicycleGearType.MULTI_SPEED);

        bike1.setFrameMaterial("metal");
        bike1.setFrameSize(26);
        bike1.setBicycleGearType(BicycleGearType.FIXED_GEAR);

        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(bike3);

        bike2.bikePurchase();
    }
}
