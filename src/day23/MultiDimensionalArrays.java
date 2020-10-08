package day23;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //magicMonth();
        simpleTable();
    }

    private static void simpleTable() {
        String[][] myArray = new String[5][3];

        myArray[0][0] = "1";
        myArray[0][1] = "Матвеев";
        myArray[0][2] = "№3482394832";

        myArray[1][0] = "2";
        myArray[1][1] = "Сидоров";
        myArray[1][2] = "№34564532";

        myArray[2][0] = "3";
        myArray[2][1] = "Петров";
        myArray[2][2] = "№432832";

        myArray[3][0] = "4";
        myArray[3][1] = "Матвеев";
        myArray[3][2] = "№3482394832";

        myArray[4][0] = "5";
        myArray[4][1] = "Васечкин";
        myArray[4][2] = "№879679";
        printTwoDStringArray(myArray);
    }

    private static void printTwoDStringArray(String[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length ; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
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
