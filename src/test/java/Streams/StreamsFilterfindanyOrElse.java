package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterfindanyOrElse {
    public static void main(String args[]){

        //list of customer objects
        List<Costumer> costumerList = Arrays.asList(
                new Costumer("Tom",21),
                new Costumer("Peter",31),
                new Costumer("Ram",26),
                new Costumer("Kirti",41)
        );

       Costumer customer = costumerList.stream() //convert list to stream
                .filter(data -> "Peter".equals(data.getName())) //filter it for "Peter"
                .findAny()  //if it finds then it will return the list
                .orElse(null);

        System.out.println(customer.getName() + "   " + customer.getAge());

        System.out.println("---------------");

        //2. Filter -> didn't find value - using orElse
        Costumer customer1 = costumerList.stream() //convert list to stream
                .filter(data -> "Indu".equals(data.getName())) //filter it for "Indu"
                .findAny()  //if it finds then it will return the list
                .orElse(null);

        System.out.println(customer1);

        //3. Filter with multiple condition
        Costumer customer2 = costumerList.stream()
                .filter(x -> "Kirti".equals(x.getName()) && 41 == x.getAge())
                .findAny()
                .orElse(null);
        System.out.println(customer2.getName() + "   " + customer2.getAge());

    }
}
