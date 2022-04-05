package day19_LoopPractices;

import java.util.Scanner;

public class Task06_TheHighestFrequency {

    public static void main(String[] args) {

        String str = "aaabbbbbccd";

        int highestFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count > highestFrequency){
                highestFrequency = count;
            }

        }


        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count == highestFrequency && !result.contains(ch+"")){
                result += ch;
            }

        }


        System.out.println( result);



        System.out.println( "..............................");


        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        char ch = str.charAt(0);
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch1 == each){
                    count++;
                }
            }if(count > count1){
                count1 = count;
                ch = str.charAt(i);
            }

        }
        System.out.println(ch + " has the highest frequency, and its frequency is " + count1);

    }

}
/*
6.  Write a program that can find the character that has the highest frequency from a string

*/