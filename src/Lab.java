import java.util.Scanner;

public class Lab {

    public static double productOfFour(int a, int b, int c, int d) {
        double product =1.0;

        product *= a;

        product *= b;

        product *= c;

        product *= d;

        String str = String.format("%.03f", product);
        System.out.println(str);

        return product;
    }

    public static double averageOfFour(int a, int b, int c, int d) {
        double product =0;

        product += a;

        product += b;

        product += c;

        product += d;

        product = product / 4;

        String str = String.format("%.03f", product);
        System.out.println(str);

        return product;
    }




    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();
        int d = scnr.nextInt();

        productOfFour(a,b,c,d);
        averageOfFour(a,b,c,d);

    }
}
