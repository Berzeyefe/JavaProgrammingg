package day15_ForLoop;

public class ReplaceX {

    public static void main(String[] args) {


        String str = "xcodeX";
        String result = str.replace("x", "a").replace("X", "a");// The rule is in order to use multiple string method is back to back
        // "acodex"     // this is formatting                          // "acodea"                                   // You neeed to make sure that the method that you're using is returning to a string.

        System.out.println(result);

    }

    }

    /*
      2.Write a program that asks user to enter a word. and replace all the x or X with character a
        Input:
        xcodeX
        Output:
        acodea
        */

