package Variables;

public class Staticfields {
    static int id = 1;
    String name = "Deepthi";

    public static void main(String[] args) {
        System.out.println(id);

        // To access the 'name' variable, you need to create an instance of the class.
        Staticfields instance = new Staticfields();
        System.out.println(instance.name);
    }

    public static void test1() {
        System.out.println(id);
    }
}
