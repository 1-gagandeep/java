// import java.util.*;

// public class primetime {
//     public static void main(String[] args) {
        
//         Scanner scn = new Scanner(System.in);

//         int t = scn.nextInt();
//         for(int i = 0; i < t; i++) {

//             int count = 0;
//             int num = scn.nextInt();
//             for(int div = 2; div * div < num; div++) {
//                 if (num % div == 0) {
//                     count++;
//                     break;
//                 }
//             }

//             if(count == 0) {
//                 System.out.println("Prime number");
//             }

//             else {
//                 System.out.println("Not a prime number");
//             }
//         }
//     }
// }

import java.util.*;

public class primetime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i = low; i < high; i++) {
            int count = 0;

            for(int div = 2; div * div < i; div++) {

                if(i % div == 0) {
                    count++;
                    break;
                }
            }
            
            if(count == 0) {
                
                System.out.println(i);
            }
        }
    }
}