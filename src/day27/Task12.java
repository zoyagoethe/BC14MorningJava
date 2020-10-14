package day27;

public class Task12 {
    public static void main(String[] args) {
/*
1. To define if we have 'xyz'
2. Find out where 'xyz' is located
3. Find ot the amount of chars before 'xyz'
4. Find ot the amount of chars AFTER 'xyz'
 */
        System.out.println(xyzMiddle("AAxyzBB")); // → true
        System.out.println(xyzMiddle("AxyzBB")); // → true
        System.out.println(xyzMiddle("AxyzBBB")); // → false
    }

    private static boolean xyzMiddle(String input) {
        String xyz = "xyz";
        int xyzStart = input.indexOf(xyz);
        int xyzEnd = xyzStart + 2;
        int countSymbolsStart = xyzStart;
        int countSymbolsEnd = input.length() - xyzEnd - 1;
        int difference = Math.abs(countSymbolsStart - countSymbolsEnd);
        if (difference <= 1) {
            return true;
        }
        return false;
    }
}
