package thread;

//ThreadExample2 code is very lengthy, in this make that code smaller
public class ThreadExample3 {

    public static void main(String[] args) throws InterruptedException {

        //Runnable is a Functional interface so we can use lambda function here

        Thread t1 = new Thread(() -> {
            for (int i=0;i<5;i++){
                System.out.println("Hello " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
            }
        }, "Hello Thread"); // sometimes its very difficult to manage the threads so this is how we can give name to the threads
        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
            }
        }, "Hi Thread");

        //change priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //priority
        //the range of priority goes from 1 to 10, 1means least priority and 10 means highest priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();
        //System.out.println("Bye"); //it will execute in between t1 and t2 so we use join here

        System.out.println(t1.isAlive()); //isAlive detect that the thread is in running state or not in a running state

        t1.join();//join will make main thread to wait for t1 and t2 for join here
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");

        System.out.println(t1.getName());
        System.out.println(t2.getName());




//
//        t1.setName("Hi Thread");
//        t2.setName("Hello Thread");
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());
    }
}

