package StringTransformer;

public class StringMethod {
    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() >= b.length()
                && a.substring(a.length() - b.length(), a.length()).equals(b)) {
            return true;
        }
        if (b.length() >= a.length()
                && b.substring(b.length() - a.length(), b.length()).equals(a)) {
            return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        int len = Math.min(a.length(), b.length());
        String result = "";
        for (int i=0; i<len; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }
        if (a.length() > b.length()) result = result + a.substring(len);
        else if (a.length() < b.length()) result = result + b.substring(len);
        return result;
    }

    public static String repeatEnd(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result += str.substring(str.length()-n);
        }
        return result;
    }

    public static String repeatFront(String str, int n) {
        if (n == 0) return "";
        String result = "";
        int times = n;
        for (int i=0; i<times; i++) {
            result += str.substring(0, n);
            n -= 1;
        }
        return result;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count == 0) return "";
        for (int i=0; i<count-1; i++) {
            result += word + sep;
        }
        return result + word;
    }


    public static String withoutString(String base, String remove) {
        int baseLength = base.length();
        String baseTemp = base.toLowerCase();
        String removeTemp = remove.toLowerCase();
        int removeLength = remove.length();
        String result = "";

        for (int i=0; i<baseLength; i++) {
            if (baseTemp.substring(i).startsWith(removeTemp)) i += removeLength - 1;
            else result += base.charAt(i);
        }
        return result;
    }

    public static int sumNumbers(String str) {
        String yDigit = "";
        int result = 0;
        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                yDigit += str.charAt(i);
                if (i == str.length()-1 || !Character.isDigit(str.charAt(i+1))) {
                    result += Integer.parseInt(yDigit);
                    yDigit = "";
                }
            }
        }
        return result;
    }

    public static int countTriple(String str) {
        int count = 0;
        for (int i=0; i<=str.length()-3; i++) {
            if (str.length() >= 3) {
                if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.substring(i, i+1));
        }
        return sum;
    }

    public static String sameEnds(String string) {
        String result = "";
        for (int i=0; i<string.length(); i++) {
            for (int j=i; j<string.length(); j++) {
                if (string.substring(0, i).equals(string.substring(j, string.length()))) {
                    result = string.substring(0, i);
                }
            }
        }
        return result;
    }

}
