abstract class Name <N> {
    abstract N show (N a, N b);
}

public class AnonymousClass {
    public static void main(String[] args) {
        Name <String> n = new Name <String> () {
            String show (String a, String b) {
                return (a+b);
        }
            };
            String result = n.show("Gagandeep ", "Kumar");
            System.out.println(result);
    }
}