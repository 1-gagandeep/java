interface Bike {
    void run();
}

interface Car {
    void changeGear();
}

class Vehicle implements Bike, Car {
    public void run() {
        System.out.println("All vehicle shall run.");
    }

    public void changeGear() {
        System.out.println("All vehicle shall change gear.");
    }
}

public class MultipleInheri {
    public static void main(String[] args) {
      Vehicle v1 = new Vehicle();
      v1.run();
      v1.changeGear();  
    }
}
