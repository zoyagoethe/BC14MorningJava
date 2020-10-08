package day23;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        magicMonth();
    }

    private static void magicMonth() {
        int[][] monthCalendar;
        monthCalendar = new int[4][7];

        for (int outer = 0; outer < monthCalendar.length; outer++) {
            for (int inner = 0; inner < monthCalendar[outer].length; inner++) {
                monthCalendar[outer][inner] = outer * 7 + inner + 1;
                System.out.print(monthCalendar[outer][inner] + " ");
            }
            System.out.println();
        }
        System.out.println("Computer give me 2,3: " + monthCalendar[2][3]);
    }
}
