import java.util.*;

public class input {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = Integer.parseInt(scn.nextLine());

        String name = scn.nextLine();
        System.out.println("Hello " + name + " Your counting is here: ");

        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        System.out.println("Done");
    }
}