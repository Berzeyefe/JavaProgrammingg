package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {
        String firstName = "Jimmy";
        String lastName = "King";
        int age =55;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        String fullName = firstName + " " + lastName;  // you have to give space between the names and concatenations

        //Full name of the person is
        System.out.println("Full name of the person is " + fullName);

        //-----is---- years old
        System.out.println(fullName + " is " + age + " years old.");
        //FullName is jobTitle, works at companyName, and FullName's salary is Salary
        System.out.println(fullName + " is " + jobTitle+", works at " + companyName
                +", and "+fullName +"'s salary is $" + salary);
    }
}
/*


     // Create a class named FullName.java and declare the following variables:

                         1. firstName
                         2. lastName
                         3. use concatenation to print the full address;
 */
