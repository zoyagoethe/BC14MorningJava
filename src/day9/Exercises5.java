package day9;

public class Exercises5 {
    public static void main(String[] args) {
        //happyPelmen();
        //moduloThree();
        //myLine(100);
        System.out.println(paris(11, 15)); //-> false
        System.out.println(paris(11, 5)); //-> true
    }

    private static boolean paris(int a, int b) {
        if (a + b <= 25) {
            return true;
        } else {
            return false;
        }
        //         return a + b <= 25;
    }

    private static void myLine(int digit) {


    }

    private static void moduloThree() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            }
        }
    }

    private static void happyPelmen() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Мы поймали счастливый пельмень");
                break;
            }
            System.out.println("Шаг цикла " + i);
        }
    }
}
