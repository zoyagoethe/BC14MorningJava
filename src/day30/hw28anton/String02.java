package day30.hw28anton;

public class String02 {
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true
        split();
        System.out.println(xyzThere("abcxyz"));// → true
        System.out.println(xyzThere("abc.xyz"));// → false
        System.out.println(xyzThere("xyz.abc"));// → true
        split();
        System.out.println(mixString("abc", "xyz"));// → "axbycz"
        System.out.println(mixString("Hi", "There"));// → "HTihere"
        System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"
    }

    private static String mixString(String str1, String str2) {
        String output = "";
        int size1 = str1.length();
        int size2 = str2.length();
        for (int i = 0; i < Math.max(size1, size2); i++) {
            if (size1 > 0 && i < size1) {
                output += str1.charAt(i);
            }
            if (size2 > 0 && i < size2) {
                output += str2.charAt(i);
            }
        }
        return output;
    }

    private static boolean xyzThere(String str) {
        String xyz = "xyz";
        char dot = '.';
        if (str.contains(xyz) &&
                !(str.indexOf(xyz) > 0 && str.charAt(str.indexOf(xyz) - 1) == dot)) {
            return true;
        }
        return false;
    }

    private static void split() {
        System.out.println("----------------------");
    }

    private static int countAppereance(String str, String wordToCount) {
        int count = 0;
        String remainder = str;
        while (remainder.contains(wordToCount)) {
            count++;
            remainder = remainder.substring
                    (remainder.indexOf(wordToCount) + wordToCount.length());
        }
        return count;
    }

    private static boolean catDog(String str) {
        return countAppereance(str, "dog")
                == countAppereance(str, "cat");
    }
}
