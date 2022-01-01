import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int[] start = { 1, 2, 3, 4 };
        int[] des = new int[start.length];
        int[] final_arr = new int[5];

        System.arraycopy(start, 0, des, 0, start.length);
        System.out.println(Arrays.toString(des));

        System.arraycopy(start, 2, final_arr, 1, 2);
        System.out.println(Arrays.toString(final_arr));
        sc.close();

    }
}
