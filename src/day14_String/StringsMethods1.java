package day14_String;

public class StringsMethods1 {

    public static void main(String[] args) {

        String stir1 = "     batch 25    ";
         stir1 = stir1.trim();// "batch 25" 

        System.out.println( stir1);

        String stir2 = "Cydeo School";
        int number1 = stir2.indexOf("h");//8
        System.out.println("number1 = " + number1);

        int number2 = stir2.indexOf("ool");//9
        System.out.println("number2 = " + number2);

        String stir3 = "Java Programming language";

        int number3 = stir3.indexOf("an");//
        System.out.println("number3 = " + number3);

        int number4 = stir3.indexOf("gua");//
        System.out.println("number4 = " + number4);

        int number5 = stir3.lastIndexOf("g" );

        System.out.println("number5 = " + number5);

        System.out.println(".................................");

        String s = "Java Nova Cava Wawa orange";
             // 012345
        int firstA = s.indexOf("a");
        int lastA =  s.lastIndexOf("an");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
       // int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        int fifthA =  s.lastIndexOf("a W");
        int sixthA =  s.lastIndexOf("aw");
        //int seventhA = s.indexOf("ao");
        int seventhA = s.lastIndexOf("a ");



        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);



    }


}
// for those white spaces, they are not seperating any characters,neither in the left side
// nor in the right side of the given value. If you want to remove them, then you can use the trim methods