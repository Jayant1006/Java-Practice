import java.util.Scanner;

public class ObjOriented {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        lamp bulb = new lamp();
        lamp halogen = new lamp();

        String var = sc.nextLine();
        bulb.isOn(var);
        halogen.isOff();

        sc.close();
    }
}

// Creating a class for the working of lamp
class lamp {
    boolean isOn;
    static int count = 0;

    lamp() {
        count++;
        System.out.println(count);
    }

    void isOff() {
        isOn = false;
        System.out.println("The light is currently off");
    }

    void isOn() {
        isOn = true;
        System.out.println("The light is currently on");
    }

    void isOn(String str) {
        isOn = true;
        System.out.println("The " + str + " is currently on");
    }
}