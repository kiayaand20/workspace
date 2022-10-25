package com.transportation.client.BicycleClient;

import com.transportation.Bicycle.Bicycle;
import com.transportation.BicycleGearType.BicycleGearType;

public class BicycleClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            return;
        }
        System.out.println("You provided " + args.length + " arguments");
        Bicycle newBicycle = new Bicycle(args[0], args[1], Integer.parseInt(args[2]), BicycleGearType.valueOf(args[3]));
        System.out.println(newBicycle);
    }
}
