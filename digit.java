// import java.util.Scanner;

// public class digit {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         int num = scn.nextInt();

//         int dig = 0;
//         while (num != 0) {
//             num = num / 10;
//             dig++;
//         }
//         System.out.println(dig);
//     }
// }

import java.util.Scanner;

public class digit {

    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);

        int num = snc.nextInt();

        int nod = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;            
        }

        int div = (int)Math.pow(10, nod - 1);
        while (div != 0) {
            int q = num / div;
            System.out.println(q);

            num = num % div;
            div = div / 10;
        }
    }
}
