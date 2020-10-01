package day18.homework17;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        Scanner eingabe = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int number = (int) (Math.random() * (max - min) + 1) + min;
        System.out.println("Угадай мной загаданное число: ");
        int attempts = eingabe.nextInt();
        if (attempts == number) {
            System.out.println("Вы выиграли");
        } else if (attempts < number) {
            System.out.println("Моё число больше");
        } else {
            System.out.println("Моё число меньше, кожаный мешок!");
        }
        System.out.println(number);

        while (attempts != number) {
            if (attempts < number) {
                System.out.println("Моё число больше");
            } else {
                System.out.println("Моё число меньше, кожаный мешок!");
            }
            System.out.println("Введите новое число: ");
            attempts = eingabe.nextInt();
        }

        eingabe.close();
    }
}
