import java.util.Scanner;

public class DogClass {
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name,String breed,int age,String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }

    
}
