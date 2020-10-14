package day26.hw_Nadja;

public class HomeWork26 {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2

        System.out.println("********************************");
        System.out.println(endOther("Hiabc", "abc")); //→ true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(endOther("abc", "abXabcSS"));// → false

        System.out.println("********************************");
        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false

        System.out.println("***14 file - String 21****");
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1YX845YX", "YX"));//185
    }

    private static boolean xyBalance(String str) {
        int numberX = 0;
        int numberY = 0;
        char symbX = 'x';
        char symbY = 'y';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbX) {
                numberX++;
            }
            if (str.charAt(i) == symbY && numberX != 0) {
                numberY++;
            }
        }
        return (numberX >= numberY && numberY != 0);
    }

    private static boolean endOther(String str, String searchStr) {
        String inputStr = str.toLowerCase();
        String inputSearch = searchStr.toLowerCase();
        return (inputStr.endsWith(inputSearch) || inputSearch.endsWith(inputStr));
    }

    private static int countHi(String str) {
        String searchStr = "hi";
        int num = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == searchStr.charAt(0)) {
                if (i != str.length() - 1 && str.charAt(i + 1) == searchStr.charAt(1)) {
                    num++;
                }
            }
        }
        return num;
    }

    private static String wordEnds(String str1, String str2) {
        String output = "";
        for (int i = 0; i < str1.length(); i++) {
            if (i != str1.length() - 1) {
                if (str1.charAt(i) == str2.charAt(0) && str1.charAt(i + 1) == str2.charAt(1)) {
                    if (i > 0) {
                        output += str1.charAt(i - 1);
                    }
                    if (i < str1.length() - 3) {
                        output = output + str1.charAt(i + 2);
                    }
                }
            }
        }
        return output;
    }
}
