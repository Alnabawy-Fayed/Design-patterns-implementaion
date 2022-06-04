package singleton_pattern;

import singleton_pattern.Counter;

public class SingletonTask implements  Runnable{
    public void run(){
        Counter counter = Counter.getCounter();
        counter.add();
        //print count and counter object memory adress
        System.out.println(counter.getCount()+" "+counter);
    }
}
