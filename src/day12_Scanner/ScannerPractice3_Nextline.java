package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_Nextline {

    public static void main(String[] args) {

       // 123 Enter
        Scanner input = new Scanner(System.in);//

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();// Wooden SpoonEnter


        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine();// Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt();// 25 here, you can not press the enter and as you see,and you give anoher method
                                   // as input.nextInt() at this time enter hes left on the keyboard. in orderto capture the
                                 //if we are using nextLine() method after the other methods of scanner,we must provide one addition nextLine()
        input.nextInt(); // capture the enter key that user pressed for nextInt(); //"Enter" again, you need to have one more input.nextLine() method another line.

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("full name = " +fullName);
        System.out.println("programming = " +programming);
        System.out.println("age = " +age);

        input.close();


    }

}
