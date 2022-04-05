package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

   String firstName = "cyDEo";
   String lastName =  "SCHOOL";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
          //                                +    ydeo       ====>       "Cydeo"

        System.out.println(firstName);


        System.out.println("......................................");

        String firstName2 = "JOSH",
                lastName2 = "smITH";


         firstName2= firstName2.substring(0, 1).toUpperCase() + firstName2.substring(1).toLowerCase();
        //C                        +       ydeo  ==>   "Cydeo"

        firstName2 =   (""+ firstName2.charAt(0) ) .toUpperCase()  + firstName2.substring(1).toLowerCase();
        //      "C"                                       +      "ydeo" ==> Cydeo

        lastName2 = lastName2.substring(0,1).toUpperCase() +  lastName2.substring(1).toLowerCase();

        System.out.println(firstName2);
        System.out.println(lastName2);

        String fullName2 = firstName2+" "+lastName2;

        System.out.println("fullName = " + fullName2);



    }

}

/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */