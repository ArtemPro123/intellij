package Udemy;

public class Threads {

    public static void main(String args[]){


        //creating instance of Class Task which is a thread
        System.out.println("Starting Thread 1");
        Task taskRunner = new Task("Thread A");
        taskRunner.start();//when using run() then it will sequentially execute the code

        //If you run the program this will still print first
        System.out.println("Hello there...");

        //Another Thread, different way of starting it
        System.out.println("Starting Thread 2");
        Thread t2 = new Thread(new Task("Thread B"));
        t2.start();
    }

}

class Task extends Thread{
    String name;
    public Task(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(name);
        for (int i=0;i<5;i++){
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
