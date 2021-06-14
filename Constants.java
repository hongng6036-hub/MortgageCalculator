package com.tts.MortgageCalculator;

public class Constants {
    public static void main(String[] args) {
        int divisionResult = 10/3;
        System.out.println(divisionResult);

        //To get decimals then you need to use double
        double divisionResultDecimals = (double)10 / (double)3;
        System.out.println(divisionResultDecimals);

        int x = 1;
        int y = 1;
        x++; //x++ is adding by 1. ++x will be the same?
        ++y;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        int xtwo = (10+3) * 2; //We have to put parathenses to give priority to the addition operation fist.
            //Priority order of Operators > (), *, /, +, -
        System.out.println("xtwo = " + xtwo);
        
        //Example of implicit casting (change data type). Can only do this by using agreeable types.
        double v = 1.1;
        int z = (int)v +2;
        System.out.println("v = " + v);
        System.out.println("z = " + z);
        
        //Converting a string to a numeric data type (int, byte, short, long, etc)
        String a = "1";
        int b = Integer.parseInt(a) + 2;
            //Use "Integer.praseInt(Your Variable)
            //If your string is a decimal (1.1) then use Double.parse.Double(Your Variable)
        System.out.println("b = " + b);
    }
}
