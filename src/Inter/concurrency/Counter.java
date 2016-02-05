package Inter.concurrency;

public class Counter {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start main");
        ThreadB b = new ThreadB();
        b.start();

        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
           }

            System.out.println("Total is: " + b.total);
        }



    }
}

class ThreadB extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Start run");
            for (int i = 0; i < 100; i++) {
                total += i;
            }
         //   notifyAll();
        }

        System.out.println("End run");

    }
}