package IteratingArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpandMethodRef {
    public static void main(String args[]){
        List<String> namelist = Arrays.asList("Peter","Sam","Rock","Krish");

        namelist.forEach(new Consumer<String>() {  //Anonymous  class
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        });

        //2. Lambda Expression: ->
        namelist.forEach(str -> System.out.println(str));

        //3. Method references
        namelist.forEach(System.out::println);


    }
}
