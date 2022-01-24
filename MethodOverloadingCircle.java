import java.util.*;

public class MethodOverloadingCircle {

    public static int avg(int n1, int n2) {
        System.out.println("Version 1");
        return (n1 + n2) / 2;
    }

    public static double avg(double d1, double d2) {
        System.out.println("Version 2");
        return (d1 + d2) / 2;
    }

    public static int avg(int n1, int n2, int n3, int n4) {
        System.out.println("Verison 3");
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println(avg(1, 2));
        System.out.println(avg(1, 2, 3, 3));
        System.out.println(avg(2.3, 3.6));
        sc.close();

    }

}
