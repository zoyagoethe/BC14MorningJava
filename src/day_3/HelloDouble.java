package day_3;

public class HelloDouble {
    public static void main(String[] args) {
        //double - десятичные дроби
        double a = 5.0, b, c, d;
        b = 3.0;
        c = 7.0;
        d = a / c;

        System.out.println(d);

        int var1 = 3; //целое число
        int var2 = 5; //целое число
        double var3 = var1 / var2; //целые числа делятся = 0, затем double добавляет к 0 - *.0

        System.out.println(var3);
    }
}
