package week06;

import java.util.Scanner;

public class UpperBound {

    /**
     *
     * Question-8:
     Write a program to calculate the sum of the numbers from 1 till upper bound.
     If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
     If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
     If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
     Spicy Level of this question is 8 out of 10
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter upper bound for sum");
        int number= in.nextInt();

        int sum=0;

        for (int i = 0; i <= number; i++) {
            sum+=i;

        }
        System.out.println("sum = " + sum);




    }
}
    /*
    Write a program to calculate the sum of the numbers from 1 till upper bound.

        If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
        If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
        If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.


     */
       /*1    + 2  +  3    +   4  + ... + 98   +  99   +  100
        100  + 99  +  98  +  97  + ... +  3   +   2   +   1
        =============================

        (100+1) + (99 + 2) + (98 + 3) + ... +(2 + 99) + (1 + 100) = 100 *101

        100*101/2 = 1+ 2 +3 + ... + 98 + 99 +100
        */


