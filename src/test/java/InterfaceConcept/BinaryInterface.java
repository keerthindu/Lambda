package InterfaceConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryInterface {

    public static void main (String args[]){

        BinaryOperator<Integer> func = (x1,x2) -> x1+x2;
        int sum = func.apply(10,20);
        System.out.println("Sum is " +sum);

        //Bifunction Interface
        BiFunction<Integer,Integer,Integer> func2 = (x1, x2)->x1+x2;
        int sum2 = func2.apply(3,4);
        System.out.println("Sum is " + sum2);


    }
}
