package Udemy;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args){
        Object myObject = new Object();
        String myVar = "hello";
        myObject = myVar;

        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        //Referred to as a WildCard <?>
        //This deals with objects
        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
        employees2 = accountants2;

        //This is a list that accepts data from Employee and its children
        //This gives it some type as it extends a specific class
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();
        employees3 = accountants3;

        //Super mean data must be employee can't be a subclass
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Object> accountants4 = new ArrayList<Object>();
        employees4 = accountants4;

        ///////////////////////

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        accountants.add(new Accountant());

        makeEmployeeWork(accountants);
    }

    public static void makeEmployeeWork(List<? extends Employee> employees){

        for (Employee emp : employees){
            emp.work();
        }

    }

}
