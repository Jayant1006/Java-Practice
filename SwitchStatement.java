import java.util.Scanner;

public class SwitchStatement {
    public static void main(String arg[]) {
        // Demonstation of Switch Statements
        Scanner sc = new Scanner(System.in);
        int size_check = sc.nextInt();
        String size;

        switch (size_check) {
            case 28:
                size = "Small";
                break;

            case 34:
                size = "Medium";
                break;

            case 40:
                size = "Large";
                break;

            default:
                size = "Unknown";
                break;
        }

        System.out.println("Size: " + size);
        sc.close();

    }
}
