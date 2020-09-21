package day05;

public class Calculator {
    public static void main(String[] args) {
        //One();
        //concatenation();
        int myLovelyVariable = multiplicationTwo(1, 2, 3, 4);
        System.out.println(myLovelyVariable);
    }

    public static int multiplicationTwo(int a, int b, int c, int d) {
        int result = a * b * c * d;
        System.out.println("НИЧЕГО НЕ ПОНЯТНО, чему равно б  - " + b);
        System.out.println("Резалт - алое, ты где?" + result);
        return result;
    }

    public static void multiplicationOne() {
        System.out.println("Простое перемножение переменных 5 и 6" + 5 * 6);
    }


    private static void concatenation() {
        System.out.println("Тест на плюс и конкатенацию номер 1 : " + 4 + 5);
        System.out.println("Тест на плюс и конкатенацию номер 2 : " + (4 + 5));
        System.out.println("Тест на плюс и конкатенацию номер 2 : " + (4 + 5) + 3);
        System.out.println("Тест на плюс и конкатенацию номер 2 : " + (4 + 5) + (3 + 8));
        int a = 1;
        String s = "1";
        System.out.println(a + 1);
        System.out.println(s + " " + 1);
        System.out.println(s + ' ' + 1);
    }


}
