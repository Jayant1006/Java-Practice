import java.util.Scanner;

public class ArrayImplementation {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Normal For Loop
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int[] arr1 = { 1, 2, 3, 5, 6 };

        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println(sum);
        System.out.println(arr.length);
        sc.close();
    }
}
