package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; //explicit casting
        short num2 = (short) averageScore; //explicit casting
        int num3 = (int) averageScore; //explicit casting
        float num4 = averageScore; // no casting/ ther isn't any casting, neither of them is possible for float
        double num5 = (double) averageScore; // implicit casting/ smaller type to larger type implicit casting is done auto
        long num6 = (long) averageScore; //explicit casting // you can also write 'double' in paranthesis but no need to.

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
}



/*
  1.create a class named Castings
  1.1 declarae a variable of float named averageScore and initiliaze it to 20.5
  1.2 declare the following variables and assgn to averageScore to each of them

                    byte num1 ;
                    short num2,
                    int num3;
                    long num4;
                    float num5;
                    double num6;


    NOTES:  implicit casting : casting the smaller type to larger type
            explicit casting : casting the larger type to smaller type
  explicit casting is the only way to assign to a larger type primitive to a smaller type through the explicit casting
  even for the nonprimitives the concept is the same
     FOR FLOAT (NUM4) AND DOUBLE (NUM5) OUTPUTS ARE DECİMAL NUMBERS.>>>>20.5


 */