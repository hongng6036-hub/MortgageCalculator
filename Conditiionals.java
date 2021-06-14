package com.tts.MortgageCalculator;

public class Conditiionals {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;

        if (temperature > 30) {
            System.out.println("Temp is:" + isWarm);
            System.out.println("It's not cold!");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("It's cold!!");
        }

    }
}
