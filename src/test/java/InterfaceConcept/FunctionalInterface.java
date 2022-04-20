package InterfaceConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface {

    public static void main(String args[]){

        Function<String, Integer> func = x->x.length();
        int lenght = func.apply("Indu");
        System.out.println("Length is " + lenght);

        //Chaining Function
        Function<Integer,Integer> func2 = x->x*2;
        int mul = func.andThen(func2).apply("This is Indu");
        System.out.println("muliple value is " + mul);

        //using Arraylist
        List<String> language = new ArrayList<String>();
        language.add("Java");
        language.add("Python");
        language.add("JS");
        System.out.println("Language List " + language);

        language.replaceAll(s->s + " Programming language");
        System.out.println("After appending " + language);


    }
}
