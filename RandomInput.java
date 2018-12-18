package StringTransformer;
import java.util.Random;

public class RandomInput {

    private static Random random = new Random();
//    private static int caseNumber = random.nextInt((10));  // generating case number 0-9. 0 to 1st String method, 1 to 2nd method and so on.

    public static String inputGenerator() {
        String result = "";
        int ranNum = randomNumber(); // Random number
        String ranStr1 = randomString(); // Random String for input 1
        String ranStr2 = randomString(); // Random String for input 2

        switch (random.nextInt(10)) { // Generating case number every time inputGenerator() is executed
            case 0:
                result += "endOther<SEP>" + ranStr1 + "<SEP>" + ranStr2;
                break;
            case 1:
                result += "mixString<SEP>" + ranStr1 + "<SEP>" + ranStr2;
                break;
            case 2:
                result += "repeatEnd<SEP>" + ranStr1 + "<SEP>";
                while (ranNum > ranStr1.length()) {
                    ranNum = new Random().nextInt(10);
                }
                result += ranNum;
                break;
            case 3:
                result += "repeatFront<SEP>" + ranStr1 + "<SEP>";
                while (ranNum > ranStr1.length()) {
                    ranNum = new Random().nextInt(10);
                }
                result += ranNum;
                break;
            case 4:
                result += "repeatSeparator<SEP>" + ranStr1 + "<SEP>" + ranStr2 + "<SEP>";
                while (ranNum > ranStr1.length() && ranNum > ranStr2.length()) {
                    ranNum = new Random().nextInt(10);
                }
                result += ranNum;
                break;
            case 5:
                result += "withoutString<SEP>" + ranStr1 + "<SEP>" + ranStr2;
                break;
            case 6:
                result += "sumNumbers<SEP>" + ranStr1;
                break;
            case 7:
                result += "countTriple<SEP>" + ranStr1;
                break;
            case 8:
                result += "sumDigits<SEP>" + ranStr1;
                break;
            case 9:
                result += "sameEnds<SEP>" + ranStr1;
                break;
        }
        return result;
    }

//    public static String repeatNTimes(int number) {
//
//        if (number != 0) {
//            String result = inputGenerator();
//            number--;
//            return result;
//        }
//        return repeatNTimes(number);
//    }

    public static String randomString() {
        Random random = new Random();
        String result = "";

        for (int i = 0; i <= new Random().nextInt(10); i++) {
            result +=  new Random().nextInt(10) > 7 ? random.nextInt(10) : "" + (char)(97 + random.nextInt(26)); // if StringOrNumber is 8 or 9, print random number or if it is 0-7 print character
        }
        return result;
    }

    public static int randomNumber() {
        return new Random().nextInt(5);  // random int can be 0 - 4

    }
}
