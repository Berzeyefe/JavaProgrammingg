package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Ey Edip Adanada pide yE";

        String reversed = "";

        for (int i = word.length()-1;  i >=0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);

        System.out.println("..............................");

        String num = "22 02 2022";

        String reversed1 = "";
        for (int i = word.length()-1;  i >=0 ; i--) {
            reversed1 += word.charAt(i);

            boolean isPalindrome1 = word.equalsIgnoreCase(reversed1);
            System.out.println("isPalindrome1 = " + isPalindrome1);
        }

    }

}

/*
 "Java" ==> "avaJ" ===> false (not palindrome)
 "Anna" ==> "annA" ===>true
 "Level"
 "Racecar
 Dad
 Mom
 ....
 */



