class College {

    String name = "Gagandeep";
    int age = 21;
    
    class Student {
        void getDetails() {
            System.out.println("Name: " + name +"\n"+ "Age: " + age);
        }
    }
    
    void getDetails() {

        Student s1 = new Student();
        s1.getDetails();
    }
}

public class NestedClass {

    public static void main(String[] args) {
        College c1 = new College();
        c1.getDetails();
    }
}