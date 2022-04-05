package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 40,
                weeklyHours = 45;
        double stateTaxRate = 0.07,
                federalTaxRate = 0.18;
        int grossPay = hourlyRate * weeklyHours * 52;
        double stateTax = grossPay * stateTaxRate,
                federalTax = grossPay * federalTaxRate,
                totalTax = stateTax + federalTax,
                netInCome = grossPay - totalTax;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("grossPay = $" + grossPay);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("netInCome = $" + netInCome);

    }
}
/*
1. Create a class called SalaryCalculator.java
          3.1 declare the following variables;
           hourlyRate ,weeklyHours, statetaxRate, federaltaxRate,

           3.2 use the given info above the variables to calculate the followings;

               1. salaryBeforeTax
               2. stateTaxRate
               3. federalTaxRate
               4. totalTax
               5. salaryAfterTax







 */