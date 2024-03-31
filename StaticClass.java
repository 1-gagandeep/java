class College {
    static String name = "Gagandeep";
    static int age = 21;

    static class Student {
        void getDetails() {
            System.out.println("Name: " + name + "\n" + "Age: " + age);
        }
    }

    void getDetails() {
        Student s1 = new Student();
        s1.getDetails();
    }
}

public class StaticClass {
    public static void main(String[] args) {
        College.Student s1 = new College.Student();
        s1.getDetails();
    }
}
