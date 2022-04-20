package InterfaceConcept;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String args[]){

        //uppercase convert
        UnaryOperator<String> name = s -> s.toUpperCase();
        String uppercasename = name.apply("indu");
        System.out.println(uppercasename);

        //multiply
        UnaryOperator<Integer> value = x ->x * 10;
        int mul = value.apply(90);
        System.out.println("Multiply is " + mul);
    }
}
