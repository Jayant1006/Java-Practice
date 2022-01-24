public class Composition {
    private String name;
    private String email;
    private String gender;

    public Composition(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Overridding the predefined toString Method
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }

    public static void main(String args[]) {
        Composition c1 = new Composition("Jayant", "jayantnadar124@gmail.com", "M");
        c1.setEmail("jayant10062001@gmail.com");
        System.out.println(c1);

    }
}