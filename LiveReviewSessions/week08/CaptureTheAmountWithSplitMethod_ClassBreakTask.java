package week08;

public class CaptureTheAmountWithSplitMethod_ClassBreakTask {

    public static void main(String[] args) {

        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n" +
                "Card Number: 8548595959595\n" +
                "Name: oscar\n" +
                "Date: 11/10/2021";

        String[] arr = confirmation.split("\n");

        confirmation = arr[1];

        System.out.println("confirmation = " + confirmation);

        System.out.println(".................................");

        String str[] = confirmation.split("\n");
        for (String s : str) {
            if (s.startsWith("Amount")) {
                String a[] = s.split(" ");
                System.out.println(a[1]);
            }


        }

    }
}

/*
    // Break time task : capture the amount 790 with split method
    String confirmation = "Id: 2239677\n" +
            "Amount: 790 USD\n"+
            "Card Number: 8548595959595\n"+
            "Name: oscar\n"+
            "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);


 */