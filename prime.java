import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for(int i = 0; i <= t; i++) {

            int num = scn.nextInt();
            int count = 0;
            for(int div = 1; div <= num; div++) {

                if(num % div == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println("Prime number");
            }

            else {
                System.out.println("Not a prime number");
            }
        }
    }
}

