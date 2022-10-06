package thread;

public class ThreadExample {

    public static void main(String[] args) {
        hello obj1 = new hello(); // so these objects becomes threads here
        hi obj2 = new hi();

        obj1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){}
        obj2.start(); // when we start it will automatically call the thr run() method
        //In CPU there is a scheduler so both the threads reaches at the scheduler at the same time
        //and both the threads says i wnt to execute first ans the scheduler says i am not able to execute both the threads at the same time
        //so scheduler choose one out of these two with different criteria

    }
}

class hello extends Thread{
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
class hi extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

    }
}
