abstract class Shape {
    
    abstract void draw();
    
    void changeShape() {
        System.out.println("Shape is changed");
    }
    Shape() {
        System.out.println("Shape is created");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("This is rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("This is circle");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        s1.changeShape();
        s1.draw();
        
        Shape s2 = new Circle();
        // s2.changeShape();
        s2.draw();
    }
}