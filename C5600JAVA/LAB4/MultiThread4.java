package LAB4;
public class MultiThread4 {
public static void main(String[] args) {
First4 o1 = new First4();
Second4 o2 = new Second4();
Thread t1 = new Thread(o1);
Thread t2 = new Thread(o2);
t1.start();
t2.start();
System.out.println("End of Main");
}
}