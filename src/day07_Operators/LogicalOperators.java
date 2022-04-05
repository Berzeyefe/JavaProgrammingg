package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

     // Logical AND>>> stands for: Both or ALL

        boolean result1 = 10 > 5 && 10 > 7;
           //             true  &&  true

        System.out.println(result1);

        boolean result2 = 20 > 15 && 20 > 25;
          //              true    &&  false

        System.out.println(result2);

        boolean result3 = 30 > 50 && 30 > 10; //if the first part is false it is no need to check the second part because the result is automatically get false
        //                false               // this is the rule

        System.out.println(result3);

        System.out.println("............................");


        //Logical OR Operator >>>>Either

        boolean result4 = 100 == 200 || 100 != 300;
        //                   false   ||    true

        System.out.println(result4);

        boolean result5 = 1000 > 900 || 1000 < 2000;
        //                    true ||

        System.out.println(result5);

        boolean result6 = 7 < 0 || 7 > 15;
        //                false ||  false

        System.out.println(result6);

        System.out.println("............................... ");

       //Logical NOT Operator;

        boolean result7 = !true;// false
        boolean result8 = !false;// true
        boolean result9 = !(100 == 200);// num100==200 is a ''false'' expression but if we put in a paranthesis
                      //  !false>>>>true
          // and put the log.not operator ! in front of the paranthesis it returns to ''true''expression

        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);






    }


}
