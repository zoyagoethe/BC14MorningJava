package day17;

public class Exercise14_1 {
    public static void main(String[] args) {
        System.out.println(doubleChar("The")); // → "TThhee"
        System.out.println(doubleChar("AAbb")); // → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // → "HHii--TThheerree"

        System.out.println(countCode("aaacodebbb")); // → 1
        System.out.println(countCode("codexxcode")); // → 2
        System.out.println(countCode("cozexxcope"));// → 2
    }

    private static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'o' && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    private static String doubleChar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + input.charAt(i) + input.charAt(i);
        }
        return output;
    }
}
