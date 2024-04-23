import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of num: ");
        int num = sc.nextInt();
        int res = 1;
        
        
        for(int i = 1; i < num+1; i++) {
            res *= i;
        }
            System.out.println("Factorial of " + num + ":" + res);
    }
}