package day22;

public class MyLovelyFactorial {
    public static void main(String[] args) {
/*        System.out.println(getFactorial(7)); // 120*6*7
        System.out.println(getFactorial(5)); // ожидаю 120*/

        //System.out.println(getFactorialRecursion(7));
        System.out.println(getFactorialRecursion(5));
        // 100! = 99! * 100;
        // 7! = 7 * 6!
        // 6! = 6 * 5!
        // 2! = 2 * 1
    }

    private static int getFactorialRecursion(int number) {
        if (number < 1) {
            return 1;
        } else {
            return number * getFactorialRecursion(number - 1);
        }
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            // result = result * i;
            result *= i;
        }
        return result;
    }

    public static int findSinusTest(int angle) {

        return 0;
    }
}
