package com.entertainment.client;

import com.entertainment.FlowControl;

public class FlowControlClient {
    public static void main(String[] args) {
        System.out.println("Is 13 an even number (T/F): " +
                FlowControl.isItEvenNumber(13)); //false
        System.out.println("Is 4 an even number (T/F): " +
                FlowControl.isItEvenNumber(4)); //true

        System.out.println(FlowControl.hexCharToDecimal('A'));
        System.out.println(FlowControl.hexCharToDecimal('F'));
        System.out.println(FlowControl.hexCharToDecimal('G'));
    }
}
