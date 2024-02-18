import java.util.Scanner;

public class unit1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the name of the project");
        String name = scn.nextLine();
        
        System.out.println("Enter the type of the event");
        String type = scn.nextLine();
        
        System.out.println("Enter the number of people expected");
        int people = scn.nextInt();
        
        System.out.println("Is it a paid entry?(Type Y or N)");
        String entryType = scn.nextLine();
        
        System.out.println("Enter the projected expenses");
        int expenses = scn.nextInt();
        
        System.out.println("Event Name" + ":" + name);
        System.out.println("Event Type" + ":" + type);
        System.out.println("Expected count" + ":" + people);
        System.out.println("Paid Entry" + ":" + entryType);
        System.out.println("Projected Expenses" + ":" + expenses);
    }
}
