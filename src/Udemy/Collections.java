package Udemy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

    public static void main(String[] args){


        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("World");
        words.add("Boom");

        String item1 = words.get(2);

        System.out.println(item1);

        //Better at manipulating the data
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(200);
        numbers.add(10000);

        for(int number:numbers){
            System.out.println(number);
        }

        //Can use the clear method to delete everything in the list
        //Can use contains method to check for a value (true or false)
        //Can use sort to sort the list
    }

}
