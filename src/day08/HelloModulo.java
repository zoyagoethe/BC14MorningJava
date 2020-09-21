package day08;

public class HelloModulo {
    public static void main(String[] args) {
        System.out.println(56 / 24);  // целая двойка
        System.out.println(56 % 24);  // то что осталось после деления
        int a = 5;
        int b = 3;
        a %= b;
        System.out.println(a);
    }
}
