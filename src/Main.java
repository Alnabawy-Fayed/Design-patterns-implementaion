import singleton_pattern.SingletonTask;

public class Main {
    public static void main(String[] args) {
      SingletonTask task = new SingletonTask();
      Thread thread = new Thread(task);
      Thread thread1 = new Thread(task);
      Thread thread2 = new Thread(task);
      thread.start();
      thread1.start();
      thread2.start();

    }
}