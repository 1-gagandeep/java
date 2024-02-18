public class staticKey {

    static String name = "Gagandeep";
    String name1 = "Kumar";

    public static void myStaticMethod() {
        System.out.println("My name is: " + " " + name );
    }
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        staticKey myObj = new staticKey(); // Create an object of MyClass
        myObj.myStaticMethod(); // Call the public method
        

    }
}