package thread;

public class Demo{
    public static void main(String[] args) throws InterruptedException {

        A t1 = new A();
        t1.start();
       // t1.start(); // this will give exception because we can't execute a thered again because the thread is in dead state
        B t2 = new B();
        t2.start();
    }
}

class A extends Thread{
    public void run(){
       for (int i=0;i<=999999999;i++){
           if (i==999999999){
               System.out.println("Thread is executed");
           }
       }

    }
}
class B extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
