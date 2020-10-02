package Udemy;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    List<Product> soldProductsList = new ArrayList<Product>();
    List<Product> purchasedProductsList = new ArrayList<Product>();

    public void populationSoldProduct() throws InterruptedException {
        for(int i=0; i<10;i++){
            Product prod = new Product(i, "test_product_" + i);
            soldProductsList.add(prod);
            System.out.println("Added: " + prod);
            Thread.sleep(10);
        }
    }

    public void displayProducts(){
        for (Product product: soldProductsList){
            System.out.println("Printing Sold Products: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
