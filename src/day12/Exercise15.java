package day12;

public class Exercise15 {
    public static void main(String[] args) {
        // System.out.println(teenSum(3, 4)); // 7
        // System.out.println(teenSum(10, 13)); // 19
        // System.out.println(teenSum(13, 2)); // 19

        System.out.println(fizzString("fig")); // → "Fizz"
        System.out.println(fizzString("dib")); // → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"

    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }

    }

    private static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }
}
