package StringTransformer;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class CommandProcessor {

    /** The fileName. */
    private String fileName;
    private int number;

    /** Constructor taking String argument. */
    public CommandProcessor(String fileName) {
        this.fileName = fileName;
    }

    /** Overloaded constructor taking int for random generator. */
    public CommandProcessor(int number) {
        this.number = number;

    }

    /**
     * Run.
     *
     * @throws FileNotFoundException the file not found exception
     */

    public void run() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        String input1;
        String input2;
        String input3;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] splitted = line.split("<SEP>");
            splitted[0] = splitted[0].trim();

            input1 = splitted.length < 2 ? "" : splitted[1].trim();
            input2 = splitted.length < 3 ? "" : splitted[2].trim();
            input3 = splitted.length < 4 ? "" : splitted[3].trim();


            switch (splitted[0]) {
                case "endOther":
                    System.out.println(splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> "
                            + StringMethod.endOther(input1, input2));
                    break;
                case "mixString":
                    System.out.println(splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> "
                            + StringMethod.mixString(input1, input2));
                    break;
                case "repeatEnd":
                    System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> ")
                            + StringMethod.repeatEnd(input1, Integer.valueOf(input2)));
                    break;
                case "repeatFront":
                    System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> ")
                            + StringMethod.repeatFront(input1, Integer.valueOf(input2)));
                    break;
                case "repeatSeparator":
                    System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\", \""
                            + input3 + "\") -> ") + StringMethod.repeatSeparator(input1, input2, Integer.valueOf(input3)));
                    break;
                case "withoutString":
                    System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> ")
                            + StringMethod.withoutString(input1, input2));
                    break;
                case "sumNumbers":
                    System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.sumNumbers(input1));
                    break;
                case "countTriple":
                    System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.countTriple(input1));
                    break;
                case "sumDigits":
                    System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.sumDigits(input1));
                    break;
                case "sameEnds":
                    System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.sameEnds(input1));
                    break;
                case "":
                    System.out.println();
                    break;
                default:
                    System.out.println("invalid command [" + splitted[0] + "]");
            }
        }
        scan.close();
    }
    
    /**
    *Ovearloaded Run method that takes int number from the user and run number of times
    *
    *
    **/
    public void run(int number) {
        while (number != 0) {
            RandomInput ri = new RandomInput();
//        ri.repeatNTimes(number);
            String str = ri.inputGenerator();
            Scanner scan = new Scanner(str);

            String input1;
            String input2;
            String input3;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] splitted = line.split("<SEP>");
                splitted[0] = splitted[0].trim();

                input1 = splitted.length < 2 ? "" : splitted[1].trim();
                input2 = splitted.length < 3 ? "" : splitted[2].trim();
                input3 = splitted.length < 4 ? "" : splitted[3].trim();

                switch (splitted[0]) {
                    case "endOther":
                        System.out.println(splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> "
                                + StringMethod.endOther(input1, input2));
                        break;
                    case "mixString":
                        System.out.println(splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> "
                                + StringMethod.mixString(input1, input2));
                        break;
                    case "repeatEnd":
                        System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> ")
                                + StringMethod.repeatEnd(input1, Integer.valueOf(input2)));
                        break;
                    case "repeatFront":
                        System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> ")
                                + StringMethod.repeatFront(input1, Integer.valueOf(input2)));
                        break;
                    case "repeatSeparator":
                        System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\", \""
                                + input3 + "\") -> ") + StringMethod.repeatSeparator(input1, input2, Integer.valueOf(input3)));
                        break;
                    case "withoutString":
                        System.out.println((splitted[0] + "(\"" + input1 + "\", \"" + input2 + "\") -> ")
                                + StringMethod.withoutString(input1, input2));
                        break;
                    case "sumNumbers":
                        System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.sumNumbers(input1));
                        break;
                    case "countTriple":
                        System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.countTriple(input1));
                        break;
                    case "sumDigits":
                        System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.sumDigits(input1));
                        break;
                    case "sameEnds":
                        System.out.println((splitted[0] + "(\"" + input1 + "\") -> ") + StringMethod.sameEnds(input1));
                        break;
                    case "":
                        System.out.println();
                        break;
                    default:
                        System.out.println("invalid command [" + splitted[0] + "]");
                }
            }
            number--;
            scan.close();
        }

    }
}

