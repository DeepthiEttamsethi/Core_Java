package objects;

public class Test {
    int i;
    int j;

    public Test() {
        i = 10;
        j = 20;
    }

    public Test(int i, int j) {
        this.i = i; // Use 'this' to refer to the instance variable
        this.j = j; // Use 'this' to refer to the instance variable
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(15, 25);
        Test t3 = new Test(80, 50);

        System.out.println(t1.add());
        System.out.println(t2.add());
        System.out.println(t3.add());
        System.out.println(t1.i);
        System.out.println(t1.j);

        System.out.println(t1 == t2);
        System.out.println(t2 == t3);
    }

    public int add() {
        return i + j;
    }
}
