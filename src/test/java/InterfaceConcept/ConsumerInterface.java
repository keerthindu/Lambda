package InterfaceConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main (String args[]){

        //Represents an operation that accepts a single input argument and returns no result.

        Consumer<String> func = s -> System.out.println(s);
        func.accept("Welcome");

        //using arraylist
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
        number.forEach(x -> System.out.println(x));

    }
}
