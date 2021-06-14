package com.tts.MortgageCalculator;

import java.text.NumberFormat;

public class Math {
    public static void main(String[] args) {

//        //Round number to a whole number
//        int round = Math.round(1.1F);
//        System.out.println("result = " + round);
//
//        int max = Math.max(1, 2);
//        System.out.println("max = " + max);
//
//        int min = Math.min(1,2);
//        System.out.println("min = " + min);
//
//        //How to generate different numbers between 0.0000 and 1.
//        double random = Math.random();
//        //To make it larger use *100
//        //Round it up using explicit casting and rounding
//                 // (int) Math.round(Math.random() * 100);
//        System.out.println("random = " + random);

        //How to format numbers in Java (10%, or $1,000
        //can't use this
            // NumberFormat currency = new NumberFormat();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyFormat = currency.format(122141412.321);
        System.out.println("currencyFormat = " + currencyFormat);

        //Formatting percentage
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentFormat = percent.format(0.10);
        System.out.println("percentFormat = " + percentFormat);
    }
}
