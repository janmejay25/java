class SharedResource {
    private boolean available = false;

    synchronized void produce() throws InterruptedException {
        while (available) wait();
        System.out.println("Producing...");
        available = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consuming...");
        available = false;
        notify();
    }
}

public class ThreadCommunicationin {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
hcsdhvk
        new Thread(() -> { // Producer Thread
            try { for (int i = 0; i < 5; i++) resource.produce(); } catch (InterruptedException e) {}
        }).start();

        new Thread(() -> { // Consumer Thread
            try { for (int i = 0; i < 5; i++) resource.consume(); } catch (InterruptedException e) {}
        }).start();
    }
}
