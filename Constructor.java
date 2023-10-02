package Constructors;

public class Constructor {
    private int i; // Instance variable i

    public Constructor() {
        this.i = 20;
        System.out.println("Constructor is called");
    }

    public Constructor(int a) {
        this.i = a;
    }

    public static void main(String[] args) {
        Constructor cp = new Constructor(); // Create an instance using the default constructor
        System.out.println(cp.i); // Print the value of i (should be 20)

        Constructor cpWithArg = new Constructor(30); // Create an instance using the parameterized constructor
        System.out.println(cpWithArg.i); // Print the value of i (should be 30)
    }
}
