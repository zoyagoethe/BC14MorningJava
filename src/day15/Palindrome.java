package day15;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора"));// -> true
        System.out.println(checkPalindrome("поп"));// -> true
        System.out.println(checkPalindrome("школа"));// -> false // алокш
    }

    private static boolean checkPalindrome(String str) {
        String input = "";
        // Удаляем пробелы
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
            }
        }
        input = input.toLowerCase();
        String strReverse = "";

        // записываем в новую переменную задом наперёд
        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);
        }

        // сравниваем посимвольно оригинальную строку и перевернутую.
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
