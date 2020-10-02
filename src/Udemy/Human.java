package Udemy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Human {

    String name;
    int age;
    int heightInches;
    String eyeColour;

    public Human(){

    }

    public void speak(){
        System.out.println("Hello I'm " + name);
        System.out.println("I am " + heightInches + " tall");
        System.out.println("I am " + age + " old");
        System.out.println("My eye colour is " + eyeColour);
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void walk(){
        System.out.println("walking...");
    }

    public void work(){
        System.out.println("working...");
    }
}
