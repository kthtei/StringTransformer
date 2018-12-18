package StringTransformer;

import java.io.FileNotFoundException;
import java.util.*;

public class StringTransformer {

    /**
     * The main method
     * @param args the arguments
     * @throws java.io.FileNotFoundException the file not found exception
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String fileName = "input.txt";
        System.out.println("Executing [" + fileName + "]...");

        CommandProcessor cp = new CommandProcessor(fileName);
        cp.run();
        System.out.println("Work Completed [" + fileName + "]");

        System.out.println();

        System.out.print("Enter the number of random executions: ");
        int number = scan.nextInt();
        cp.run(number);
        System.out.println("\nPrinted " + number + " Random Outputs");
        System.out.println("Work Completed");
    }
}
