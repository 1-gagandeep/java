import java.util.*;

    public class grading {
        public static void main(String args[]) {
            
            Scanner scan = new Scanner(System.in);
            int marks = scan.nextInt();

            if(marks > 90) {
                System.out.println("Exellent marks");
            }

            else if(marks > 80) {
                System.out.println("Good marks");
            }

            else if(marks > 70) {
                System.out.println("Fair marks");
            }

            else if(marks > 60) {
                System.out.println("Meets expectations");
            }

            else {
                System.out.println("Below par");
            }

        }
    }
