package day_3;

public class Day3 {
    public static void main(String[] args) {
        //Найти площадь и периметр квадрата
        //Найти площадь и периметр прямоугольника
        //Найти площадь и периметр куба
        /*Найти количество зёрен на шахматной доске,
        если на первую клетку положить одно зёрнышко,
        на вторую клетку два зёрнышка, на третью в два раза больше,
        чем на предыдущей, то есть четыре и так далее.
        */
        int firstSide = 10;
        int secondSide = 20;
        int firstSecondSide = 26;
        findRektangleSquare(firstSide,secondSide);
        findRektanglePerimeter(firstSide,secondSide);
        findCubeSquare(firstSecondSide);
        findCubePerimeter(firstSecondSide);
    }

    public static void findRektangleSquare(int a, int b) {
        System.out.println(a*b);
    }
    public static void findRektanglePerimeter(int a, int b) {
        System.out.println(2*a+b);
    }

    public static void findCubeSquare(int c) {
        System.out.println(6*c*c);
    }

    public static void findCubePerimeter(int c) {
        System.out.println(12*c);
    }

}
