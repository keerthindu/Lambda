package IteratingArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String args[]){
        List<String>  tvseries = Arrays.asList("GOT","Breaking Bad", "The walking dead", "Stranger Things","Dark","Friends");

        //1. using Java 8 with for each loop and lambda expression
        System.out.println("---------using Java 8 with for each loop and lambda expression----------------");
        tvseries.forEach(shows -> {
            System.out.println(shows);
                });
        System.out.println("---------print using iterator----------------");

        //2. using Iterator
        Iterator<String> it = tvseries.iterator();
        while (it.hasNext()){
            String shows = it.next();
            System.out.println(shows);
        }

        //3. Using Iterator & java 8 forEachRemaining() method
        System.out.println("------Using Iterator & java 8 forEachRemaining() method--------");

        it = tvseries.iterator();
        it.forEachRemaining(shows -> {
            System.out.println(shows);
        });

        //4. Using for each loop
        System.out.println("------Using for each loop--------");
       for(String tv : tvseries)
       {
           System.out.println(tv);
       }

       //5. Using for loop with order / Index
        System.out.println("------Using for loop with order / Index--------");
        for(int i =0; i<tvseries.size();i++){
            System.out.println(tvseries.get(i));
        }

        //6. Using listIterator() to traverse in both the direction
        System.out.println("------------Using listIterator() to traverse in both the direction---------");
        ListIterator<String> tvseriesListIterator = tvseries.listIterator(tvseries.size());
        while (tvseriesListIterator.hasPrevious()){
            String show = tvseriesListIterator.previous();
            System.out.println(show);
        }



    }
}
