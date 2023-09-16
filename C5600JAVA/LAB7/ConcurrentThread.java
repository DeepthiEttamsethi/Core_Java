package LAB7;
public class ConcurrentThread {

    public static void main(String[] args) {
        Thread threadA = new Thread();
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread A");
                try {
                    Thread.sleep(500); // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread B");
                try {
                    Thread.sleep(500); // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}