package day30.hw28anton;

public class String03 {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));// →2
        System.out.println(countYZ("day fez"));// →2
        System.out.println(countYZ("day fyyyz"));// →2
    }

    private static int countYZ(String str) {
        int count = 0;
        char y = 'y';
        char z = 'z';
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == y || str.charAt(i) == z)
                    && (i < str.length() - 1 && !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        if (str.endsWith("" + y) || str.endsWith("" + z)) {
            count++;
        }
        return count;
    }
}
