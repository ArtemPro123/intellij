package Udemy;
import java.util.HashSet;

public class HashSets {

    public static void main(String[] args){

        //Only cares about the unique values
        //A LinkedHashSet does indeed maintain value
        //HashCode will also ensure uniqueness
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(12);
        values.add(1);
        values.add(12);
        values.add(100);


        for(Integer value:values){
            System.out.println(value);
        }
    }

}
