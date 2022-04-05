package day10_NestedIf;

public class VendingNestedIf {

    public static void main(String[] args) {


        String selection = "Drink";
        String drinkItem = "Coffee";
        String snackItem = "Chips";

        if (selection == "Drink") {
            System.out.println("Drink option is selected");
            if (drinkItem == "Tea") {
                System.out.println("Tea item is selected");

            } else if (drinkItem == "Coffee") {
                System.out.println("Coffee item is selected");

            }
        } else if (selection == "Snack") {
            System.out.println("Snack item is selected");

        } else if (snackItem == "Chips") {
            System.out.println("Chips item is selected");

        } else if (selection == "Candy") {
            System.out.println("Candy item is selected");

        } else {

            System.out.println("INVALID ENTRY");


            if(false)
                System.out.println("Hello");
            System.out.println("Running");
        }

        }
    }

