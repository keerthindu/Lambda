package InterfaceConcept;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String args[]){

        Predicate<Integer> fun = s -> s>10;
        List<Integer> numbers = Arrays.asList(23,1,3,90,34,21,5);
        List<Integer> values  = numbers.stream().filter(fun).collect(Collectors.toList());

        System.out.println(values);

        //predicate with And operator
        List<Integer> values2  = numbers.stream().filter(s -> s > 10 && s < 90).collect(Collectors.toList());
        System.out.println("Using two condition " + values2);

        //predicate with negate
        List<String> namelist = Arrays.asList("Keerthi","Kee","java","jav","ja","j");
        Predicate<String> names = s -> s.startsWith("Kee");
        List nameexpression = namelist.stream().filter(names.negate()).collect(Collectors.toList());
        System.out.println(nameexpression);



    }
}
