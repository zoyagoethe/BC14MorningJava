package day15;

public class Chessboard {
    public static void main(String[] args) {
        displayChessboard(8);
    }

    public static boolean checkOdd(int number) {
        return number % 2 == 0;
    }

    private static void displayChessboard(int number) {
        char symbol1, symbol2;
        symbol1 = '*';
        symbol2 = '_';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (checkOdd(i) && !checkOdd(j) || !checkOdd(i) && checkOdd(j)) {
                    System.out.print(symbol1);
                } else {
                    System.out.print(symbol2);
                }

            }
            System.out.println();
        }
    }
}
