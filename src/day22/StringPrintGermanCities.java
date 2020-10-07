package day22;

import java.util.Arrays;

public class StringPrintGermanCities {
    public static void main(String[] args) {
        String[] myCities = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Potsdam"
                };
        System.out.println(Arrays.toString(myCities));
        myPrintStringArray(myCities);
        myPrintForI(myCities);
        myColorPrintStringArray(myCities);
    }

    public static void myColorPrintStringArray(String[] arr) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        System.out.print(ANSI_YELLOW_BACKGROUND + "[ " + ANSI_RESET);
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(ANSI_RED + ANSI_CYAN_BACKGROUND + arr[i] + ", " + ANSI_RESET);
            } else {
                System.out.print(ANSI_GREEN + arr[i] + ", " + ANSI_RESET);
            }
        }
        System.out.print(ANSI_PURPLE_BACKGROUND + arr[arr.length - 1] + ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + " ]" + ANSI_RESET);
    }

    public static void myPrintForI(String[] myCities) {
        System.out.print("[ ");
        for (int i = 0; i < myCities.length - 1; i++) {
            System.out.print(myCities[i] + ", ");
        }
        System.out.print(myCities[myCities.length - 1]);
        System.out.println(" ]");
    }

    public static void myPrintStringArray(String[] input) {
        System.out.print("[ ");
        for (String element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }
}
