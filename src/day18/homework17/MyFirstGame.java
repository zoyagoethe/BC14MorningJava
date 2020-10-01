package day18.homework17;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        Scanner eingabe = new Scanner(System.in);
        int min = 1;
        int max = 50;
        int number = (int) (Math.random() * (max - min) + 1) + min;
        int tryCount = 1;

        System.out.println("Угадай мной загаданное число: ");
        int guessNumber = customerInput();

        while (guessNumber != number) {
            if (guessNumber < number) {
                System.out.println(ANSI_RED + "Моё число больше" + ANSI_RESET);
            } else {
                System.out.println("Моё число меньше, кожаный мешок!");
            }
            System.out.println("Введите новое число: ");
            guessNumber = customerInput();
            tryCount++;
        }

        System.out.println(ANSI_GREEN + "Вы выиграли" + ANSI_RESET);

        System.out.println("Количество попыток " + tryCount);
        System.out.println("Загаданное число " + number);
        eingabe.close();
    }

    private static int customerInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
