package thread;

public class InterThreadProducerConsumer {
    public static void main(String[] args) {

        X x = new X();
        Y y = new Y();
        x.start();
        y.start();


    }
}

class Z{
    int i=0;

    public void getI() {
        System.out.println("get"+i);
    }

    public void setI(int i) {

        this.i = i;
        System.out.println("set"+i);
    }
}

class X extends Thread{
    Z z;
    public void run(){
        for (int i=0;i<10;i++){
            z.setI(i);
        }
    }
}
class Y extends Thread{
    Z z = new Z();
    public void run(){
        for (int i=0;i<10;i++){
            z.getI();
        }
    }
}