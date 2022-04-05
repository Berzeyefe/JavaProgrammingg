package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Practices {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int countPos=0, countNeg=0;
        for (int i = 0; i < 5; i++) {
            int num=new Scanner(System.in).nextInt();
            if(num>0){countPos++;}
            else if (num<0){countNeg++;}}
        System.out.println(countPos+" positive and "+countNeg+" negative");


        String str=new Scanner(System.in).nextLine();
        char ch=new Scanner(System.in).next().charAt(0);
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            char ch1=str.charAt(i);
            result+=(ch1==ch)?1:0;}
        System.out.println(result);


        int num1= new Scanner(System.in).nextInt();
        int num2= new Scanner(System.in).nextInt();
        int result1=0;
        for (int i = 0; i < num1; i++) {
            result1+=num2;}
        System.out.println(result);


        String sentence=new Scanner(System.in).nextLine();
        int result2=0;
        for (int i = 0; i <sentence.length() ; i++) {
            result+=(sentence.substring(i).startsWith("Java"))?1:0;}
        System.out.println(result);


        String sentence1=new Scanner(System.in).nextLine();
        sentence=sentence.toLowerCase().replace("cat","0").replace("dog","1");
        int numCat=0, numDog=0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch2 =sentence.charAt(i);
            if (ch=='0'){numCat++;}
            else if (ch=='1'){numDog++;}}
        System.out.println(numCat==numDog);}}





;




