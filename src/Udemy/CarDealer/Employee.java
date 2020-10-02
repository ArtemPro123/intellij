package Udemy.CarDealer;


public class Employee {

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle, int creditScore){

        if(finance == true){
            if(creditScore>500){
                double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
                runCreditHistory(cust, loanAmount);
            } else{
                System.out.println("Sorry your application was rejected!");
            }

        } else if(vehicle.getPrice() <= cust.getCashOnHand()) {
            //else the customer pays in cash
            processTransaction(cust, vehicle);
        } else {
            System.out.println("You need more money!");
        }
    }

    public void runCreditHistory(Customer cust, double loanAmount){
        System.out.println("Running credit History for Customer...");
        System.out.println("Congratulations!, your finance as been approved!");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased a vehicle " + vehicle + " for the price " + vehicle.getPrice());
    }

}
