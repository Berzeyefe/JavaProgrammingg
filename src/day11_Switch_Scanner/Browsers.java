package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "chrome";
        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
                browserName == "safari" || browserName == "edge";

        if (validBrowser) {

            if (browserName == "Chrome") {
                result = "Chrome browser is Selected";
            } else if (browserName == "firefox") {
                result = "Firefox browser is Selected";
            } else if (browserName == "opera") {
                result = "Opera browser is Selected";
            } else if (browserName == "safari") {
                result = "Safari browser is Selected";
            } else {
                result = "Edge browser is Selected";

            }

        } else {
              result = "Invalid Browser Name";

        }
        System.out.println(result);
    }
}

  /*
   Create a class named "Browser" .Write a program that can display the name of selected Browser.
   1.Declare a String variable named BrowserName,
   2.Assumed that the valid browsers are: Chrome, firefox, opera, safari,edge
   3.If the browserName does not match with the valid browsers' names,
   output should be: "Invalid Browser Name"


   Ex:  String browser = "Chrome";

        Output:

              Chrome Browser is selected

              Note: MUST use NESTED IF






   */