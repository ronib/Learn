package Inter.concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 12/1/15
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadsSync extends Thread{
    private int m_value;

    public static void main (String[] args){
        System.out.println("xxx");
        Sync1 sync11 = new Sync1(1);
        sync11.start();

        Sync2 sync2 = new Sync2(sync11);
        sync2.start();

        Sync1 sync12 = new Sync1(3);
        sync12.start();
    }


    public static class Sync1 extends Thread{
        private int m_value;
        public Sync1(int value){
            m_value = value;
        }
        public synchronized void printValue(int iValue){
            while(true){
                System.out.println(iValue);
            }
        }
        public void run(){
            printValue(m_value);
        }
    }
    public static class Sync2 extends Thread{
        private Sync1 m_sync1;
        public Sync2(Sync1 sync1){
            m_sync1 = sync1;
        }

        public void run(){
            m_sync1.printValue(2);
        }
    }
}
