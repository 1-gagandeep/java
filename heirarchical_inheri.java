class First {
    First() {
        System.out.println("This is first class");
    }
}

class Second extends First {
    Second() {
        System.out.println("This is second class");
    }
}

class Third extends First {
    Third() {
        System.out.println("This is third class");
    }
}

public class heirarchical_inheri {
    public static void main(String[] args) {
        Third t1 = new Third();
        Second s1 = new Second();
    }
}
