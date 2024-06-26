interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 4.59f;
    }
}

class PNB implements Bank {
    public float rateOfInterest() {
        return 5.45f;
    }
}

public class Interface {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println("Rate of Interest: " + b1.rateOfInterest());
    }
}