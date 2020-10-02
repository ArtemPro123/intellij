package Udemy.producerconsumer;

import java.util.List;

public class Consumer implements Runnable{

    List<Integer> questionList = null;
    final int LIMIT = 5;

    public Consumer(List<Integer> questionList){
        this.questionList = questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList){
            while(questionList.isEmpty()){
                System.out.println("No questions");
                questionList.wait();
            }
        }
        //questionList Object is used as a Lock
        synchronized (questionList){
            Thread.sleep(5000);
            System.out.println("Answered Questions: " + questionList.remove(0));
            questionList.notify();//will notify the threads to wake up
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
