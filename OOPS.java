interface Animal {
    public void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

public class OOPS {

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}