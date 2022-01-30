import java.util.Scanner;

public class LabProgram {

    public static int largestAbsoluteValue(int[] userValues) {
        int n;

        int LargestNumber = userValues[0];

        for (n = 1; n < userValues.length; n++)
            if (userValues[n] > LargestNumber)
                LargestNumber = userValues[n];

        System.out.println(LargestNumber);

        return LargestNumber;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userLength;

        userLength = scnr.nextInt();

        int[] userValues = new int[userLength];

        int i;

        for (i=0; i<userLength; i++) {
            userValues[i] =scnr.nextInt();
        }

        //largestAbsoluteValue(userValues);


    }
}
