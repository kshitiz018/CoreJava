package thread;
import java.util.*;

/*In computer science, a thread of execution is the smallest sequence of programmed instructions that can be managed independently
 by a scheduler, which is typically a part of the operating system.
        Multithreading in java is a process of executing multiple activities can proceed concurrently in the same program.
        Thread is basically a lightweight sub-process, a smallest unit of processing.
        In multithreading threads share a common memory area.
        They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

        Multiple threads can exist within the same process and share resources such as memory,
         while different processes do not share these resources.
        Using two different task at the same time means multi-tasking. Thread is unit of a process.*/
public class Sample {
    public static void nap(){
        try{
            Thread.sleep(5000);//if we call sleep then the thread is paused for given seconds
       //like the thread is going to be held hostage while it sleeps at this point
        }catch (Exception e){

        }
    }
    public static void main(String[] args) throws InterruptedException {
        int MAX = 1000;
        Thread thread = null;
        for (int i=0;i<MAX;i++){
            thread = new Thread(Sample::nap);
            thread.start();
        }

        System.out.println("Started "+MAX+" threads");
        thread.join();
        System.out.println("done");
    }

}
