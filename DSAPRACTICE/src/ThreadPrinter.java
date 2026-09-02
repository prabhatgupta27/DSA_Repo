/*3 thread A,b,c we have to print 0 by thread A, 1 by thread B, 2 by
thread C and repeat this process for n times.*/
public class ThreadPrinter {

    private int count = 0;
    private final int n;

    public ThreadPrinter(int n) {
        this.n = n;
    }

    private synchronized void print(int threadId, String thread){

        while(count < n){
          //  System.out.println(count % 3);

            while(count < n && (count % 3 != threadId)){
                try{
                    System.out.println(count % 3);
                    wait();
                }catch (InterruptedException e){
                    System.out.println(thread);
                      Thread.currentThread().interrupt();
                      return;
                }

            }

            if(count < n){
                System.out.println("thread name "+ thread +" -> "+ count);
                count++;
                notifyAll();
            }

        }

    }

    static void main() {
        int n= 10;
        ThreadPrinter p = new ThreadPrinter(n);

        Thread a = new Thread(()-> p.print(0, "A"));
        Thread b = new Thread(()-> p.print(1, "B"));
        Thread c = new Thread(()-> p.print(2, "C"));

        a.start();;
        b.start();
        c.start();

    }
}
