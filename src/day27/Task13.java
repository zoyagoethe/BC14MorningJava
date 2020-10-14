package day27;

public class Task13 {
    public static void main(String[] args) {

        System.out.println(oneTwo("abc")); //→ "bca"
        System.out.println(oneTwo("tca")); //→ "cat"
        System.out.println(oneTwo("tcagdo")); //→ "catdog"
    }

    private static String oneTwo(String input) {
        String result = "";
        for (int i = 0; i < input.length() - 2; i += 3) {
            result += input.substring(i + 1, i + 3) + input.charAt(i);
        }
        return result;
    }
}
