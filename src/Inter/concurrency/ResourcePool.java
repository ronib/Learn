package Inter.concurrency;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 11/2/15
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourcePool<T> {
    private final Semaphore sem = new Semaphore(5, true);
    private final Queue<T> resources = new ConcurrentLinkedQueue<T>();

    public T getResource(long maxWaitMillis)
            throws InterruptedException {

        // First, get permission to take or create a resource
        sem.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS);

        // Then, actually take one if available...
        T res = resources.poll();
        if (res != null)
            return res;

        // ...or create one if none available
        try {
            return createResource();
        } catch (Exception e) {
            // Don't hog the permit if we failed to create a resource!
            sem.release();
        }

        return resources.poll();
    }

    private T createResource() {

        return null;
    }

    public void returnResource(T res) {
        resources.add(res);
        sem.release();
    }

    public static void main (String[] args){
        ResourcePool<String> res = new ResourcePool<String>();
        res.resources.add("roni");
        res.resources.add("shiri");
        res.resources.add("omer");
        res.resources.poll();

        try {
            res.getResource(10);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
