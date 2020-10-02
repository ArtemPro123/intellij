package Udemy.CarDealer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {

    public static void  main(String[] args){

        Customer cust1 = new Customer();
        Employee emp = new Employee();
        Vehicle vehicle = new Vehicle("lamborghini", "Huracan", 100000);
        Vehicle vehicle2 = new Vehicle("BMW", "M1", 20000);

        ArrayList<Object> stock = new ArrayList<>();
        stock.add(vehicle);
        stock.add(vehicle2);

        cust1.setName("Tom");
        cust1.setAddress("123 Anything Street");
        cust1.setCashOnHand(120000);

        System.out.println("Welcome to the Dealership!");
        System.out.println("Here is our stock: ");
        for (int i = 1; i < stock.size()+1; i++) {
            System.out.println("Vehicle Number " + i + " " + stock.get(i-1));
        }
        Scanner vehiclechoice = new Scanner(System.in);
        System.out.println("Please choose vehicle number: ");
        int num = vehiclechoice.nextInt();
        while (num > 2 || num < 1){
            System.out.println("Please Enter a valid Number!");
            num = vehiclechoice.nextInt();
        }
        System.out.println(stock.get(num-1));

        Vehicle choice = (Vehicle) stock.get(num-1);
        System.out.println("Okay great!");
        System.out.println("Would you like to finance the vehicle? [yes/no]");
        boolean financeboolean = false;
        Scanner finance = new Scanner(System.in);
        String financechoice = finance.nextLine();
        //System.out.println(financechoice);
        if(financechoice.equals("yes")){
            financeboolean = true;
        }else if (financechoice.equals("no")){
            financeboolean = false;
        } else {
            System.out.println("Please Enter yes or no!");
        }


        cust1.purchaseCar(choice, emp, financeboolean);




    }

}
