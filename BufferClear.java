import java.util.Scanner;

public class BufferClear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        // Buffer issue : if nextInt() method is used then the buffer is filled with a
        // value so to clean it there are 2 methods:
        // 1. by creating a new scanner object
        // 2. by clearing the buffer with the help of nextLine() method
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(val);
        System.out.println(str);
        sc.close();
    }
}
