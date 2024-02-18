// import java.util.*;

// public class function {
    
//     public static void average(int a, int b, int c) {
//         int aver = (a + b + c) / 3;
//         System.out.println(aver);
//     }
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         average(a,b,c);
//     }
// }


// import java.util.*;

// public class function {
    
//     public static void oddSum(int num) {
//         int sum = 0;
//         for(int i = 1; i < num; i++) {
//             if(i % 2 != 0) {
//                 sum = sum + i;
//             }
//         }
//             System.out.println(sum);
//     }
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         int num = sc.nextInt();
        
//         oddSum(num);
//     }
// }

// import java.util.*;

// public class function {
    
//     public static void greatest(int a, int b) {
//         if(a > b) {
//             System.out.println("a is greatest number");
//         }
        
//         else {
//             System.out.println("b is greatest number");
//         }
//     }
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         greatest(a,b);
//     }
// }

// public class function {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
            
//           System.out.println(i); 
//           i++; 
//         }
        
//         while(i <= 5);
//     }
// }

// import java.util.*;

// public class function {
    
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
        
//         for(int i = 0; i < size; i++) {
//             numbers[i] = sc.nextInt();
//         }
        
//         for(int i = 0; i < size; i++) {
//             System.out.println(numbers[i]);
//         }
//     }
// }

import java.util.*;

public class function {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int item = sc.nextInt();
        
       for(int i = 0; i < size; i++) {
           numbers[i] = sc.nextInt();
           
       } 
       
       for(int i = 0; i < numbers.length; i++) {
           
           if(numbers[i] == item) {
               
                System.out.println("item found at index: " + i);
           }
       }

    }
}