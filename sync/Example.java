package sync;

public class Example {
    public static void main(String[] args) {
        counter c = new counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.loopCount(5);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=999999999;i++){
                    if (i==999999999){
                        c.loopCount(10);
                    }
                }

            }
        });

        t1.start();
        t2.start();


    }
}

class counter{

    public synchronized void loopCount(int n){
        for (int i=0;i<n;i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            }catch (Exception e){}
        }
    }

}

