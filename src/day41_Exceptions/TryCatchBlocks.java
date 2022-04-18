package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");

        try {

            System.out.println(9 / 0); // here is the program gets terminated, so in order to handle this exception occurrance, you have to use/make try&catch blocks.
                                       // Once you handle it, exception will be gone.
            System.out.println("Try Block");


        } catch (ArithmeticException e) { // it is also very important for you to use the right class here. because if you don't use
                                          //the right clas here, you can not handle the exception properly.
            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }



            System.out.println("Test completed");

        System.out.println("..............................");

        System.out.println("Test2 started");

        int [] numbers = {1,2,3,4,5};

        try{
            System.out.println(numbers[200]);

            System.out.println("Try block");

        }catch (RuntimeException e ){

            System.out.println("Catch block");

            System.out.println("Runtime Exception was occurred");

            System.out.println("Test2 completed");
        }

    }
}