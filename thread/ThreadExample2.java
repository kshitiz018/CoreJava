package thread;

public class ThreadExample2 {

    public static void main(String[] args) {

        //hello1 obj1 = new hello1();
        Runnable obj1 = new hello1(); // so these objects becomes threads here
        Runnable obj2 = new hi1();
        Thread t1 = new Thread(obj1); //when we use interface, make sure that we also create objects of thread and pass the objects of runnable
        Thread t2 = new Thread(obj2);

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                }

            }
        });
        Thread t4 = new Thread() {
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                    }
                }
            }
        };


        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();

        t3.start();

    }
}

class hello1 implements Runnable{ // runnable interface have only one method run();
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
class hi1 implements Runnable{
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
class hi2 implements Runnable{
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
