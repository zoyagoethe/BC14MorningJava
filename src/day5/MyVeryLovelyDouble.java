package day5;

public class MyVeryLovelyDouble {
    public static void main(String[] args) {
/*        double d1 = 5.151515;
        double d2 = 7.171717;
        System.out.println("Округлённое число - " + myRound(d1));
        System.out.println("Округлённое число - " + myRound(d2));
        System.out.println("Округлённое число - " + myRound(3.13131313));*/
        test();
    }

    private static void test() {
        double number = 6.161616161;
        double temp01 = number * 100.0;
        System.out.println(temp01);
        int temp02 = (int) temp01;
        System.out.println(temp02);
        double temp03 = temp02 / 100.0;
        System.out.println(temp03);
    }

    private static double myRound(double number) {
        double result = 0.0;
        // 0. Инпут - 5.151515
        // 1. Умножить на коэффициент 100  -- 515.1515
        // 2. Отрезать дробную часть - 515
        // 2.5  С наскока не получилось, надо преобразовать в дробь
        // 3. Снова разделить 100 - 5.15
        double temp01 = number * 100;
        // System.out.println(temp01);
        int temp02 = (int) temp01;
        // System.out.println(temp02);
        double temp03 = temp02;
        // System.out.println(temp03);
        result = temp03 / 100;

        return result;
    }
}
