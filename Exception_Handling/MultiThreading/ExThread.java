package MultiThreading;

public class ExThread {

	public static void main(String[] args) {
		First o1 = new First();
        Second o2 = new Second();

        o1.start();
        o2.start();

        System.out.println("End of Main");

	}

}
