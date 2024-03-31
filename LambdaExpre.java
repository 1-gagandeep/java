interface Add {
    int add(int a, int b);
}

public class LambdaExpre {
    public static void main(String[] args) {

      Add ad1 = (a,b) -> (a+b);
        System.out.println("Sum is(without return type): " + ad1.add(10, 20));  
        
        Add ad2 = (int a, int b) -> {
            return a+b;
        };
        System.out.println("Sum is(with return type): " + ad2.add(100,300));
    }

}
