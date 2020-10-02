package Udemy.producerconsumer;

import java.util.List;

//this will produce questions
public class Producer implements Runnable{

    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    Object myObject = new Object();

    public Producer(List<Integer> questionList){
        this.questionList = questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {
        synchronized (questionList){
            while(questionList.size() == LIMIT){
                System.out.println("Wait for more answers");
                questionList.wait();
            }
        }
        //questionList Object is used as a Lock
        synchronized (questionList){
            while(questionList.size() == LIMIT){
                System.out.println("New Question " + questionNo);
                questionList.add(questionNo);
                Thread.sleep(100);
                questionList.notify();//will notify the threads to wake up
            }
        }


    }

    @Override
    public void run() {
        while (true){
            try {
                readQuestion(questionNo++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
