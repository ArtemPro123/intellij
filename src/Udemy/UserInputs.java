package Udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) throws FileNotFoundException {

        //User Inputs
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Some Text: ");
//        String enteredText = input.nextLine();
//        System.out.println(enteredText);

        //Reading Files
        //Can Also do it using a FileReader/ BufferReader
        //AutoClose classes by implementing AutoClose and adding resources into the try catch, this means you don't need final block (Java 7 onwards)
        File file = new File("myfile.txt");
        Scanner input = new Scanner(file);
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }

}
