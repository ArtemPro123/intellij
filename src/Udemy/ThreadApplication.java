package Udemy;

public class ThreadApplication {

    public static void main(String[] args) throws InterruptedException {

        InventoryManager manager = new InventoryManager();
        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    manager.populationSoldProduct();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displayProducts();
            }
        });

        inventoryTask.start();
        inventoryTask.join();//This waits for inventory task to finish unlike the sleep which waits for amount of time (which means its not multithreaded)
        displayTask.start();

    }
}
