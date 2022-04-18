package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary());// Null Pointer Exception
        }catch(NullPointerException e){
            System.out.println("First catch block");
            e.getStackTrace();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.getStackTrace();

        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.getStackTrace();

        }catch (ClassCastException e){
            System.out.println("Fourth catch block");
            e.getStackTrace();

        }catch (RuntimeException e){
            System.out.println("Fifth block exception");
            e.getStackTrace();
        }
        System.out.println("Tested completed");

        System.out.println("..............................");

        try {
            System.out.println("Java".charAt(-1));

        }catch (RuntimeException e){
            e.getStackTrace();

        }


    }
}
