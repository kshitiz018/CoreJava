package thread;

public class InterThread {
    public static void main(String[] args) {

        Q q = new Q();
        new Producer(q);
        new Consumer(q);


    }
}


//resource
 class Q{

    int num;
    boolean value = false;

    public synchronized void setNum(int num){
        while (value ){ // we set the value one time then it will wait
            //wait for the consumer to consume the value
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Set "+num); //in this if value is false then it sets the value and make it true and wait()
        value = true;
        this.num = num;
        notify(); //notifies the consumer thread
    }
    public synchronized void getNum() {
        while (!value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get "+num);
        value = false;
        notify(); // notifies the producer thread
    }

}
// resource end

class Producer implements Runnable{

    Q q;
    @Override
    public void run() {
        int i=0;
        while (true){
            q.setNum(i++);
            try {
                Thread.sleep(1000);

            }catch (Exception e){}
        }
    }


    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
       // System.out.println(t.getName());
    }
}


class Consumer implements Runnable{

    Q q;
    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    @Override
    public void run() {
        while (true) {
            q.getNum();
            try {
                Thread.sleep(1000);

            }catch (Exception e){}
        }
    }

}