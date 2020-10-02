package Udemy;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.Set;

public class Generics {
    //Generics helps you be flexible without compromising data types
    public static void main(String[] args){

        Container<Integer, String> container = new Container<Integer, String>(12, "Hello");
        int myval1 = container.getItem1();
        String myval2 = container.getItem2();
        System.out.println(myval1);
        System.out.println(myval2);

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("First");
        mySet1.add("Second");
        mySet1.add("Third");

        Set<String> mySet2 = new HashSet<String>();
        mySet1.add("First");
        mySet1.add("Second");
        mySet1.add("Computer");

        Set<String> resultSet = union(mySet1, mySet2);
        Iterator<String> itr = resultSet.iterator();
        while (itr.hasNext()){
            String var = itr.next();
            System.out.println(var);
        }

    }

    //Sets do not store duplicates
    //Example of a Generic Method
    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result  = new HashSet<>(set1);//Don't have to repeat E after the new set
        result.addAll(set2);
        return result;
    }
}
