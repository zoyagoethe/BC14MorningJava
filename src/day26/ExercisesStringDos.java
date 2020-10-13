package day26;

public class ExercisesStringDos {
    public static void main(String[] args) {
       /* System.out.println(wordEnds("abcXY123XYijk", "XY"));// →"c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// →"13"
        System.out.println(wordEnds("XY1XY", "XY"));// →"11"
        // System.out.println(wordEnds("XY1XY", "XY"));//
        // wordstr -  2 simwola
        // 1. Найти место (любое) в первом стринге, где встречается наш патерн
        // 2. Обращаемся к элементам до и элементам после
        // Конкатинируем нуженые элементы.*/

        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az")); //→ true  false
    }

    private static boolean sameStarChar(String input) {
        char star = '*';
        for (int i = 0; i < input.length(); i++) {
            if ((i == 0 || i == input.length() - 1)
                    && input.charAt(i) == star) {
                return false;
            } else if (input.charAt(i) == star
                    && input.charAt(i - 1) != input.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static String wordEnds(String str1, String wordStr) {
        String output = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == wordStr.charAt(0)
                    && str1.charAt(i + 1) == wordStr.charAt(1)) {
                if (i > 0) {
                    output = output + str1.charAt(i - 1);
                }
                if (i < str1.length() - 3) {
                    output = output + str1.charAt(i + 2);
                }
            }
        }
        return output;
    }
}

/* если у нас придёт на день рождения 15 человек{
        если будет 10 парней{
        то надо 10 бутылок водки
        }
        если придёт 10 девушек{
        то 10 шоколадок
        }
}

*/
