package day02.hw2;

public class HomeWork2 {
    public static void main(String[] args) {
        // 1 . Найти площадь и периметр квадрата
        // 2 . Найти площадь и периметр прямоугольника
        // 3. Найти площадь и периметр куба
        // 4. Найти количество зёрен на шахматной доске,
        // если на первую клетку положить одно зёрнышко,
        // на вторую клетку два зёрнышка, на третью в два раза больше,
        // чем на предыдущей, то есть четыре и так далее.
        int firstSide = 10;
        int secondSide = 20;
        findRectangleSquare(firstSide, secondSide);

        int customerRectangleSideUno = 15;
        int customerRectangleSideDos = 25;
        findRectangleSquare(customerRectangleSideUno, customerRectangleSideDos);
        findRectanglePerimeter(customerRectangleSideUno, customerRectangleSideDos);

        findSquareCube(firstSide);
        findPerimeterCube(firstSide);

        // 4. Найти количество зёрен на шахматной доске,
        // если на первую клетку положить одно зёрнышко,
        // на вторую клетку два зёрнышка, на третью в два раза больше,
        // чем на предыдущей, то есть четыре и так далее.
    }

    private static void findSquareCube(int a) {
        System.out.println(6 * a * a);
    }

    private static void findPerimeterCube(int a) {
        System.out.println(12 * a);
    }

    private static void findRectanglePerimeter(int a, int b) {
        System.out.println(2 * (a + b));
    }

    private static void findRectangleSquare(int сторонаНомерОдин, int сторонаНомерДва) {
        System.out.println("Wenn wir die erste Seite " + сторонаНомерОдин
                + " Wenn die zweite seite " + сторонаНомерДва +
                " Dann ist die Fläche -" + сторонаНомерДва * сторонаНомерОдин);
    }
}
