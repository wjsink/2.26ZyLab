import java.util.Scanner;

public class LongestString {

    public String findLongest(String str1, String str2) {
        /* Type your code here. */
        String answer = "test";

        if (str1.length() > str2.length()) {
            answer = str1;
        }
        if (str2.length() > str1.length()) {
            answer = str2;
        }
        if (str2.length() == str1.length()) {
            answer = str2;
        }

        return answer;
    }


    public static void main(String[] args) {
        LongestString mainObject = new LongestString();
        Scanner scnr = new Scanner(System.in);

        String str1;
        String str2;
        String longest;

        str1 = scnr.next();
        str2 = scnr.next();

        longest = mainObject.findLongest(str1, str2);

        System.out.println(longest);
        System.out.println(str1.length());
    }
}
