import java.util.Scanner;

public class arraySum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] sum = new int[n1 > n2? n1:n2];
        int c = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int dig = c;

            if (i >= 0) {
                dig += a1[i];

            }

            if(j >= 0) {
                dig += a2[j];
            }

            c = dig / 10;
            dig = dig % 10;

            sum[k] = dig;

            i--;
            j--;
            k--;
        }

        if(c != 0) {
            System.out.print(c);
        }

        for(int val: sum) {
            System.out.print(val);
        }
    }
}

