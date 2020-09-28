package day15;

public class PrintDivisors {
    public static void main(String[] args) {
        printDivisors(32);
    }

    private static void printDivisors(int a) {
        int count = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total divisors: " + count);
    }
}
