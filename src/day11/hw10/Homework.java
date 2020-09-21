package day11.hw10;

public class Homework {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        // findEvenNumber(a, b);
        //System.out.println(findEvenNumberVersionTwo(a, b));
        //findNumberModulo(10, 200, 17);
        System.out.println(checkLeapYear(2020));
    }



    public static boolean checkLeapYear(int year) {
        return year % 4 == 0;
    }

    public static void findNumberModulo(int a, int b, int myModulo) {
        for (int i = a; i < b; i++) {
            if (i % myModulo == 0) {
                System.out.println(i);
            }
        }
    }

    private static void findOddNumber(int start, int end) {
        int evenProof = 2;

        for (int i = start; i <= end; i++) {
            if (i % evenProof != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void findEvenNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static String findEvenNumberVersionTwo(int start, int end) {
        String result = "";
        double d = 0.0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + " " + i;
            }
        }
        return result;
    }
}
