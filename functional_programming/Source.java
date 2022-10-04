package functional_programming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Source {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       //find the total of double even numbers
        int result =0;
        for (int e : numbers){
            if (e%2==0){
                result += e*2;
                // this type of coding is very low level coding
                //there are two different smells of imperative code the first smell
                //we got a variable at starting but we are mutating that variable over and over,
                // so that the first smell of the imperative style of coding that we do mutability quite

                //so in this we tells what to do but also how to do
                //In this we tell the code every single detail. we had to say one element at a time please check if a element either even
                //go ahead that element right and then fetch the current value of result and add to the value od result and store it into the result.
            }
        }
        System.out.println(result);
        System.out.println();

        System.out.println(
                numbers.stream() // stream as internal iterator
                        .filter(e -> e%2 ==0 ) // returns the elements only that are even and not any of the other element so we apply filter here
                        .mapToInt(e -> e*2)
                        .sum());
        //Focus on what to do(declarative style)
        //This code is very humane
        //No variable tortured in the making the result;
        //so we are not mutating any variables repeatedly

        //The code is very hard to compose an imperative style because statements often cause mutability, transform data from next to the next to the next


        // values to be doubled and print it

     /*   List<Integer> numbers2 = Arrays.asList(1,2,3);

        numbers2.stream()
                .map(e -> e*2) //e is the parameter to the lambda function
                .forEach(System.out::println);*/

      /*  numbers2.stream()
                .map(e -> e*factor)
                .forEach(System.out::println);*/
        //This lambda has tp clos-over it defining looking
        // for the variable factor to bind to - closure

        //lambdas are stateless
        //Stateless Functions
        /* Lambda functions effectively stateless.
         This means that every time your Lambda function is triggered by an event
         it is invoked in a completely new environment*/
        //closure has immutable state
        //closures carries the state but the state carries by closure are immutable
        System.out.println();
        List<Integer> numbers3 = Arrays.asList(1,2,3);

        int factor = 2;

       Stream<Integer> strm = numbers3.stream()
                .map(e -> e*factor);
     //  factor = 4; // Variable used in lambda expression should be final or effectively final
       strm.forEach(System.out::println);


//       int[] factor2 = new int[] {2};
//        Stream<Integer> strm1 = numbers3.stream()
//                .map(e -> e*factor2[0]);
//
//        factor2[0] = 0;
//        strm1.forEach(System.out::println);
        //this is error prone and bad idea don't do this
        //purity of functions is so important so don't mess with the things like this and preserves the purity of closures

        // get the double of sqrt of even numbers
        List<Integer> numbers4 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                numbers.stream()
                        .filter(e -> e %2 ==0)
                        .mapToDouble(Math::sqrt)
                        .sum());
        //this becomes what calls the function composition
        //we go through the transformations, we take the collection
        //transform to even numbers, map to double to perform the sum

        // fewer errors because there is less mutability in code
        //less complexity, less mutability favors fewer errors in code
        //and also removes all the extra garbage variables to carry around

    }
}
