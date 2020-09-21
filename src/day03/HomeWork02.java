package day03;

public class HomeWork02 {
    public static void main(String[] args) {
        int squareSide1 = 10;
        int squareSide2 = 15;
        square(squareSide1, squareSide2);
        perimeter(squareSide1, squareSide2);
    }
    public static void square (int a, int b) {
        System.out.println("Площадь прямоугольника равна - " + a * b);
    }
    public static void perimeter (int a, int b) {
        System.out.println("Периметр прямоугольника равен - " + (a + b)*2);
    }
}
