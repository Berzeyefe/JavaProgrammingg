package week05;

public class ReplacePractice {

    public static void main(String[] args) {


        String word = "Github";
        System.out.println(word);

        System.out.println("word = " + word);

        String searchResult = " 1-48 of over 6000 results for java";
        String actualResult = searchResult.replace("1-48 of over ", "")
                .replace(" results for java", "");


        String expectedResult = "6000";

        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");


        }

    }
}