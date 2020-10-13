package day26_homework;

import static day06.Classwork2.split;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); // → 1
        System.out.println(countHi("ABChi hi")); // → 2
        System.out.println(countHi("hihi")); // → 2
        split();

        System.out.println(endOther("Hiabc", "abc")); // → true
        System.out.println(endOther("AbC", "HiaBc")); // → true
        System.out.println(endOther("abc", "abXabc")); // → true
        split();

        System.out.println(xyBalance("aaxbby")); // → true
        System.out.println(xyBalance("aaxbb")); // → false
        System.out.println(xyBalance("yaaxbb")); // → false
    }

    private static boolean xyBalance(String balance) {
        int x = balance.indexOf('x');
        int y = balance.indexOf('y');
        for (int i = 0; i < balance.length(); i++) {
            if (x < y) {
                return true;
            }
        }
        return false;
    }

    private static boolean endOther(String str1, String str2) {
        String a = str1.toLowerCase();
        String b = str2.toLowerCase();
        if (a.endsWith(b) || b.endsWith(a)) {
            return true;
        }
        return false;
    }

    private static int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                result++;
            }
        }
        return result;
    }
}
