package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

            int a = 20,
                b = 50,
                c = 10;
        // if we have 3 different numbers, one must be maximum, one must be minumum,and one must be MEDIAN,

         //                  a=15, b=10, c=20     a=15, c=10, b=20
        boolean aIsMedian =  (a > b && a < c) || (a > c && a < b);

        /*
        in order for a to be the median number;
               1.if c is the max number & b is the min number, then a is the median number
               2.if b is the max number & c is the min number, then a is the median number again.

         */


        //                    b=15, a=10, c=20    b=15, a=20, c=10
        boolean bIsMedian =  (b > a && b < c) || (b > c && b < a);

        /*
        in order of b to be the median number;
        1.if c is the max number & a is the min number, then b is the median number
        2.if a is the max number & c is the min number, then b is the median number again

         */

        boolean cIsMedian =  !aIsMedian && !bIsMedian;

        if (aIsMedian){ // if a is the median number

            System.out.println(a+" is the median number ");
        }
        if (bIsMedian){  // if b is the median number

            System.out.println(b+" is the median number ");
        }

        if (cIsMedian) { // if c is the median number

            System.out.println(c + " is the median number ");
        }

        }

    }


/*
         1.Create a class called MedianNumber and write a program that can find the median number
         between 3 DIFFERENT given INTEGERS.
         a = 10
         b = 15
         c = 20
         Output = 15 is the median number

         */