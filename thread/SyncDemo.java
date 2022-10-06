package thread;

class Counter{
    int count;
    public synchronized void increment(){ //by using synchronised, only one thread can work with this method;
        // when we declared the method synchronised then the object counter is thread safe, class is thread safe
        //which means that the multiple threads can't access the same method at the same time
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

      Thread t1 = new Thread(new Runnable() {
          @Override
          public void run() {
              for (int i=1;i<=1000;i++){
                  c.increment();
              }
          }
      });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });



        t1.start();//if we not use join then it will print 0 because the main thread is not waiting for the run() method to complete its execution
        t2.start();
        t1.join(); //using this main thread waits for the execution of the run() method and prints 1000

        t2.join();
        System.out.println("Count "+ c.count);
        //so in this case the value of count is always unique because sometimes both t1 and t2 calls the same increment() method at the same
        //to get the accurate result and when t1 calls the method t2 don't interfere and vice versa
        //so we have to declare the increment() method synchronized;
    }
}
