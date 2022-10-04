package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class demo {
    public static void main(String[] args) {

        // Functional Programming

//       Thread th = new Thread(new Runnable() {
//           @Override
//           public void run() {
//               System.out.println("another thread");
//           }
//       });
//        Thread th = new Thread(() -> System.out.println());
//       th.start();
//        System.out.println("abc");
//
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//       //External Iterator
//        for(int i=0; i<numbers.size();i++){
//            System.out.println(i);
//        }
//        for (int e : numbers){
//            System.out.println(e);
//        }


        //Internal Iterator
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer e) {
//                System.out.println(e);
//            }
//        });

        //  numbers.forEach((Integer e)-> System.out.println(e));

        //these are called functional interfaces

        // numbers.forEach((e)-> System.out.println(e));

        //here don't need to give type reference. Java is finally intelligent we can use very easily
        // type inference with lambda expressions, so we can simply leave out the type because the type
        //is not adding any value in this.

        // numbers.forEach(e-> System.out.println(e));

        //parentheses are also not so important
        //if we have two or more than two parameters then we use parentheses but if we have o nly one parameter then we don't use parentheses

//        numbers.forEach(e-> System.out.println(e*2));

        numbers.forEach(System.out::println);

        //:: these are called method references. Method references make the code lock easier to understand  and work with.
        //and these are also easier to read




    }
}

