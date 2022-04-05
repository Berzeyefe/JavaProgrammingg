package day05_Concatenation;

public class FullName2 {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = " Senior SDET";
        String companyName = "Apple INC";
        double salary = 100000.58;

        String fullName = firstName +  " "  + lastName;

        // Full name of the person is--------
        System.out.println("Full name of the person is "  +  fullName );

        // -----is----years old

        System.out.println(fullName +  " is " + age +" years old"  );

        //FullName is JobTitle, works at CompanyName, and FullName's salary is Salary


        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and " + fullName +"'s salary is $"+salary );

    }
}
