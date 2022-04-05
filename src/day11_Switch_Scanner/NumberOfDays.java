package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int year = 2000; // this number must be a valid number.if this condition is true then I have created these three outputs
         int number = 2;

         String result = "";

        if (number >= 1 && number <= 12){ //>>>> this is a pre-condition so, it's "Nested if"
                                         // and this switch statement has placed under this pre-condition statement.
                                        // Under this pre condition, if none of those cases are matching that means number is 1, if not, it is
                                        //the number is either 1,or 3 or 5 or 7 or 8 or 10 or 12.it means 31 days.So, what can I do in that case?
          switch (number){               // I should use the default one. Default one is placed in the last block.
                                          // if the pre condition is failed the outcome will be the "Invalid number"on the console.
              case 2:
                  result = (year % 4 == 0)?  "29 days" : "28 days"; // this is a Leap year and divisible by four and the remainder is zero.every four year
                  break ; // this is Ternary

                  case 4: case 6: case 9: case 11:  //===> for the months you'll get 30 days.otherwise you'll get 31 days that is default case block.
                  result = "30 days";
                  break ;

                 default : //the numbers are: 1,3,5,7,8,10,12 if the numbers are those then we'll print 31 days.
                  result =  "31 days";
          }
               }else {

                      result = "Invalid Number";

                  System.out.println(result);

        }
    }

}
/*
4.NumberOfDays

             28 days: 2
             30 days: 4,6,9,11
             31 days: 1,3,5,7,8,10,12

             if(1~12){

}else{
				Invalid
			}


 */