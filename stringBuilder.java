import java.util.*;

class stringBuilder {
    public static void main(String args[]) {
        
        StringBuilder sb = new StringBuilder("Tony");
        
        System.out.println(sb);
        
        // char at index
        System.out.println(sb.charAt(0));
        
        
        // set character at index
        sb.setCharAt(0,'S');
        System.out.println(sb);

        // insert
        sb.insert(2,'n');
        System.out.println(sb);

        // delete
        sb.delete(2, 4);
        System.out.println(sb);
        
        // append
        sb.append(" Strak");
        System.out.println(sb);

        System.out.println(sb.length());

    }
}