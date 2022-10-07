package thread;

public class ThreadDemo extends Thread {

    public synchronized void run()  {
        for (int i=0;i<5;i++){
            System.out.println(i + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        ThreadDemo d1 = new ThreadDemo();
        ThreadDemo d2 = new ThreadDemo();
        ThreadDemo d3 = new ThreadDemo();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

       /* Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                d1.add("first");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                d1.add("second");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                d3.add("third");
            }
        });*/

        t1.start();
        t2.start();
        t3.start();


    }
}