class Base {
    Base() {
        System.out.println("This is base class");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("This is first derived class");
    }
}

class Derived1 extends Derived {
    Derived1() {
        System.out.println("This is second derived class");
    }
}

public class multilevel_inheri {
    public static void main(String args[]) {
        Derived1 d1 = new Derived1();
    }
}
