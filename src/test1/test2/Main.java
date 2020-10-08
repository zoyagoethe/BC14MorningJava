package test1.test2;

public class Main {
    public static void main(String[] args) {
        // print char array
        char[] data = new char[]{'a', 'y', '*', '§'};
        //printMeCharArray(data);
        //printMeCharArrayTwo(data);
        printMeCharArrayColour(data);
    }

    private static void printMeCharArrayColour(char[] input) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        System.out.print("Colourful chars" + "[ ");

        for (int i = 0; i < input.length - 1; i++) {
            String temp = "" + input[i];
            System.out.print(ANSI_GREEN + temp + ", " + ANSI_RESET);

        }


        System.out.print(ANSI_YELLOW_BACKGROUND + input[input.length - 1] + ANSI_RESET);
        System.out.println(" ]");
    }
}
