package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int num1 = 100, // for the same succesively int nums for the first,second..till the end, use only coma, and after only use semi colon in the end
                num2 = 200;

        boolean n1IsMin = num1 < num2;
        boolean n2IsMin = num2 < num1;
        boolean equal = num1 == num2;

        /*....*/

        if (n1IsMin) {// if num1 is the minimum number

            System.out.println(num1 + " is the minimum number ");
        }

        if (n2IsMin) { // if num2 is the minimmum number

            System.out.println(num2 + " is the minimum number ");
        }


        if (equal) {// if num1 is equal to num2

            System.out.println(" Equal ");
        }

        System.out.println("................................... ");
    }
}





