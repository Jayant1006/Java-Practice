import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String arg[]) {
        // Creating a scanner object for the scanner class
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        int ans = val1 + val2;
        System.out.println("Addition of " + val1 + " and " + val2 + " = " + ans);

        String s = sc.next();
        System.out.println("Hello my name is " + s);
        sc.close();

    }
}