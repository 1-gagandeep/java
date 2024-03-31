interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 4.15f;
    }
}

class PNB implements Bank {
    public float rateOfInterest() {
        return 5.55f;
    }
}

public class Interface {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println("Rate of interest: " + b1.rateOfInterest());
    }
}