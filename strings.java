public class strings {
    public static void main(String[] args) {
        // String firstName = "Gagandeep";
        // String lastName = "Kumar";

        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        // for finding length
        // System.out.println(fullName.length());

        // for finding character
        // for(int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        //Compare
        // String name1 = "Prince";
        // String name2 = "Prince";

        // 1 s1 > s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal");
        // }

        // else {
        //     System.out.println("Strings are not equal");
        // }

        // if(name1 == name2) {
        //     System.out.println("Strings are equal");
        // }

        // else {
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Gagan") == new String("Gagan")) {
        //     System.out.println("Strings are equal");
        // }

        // else {
        //     System.out.println("Strings are not equal");
        // }

        // substring

        String sentence = "My name is Gagandeep";
        // String name = sentence.substring(11, sentence.length());
        String name = sentence.substring(11);
        System.out.println(name);
    }
}
