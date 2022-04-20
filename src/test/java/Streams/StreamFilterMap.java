package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {
    public static void main(String args[]){

        //list of customer objects
        List<Costumer> costumerList = Arrays.asList(
                new Costumer("Tom",21),
                new Costumer("Peter",31),
                new Costumer("Ram",26),
                new Costumer("Kirti",41));

       String name = costumerList.stream()
                .filter(s -> "Tom".equals(s.getName()))
                .map(Costumer::getName)
                .findAny()
                .orElse(null);
        System.out.println(name);
        System.out.println("-----------");

        //print all the names from the list
        List<String> cuslist  = costumerList.stream()
                .map(Costumer::getName)
                .collect(Collectors.toList());

        cuslist.forEach(System.out::println);

    }
}
