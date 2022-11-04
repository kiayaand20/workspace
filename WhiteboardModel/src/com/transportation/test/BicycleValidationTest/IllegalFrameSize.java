package com.transportation.test.BicycleValidationTest;

public class IllegalFrameSize extends Exception{
    public IllegalFrameSize() {
    }

    public IllegalFrameSize(String message) {
        super(message);
    }

    public IllegalFrameSize(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalFrameSize(Throwable cause) {
        super(cause);
    }
}
