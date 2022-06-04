package singleton_pattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;
    private static Counter counter = null;
    private Counter(){}
    public  static Counter getCounter(){
        Lock lock = new ReentrantLock();
        if(counter == null) {
            lock.lock();
            if (counter == null) {
                counter = new Counter();
            }
            lock.unlock();
        }
        return counter;
    }
    public void add(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
