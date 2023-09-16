package Files;
public class Thread {
	public static void main(String[] args) {
	System.out.println("Starting");
	Thread1 j1 = new Thread1();
	Thread2 j2 = new Thread2();
	j1.run1();
	j2.run();
	System.out.println("ending");
	}
}