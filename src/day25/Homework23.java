package day25;

public class Homework23 {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"

        //System.out.println(getSandwich("breadjambread"));// → "jam"
        //System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        //System.out.println(getSandwich("xxbreadyy"));// → ""

        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
    }

    private static String zipZap(String str) {
        String output = str;
        for (int i = 1; i < output.length() - 1; i++) {
            if (output.charAt(i - 1) == 'z' && output.charAt(i + 1) == 'p') {
                output = output.substring(0, i) + output.substring(i + 1);
            }
        }
        return output;
    }

    private static String getSandwich(String input) {
        String output = "";
        int indexStart = 0;
        String word = "bread";
        indexStart = input.indexOf(word);
        int indexEnd = input.lastIndexOf(word);
        return output;
    }

    private static String repeatSeparator(String word, String sep, int number) {
        String output = "";
        for (int i = 0; i < number - 1; i++) {
            output += word + sep;
        }
        output += word;
        return output;
    }
}
