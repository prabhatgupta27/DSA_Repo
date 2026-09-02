public class OddEvenPrinter {
    private int max;
    private int number = 1;  // Starting number
    private final Object lock = new Object(); // Shared lock for synchronization

    public OddEvenPrinter(int max) {
        this.max = max;
    }

    // Method to print odd numbers
    public void printOdd() {
        synchronized (lock) {
            while (number <= max) {
                // Wait if number is even
                while (number % 2 == 0) {
                    try {
                        lock.wait();  // Wait until notified by even thread
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                // Print odd number
                if (number <= max) {
                    System.out.println("T1 (Odd): " + number);
                    number++;
                    lock.notify();  // Notify the other thread
                }
            }
        }
    }

    // Method to print even numbers
    public void printEven() {
        synchronized (lock) {
            while (number <= max) {
                // Wait if number is odd
                while (number % 2 != 0) {
                    try {
                        lock.wait();  // Wait until notified by odd thread
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                // Print even number
                if (number <= max) {
                    System.out.println("T2 (Even): " + number);
                    number++;
                    lock.notify();  // Notify the other thread
                }
            }
        }
    }

    public static void main(String[] args) {
        int maxNumber = 10;  // Print numbers from 1 to 10

        OddEvenPrinter printer = new OddEvenPrinter(maxNumber);

        // Create two threads: T1 for odd, T2 for even
        Thread t1 = new Thread(printer::printOdd, "T1");
        Thread t2 = new Thread(printer::printEven, "T2");

        // Start both threads
        t1.start();
        t2.start();
    }
}