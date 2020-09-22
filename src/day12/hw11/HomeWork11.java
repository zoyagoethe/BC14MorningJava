package day12.hw11;

/*
11 лист; задачи 12,13,14
 */
public class HomeWork11 {
    public static void main(String[] args) {
/*        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21*/

/*        System.out.println(in1To10(5, false));//   →true
        System.out.println(in1To10(11, false));// →false
        System.out.println(in1To10(11, true));// →true*/
/*        System.out.println(old35(3)); //→ true
        System.out.println(old35(10)); //→ true
        System.out.println(old35(15)); //→ false*/
        System.out.println(leapYear(1900)); // false
        System.out.println(leapYear(2000)); // true
        System.out.println(leapYear(2020)); // true
        System.out.println(leapYear(2019)); // false
        System.out.println(leapYear(2296)); // true
        System.out.println(leapYear(1984)); // true
    }

    private static boolean leapYear(int year) {
        return (year % 400 == 0)
                | (year % 4 == 0
                ^ year % 100 == 0); //&& year % 100 != 0);
    }

    private static boolean leapYearOne(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    private static boolean old35(int number) {
        return number % 5 == 0 ^ number % 3 == 0;
    }

    private static boolean old35One(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return false;
        } else if (number % 5 == 0 || number % 3 == 0) {
            return true;
        }
        return false;
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        return (n >= 1 && n <= 10) || outsideMode;
    }

    private static boolean in1To10One(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10) {
            return true;
        } else if (n <= 1 || n >= 10 && outsideMode) {
            return true;
        } else {
            return false;
        }
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    private static int sortaSumOne(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;
    }
}
