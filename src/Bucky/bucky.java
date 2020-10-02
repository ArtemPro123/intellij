package Bucky;

import java.util.LinkedList;
import java.util.List;

public class bucky {

    public static void main (String[] args){

        String[] things = {"apples", "noobs", "goats"};

        List<String> list1 = new LinkedList<String>();
        for (String x : things){
            list1.add(x);
        }

        String[] things2 = {"sausage", "bacon", "Goats"};
        List<String> list2 = new LinkedList<String>();
        for(String y : things2){
            list2.add(y);
        }

        list1.addAll(list2);
        list2 = null;

    }

}
