public class Oddevenprinter {

    private final int max;
    private int n = 1;

    private final Object lock = new Object();

    public Oddevenprinter(int max) {
        this.max = max;
    }

    private void printOdd(){
       synchronized(lock){
           while(n <= max){
               while(n % 2 == 0){
                   try {
                       lock.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }

               if(n <= max){
                   System.out.println("T1 Odd " +n);
                   n++;
                   lock.notify();
               }
           }

       }
    }

    private void printEven(){
        synchronized(lock){
            while(n <= max){
                while(n % 2 != 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(n <= max){
                    System.out.println("T2 Even " +n);
                    n++;
                    lock.notify();
                }
            }

        }
    }



    public static void main(String[] args) {

        int max = 50;

        Oddevenprinter od = new Oddevenprinter(max);

     //   Thread t1 = new Thread(od::printOdd,"T1");
        Thread t1 = new Thread(()-> od.printOdd(),"T1"); // other way
        Thread t2 = new Thread(od::printEven,"T2");


        t1.start();
        t2.start();


    }




}
