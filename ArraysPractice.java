package com.tts.MortgageCalculator;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String message = "Hello!";
        System.out.println(message);

        int[] arrayNumbers = new int[5];
        arrayNumbers[0] = 1;
        arrayNumbers[1] = 2;
        arrayNumbers[2] = 3;
        //Better way to have arrays. Use Arrays method and use it as "overloading.. Use Arrays.toString(arrayNumbers)
        System.out.println(Arrays.toString(arrayNumbers));
        //notice any integer we didn't intialized gets assigned the value of 0.

        //OTHER WAY to create an array
        int[] newArraysNumbers = {1, 5, 3, 2, 4};
        // This should us how many numbers at in the array -->> newArraysNumbers.length
        System.out.println("Number of numbers in the array: ");
        System.out.println(newArraysNumbers.length + "\n");

        //SORTING arrays --> Arrays.sort(arrayName)
        Arrays.sort(newArraysNumbers);
        System.out.println("Arrays sorted: ");
        System.out.println(Arrays.toString(newArraysNumbers)+ "\n");

        //Array with 2 columns and 3 rows. This is 2-D array
        int[][] arraysRowsColumns = new int[2][3];
        arraysRowsColumns[0][0] = 2;
        System.out.println("This is a 2-D Array:");
        System.out.println(Arrays.deepToString(arraysRowsColumns) + "\n");
        //use Arrays.deepToString(your Array name) to print out 2-d or 3-d arrays.

        //3-D array
        int[][][] arraysThreeD = new int [2][3][1];
        System.out.println("This is a 3-D Array: ");
        System.out.println(Arrays.deepToString(arraysThreeD) + "\n");
    }
}
