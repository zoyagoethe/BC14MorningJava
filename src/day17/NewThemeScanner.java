package day17;

import java.util.Scanner;

public class NewThemeScanner {
    public static void main(String[] args) {
        //myPrint();
        myScanner();
    }

    private static void myScanner() {
        Scanner input = new Scanner(System.in);
        int x;
        String s;
        System.out.println("Введите цифру");
        x = input.nextInt();
        System.out.println("Введите строковый литерал");
        s = input.next();

        System.out.println("вы ввели");
        System.out.println(x);
        System.out.println(s);
        input.close();
    }

    private static void myScannerTwo() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("А сикока цибе лет? ");
        old = input.nextInt();
        while (old < 18) {
            System.out.println("Не продаём алкоголь подросткам? " +
                    "\n введите правильный возраст ");
            old = input.nextInt();
        }
        System.out.println("Продажа алкоголя возможна");
        input.close();
    }

    private static void myScannerOne() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("А сикока цибе лет? ");
        old = input.nextInt();
        if (old < 18) {
            System.out.println("Позовите своих родителей");
        } else {
            System.out.println("Добро пожаловать на сайте");
        }
        input.close();
    }

    private static void myPrint() {
        System.out.println();
        System.out.print("dfsd");
        //System.out.printf("dfsd", "edfwsd");
    }
}
