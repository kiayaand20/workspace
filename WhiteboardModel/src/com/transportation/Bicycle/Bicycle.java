package com.transportation.Bicycle;

import com.transportation.BicycleGearType.BicycleGearType;
import com.transportation.test.BicycleValidationTest.IllegalFrameSize;

public class Bicycle {
    private String brand;
    private String frameMaterial = "aluminum";
    private int frameSize = 24;
    public static final int MIN_FRAME_SIZE = 17;
    public static final int MAX_FRAME_SIZE = 26;
    BicycleGearType bicycleGearType = BicycleGearType.SINGLE_SPEED;

    public Bicycle(String brand) {
        setBrand(brand);
    }

    public Bicycle(String brand, String frame, int frameSize) throws IllegalFrameSize {
        this(brand);
        setFrameMaterial(frame);
        setFrameSize(frameSize);
    }

    public Bicycle(String brand, String frame, int frameSize, BicycleGearType bicycleType) {
        this.brand = brand;
        this.frameMaterial = frame;
        this.frameSize = frameSize;
        this.bicycleGearType = bicycleType;
    }

    public void bikePurchase() {
        System.out.println(
                "Congrats on the purchase of a " + bicycleGearType + ", " + brand
                        + " bike with a(n) " + frameMaterial
                        + " frame and "
                        + frameSize + " in. frame size.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) throws IllegalFrameSize {
        if (frameSize < MIN_FRAME_SIZE || frameSize > MAX_FRAME_SIZE) {
            throw new IllegalFrameSize("Error. Invalid frame size. Must be between " + MIN_FRAME_SIZE + " and " + MAX_FRAME_SIZE + ".");
        }
        this.frameSize = frameSize;
    }

    public BicycleGearType getBicycleGearType() {
        return bicycleGearType;
    }

    public void setBicycleGearType(BicycleGearType bicycleGearType) {
        this.bicycleGearType = bicycleGearType;
    }

    @Override
    public String toString() {
        return "com.transportation.Bicycle.Bicycle Specifications- " +
                "com.transportation.Bicycle.Bicycle Type: " + getBicycleGearType() +
                ", Brand: " + getBrand() +
                ", Frame: " + getFrameMaterial() +
                ", Frame size: " + getFrameSize() +
                ", com.transportation.Bicycle.Bicycle Type: " + getBicycleGearType();
    }
}
