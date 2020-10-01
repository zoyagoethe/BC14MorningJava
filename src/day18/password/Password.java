package day18.password;

public class Password {
    public static void main(String[] args) {
        System.out.println(genPass(10, "l", "s"));
        System.out.println(genPass(20, "l", "s"));
        System.out.println(genPass(30, "l", "s"));
    }

    private static String genPass(int length, String a, String b) {
        String output = "";
        for (int i = 0; i < length; i++) {
            output = output + getMeLetter(a, b);
        }
        return output;
    }

    private static char getMeLetter(String a, String b) {
        String sourceC = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String sourceDigit = "0123456789";
        String sourceSymbols = "$%@!_-";
        String sourceL = "abcddflikgjdfoigrepoterptgp";
        String sourceAll = sourceC + sourceDigit + sourceSymbols + sourceL;
        if (a.equals("l")) {
            sourceAll = sourceL;
        }
        if (b.equals("s")) {
            sourceAll = sourceAll + sourceSymbols;
        }

        int min = 0;
        int max = sourceAll.length() - 1;
        int result = (int) ((Math.random() * (max - min) + 1) + min);
        char output = sourceAll.charAt(result);
        return output;
    }
}
