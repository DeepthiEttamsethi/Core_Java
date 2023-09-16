package LAB7;
public class InterleavedThread {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MessagePrinter(1, "Hello World from Thread-1"));
        Thread thread2 = new Thread(new MessagePrinter(2, "India is my country from Thread-2"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}

class MessagePrinter implements Runnable {
    private int threadNum;
    private String message;

    public MessagePrinter(int threadNum, String message) {
        this.threadNum = threadNum;
        this.message = message;
    }

    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-" + threadNum + " (TID-" + Thread.currentThread().getId() + "): " + message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}