package OOPs;

public class abc {
    public static void main(String[] args) {
        A obj = new C(5);
        System.out.println(obj.a);
    }
}

class A{
    int a ;
    A(int a){
        this.a = a;
    }
}
class B extends A{

    B(int a){
        super(a*a);

    }
}
class C extends B{

    C(int a){
        super(a*a);
    }
}