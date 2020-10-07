package day22;

import static day06.Classwork2.split;

public class RecursionExercises {
    public static void main(String[] args) {
        System.out.println(count7(717)); //→ 2
        System.out.println(count7(7)); //→ 1
        System.out.println(count7(123)); //→ 0
        System.out.println(count7(570_7708)); //→ 3
        split();
        System.out.println(bunnyEars2(0)); //→ 0
        System.out.println(bunnyEars2(1)); //→ 2
        System.out.println(bunnyEars2(2)); //→ 5
        System.out.println(bunnyEars2(10)); //→ 25
        System.out.println(bunnyEars2(11)); //→ 27
    }

    private static int count7(int number) {
        if (number == 0) {
            return 0;
        } else if (number % 10 == 7) {
            return 1 + count7(number / 10);
        } else {
            return count7(number / 10);
        }
    }

    private static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        } else if (rabbit == 1) {
            return 2;
        } else if (rabbit == 2) {
            return 5;
        } else {
            return 5 + bunnyEars2(rabbit - 2);
        }
    }
}
