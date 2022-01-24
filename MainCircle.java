import java.util.*;

public class MainCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        String col = sc.nextLine();
        Circle c1 = new Circle();
        Circle c2 = new Circle(val);
        Circle c3 = new Circle(val, col);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        System.out.println(c3.getColor());

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        MethodOverloadingCircle obj1 = new MethodOverloadingCircle();
        MethodOverloadingCircle obj2 = new MethodOverloadingCircle();
        MethodOverloadingCircle obj3 = new MethodOverloadingCircle();

        System.out.println(obj1.avg(n1, n2));
        System.out.println(obj2.avg(n1, n2, n3, n4));
        System.out.println(obj3.avg(d1, d2));

        sc.close();
    }
}
