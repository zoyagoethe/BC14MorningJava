package day17;

public class String3 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob")); //→ true
        System.out.println(bobThere("b9b")); //→ true
        System.out.println(bobThere("bac")); //→ false
    }

    private static boolean bobThere(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}

