package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterwithCollect {
    public static void main(String args[]){

        List<String> productlist = Arrays.asList("Macbook","iphone","Shoes","Pendrive","Bat");
        productlist.forEach(System.out::println);

        List<String> ls = productlist.stream()
                .filter(s -> !s.equalsIgnoreCase("Shoes"))
                .collect(Collectors.toList());

        ls.forEach(System.out::println);
    }
}
