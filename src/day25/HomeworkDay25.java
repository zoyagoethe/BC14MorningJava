package day25;

public class HomeworkDay25 {
    public static void main(String[] args) {
        String input = " An apple a day keeps a doctor away ";
        String newInput = " an apple a day keeps a doctor away ";

        exampleCharAt(input); // позволяет взять любой символ из строки и записать в чар
        exampleCodePointAt(input); // выдает заданный символ из строки в кодировке юникода
        exampleCodePointBefore(input); // выдает индекс перед заданным символом из строки в кодировке юникода
        exampleCodePointCount(input);
        // выдает количество символов в указанном промежутке строки
        exampleCompareToIgnoreCase(input, newInput);
        // сравнивает лексикографическое значение заданного символа/слова (согласно кодировке юникода побуквенно) ингнорируя написание букв
        exampleConcat(input, newInput); // позволяет сложить 2 строки вместе
        exampleContains(input); // позволяет определить содержит ли строка заданный символ/слово
        exampleEndsWith(input); // определяет заканчивается ли слово с заданного символа/ов (boolean)
        exampleEquals(input, newInput); // сравнивает две строки
        exampleEqualsIgnoreCase(input, newInput); // сравнивает две строки игнорируя написание букв
        exampleIndexOf(input); // выдает индекс заданного символа/слова в строке, с которого начинается
        exampleIsEmpty(input); // позволяет проверить есть ли в строке пустое значение
        exampleLength(input); // определяет длину слова
        exampleReplace(input); // заменяет один символ на другой
        exampleStartsWith(input); // определяет начинается ли слово с заданного символа/ов (boolean)
        exampleSubstring(input); // обрезает и выводит часть слова с заданного индекса
        exampleToLowerCase(input); // делает все заглавные буквы маленькими
        exampleToUpperCase(input); // делает все буквы заглавными
        exampleTrim(input); //обрезает пробелы по бокам

        //charArray не поняла применения :-(
    }

    private static void exampleTrim(String input) {
        System.out.println("Trim: " + input.trim());
    }

    private static void exampleToUpperCase(String input) {
        System.out.println("ToUpperCase: " + input.toUpperCase());
    }

    private static void exampleToLowerCase(String input) {
        System.out.println("ToLowerCase: " + input.toLowerCase());
    }

    private static void exampleSubstring(String input) {
        System.out.println("Substring: " + input.substring(22));
    }

    private static void exampleStartsWith(String input) {
        System.out.println("StartsWith: " + input.startsWith(" An"));
    }

    private static void exampleReplace(String input) {
        System.out.println("Replace: " + input.replace('a', 'f'));
    }

    private static void exampleLength(String input) {
        System.out.println("Length: " + input.length());
    }

    private static void exampleIsEmpty(String input) {
        System.out.println("IsEmpty: " + input.isEmpty());
    }

    private static void exampleIndexOf(String input) {
        System.out.println("IndexOf: " + input.indexOf("apple"));
    }

    private static void exampleEqualsIgnoreCase(String input, String newInput) {
        System.out.println("EqualsIgnoreCase: " + input.equalsIgnoreCase(newInput));
    }

    private static void exampleEquals(String input, String newInput) {
        System.out.println("Equals: " + input.equals(newInput));
    }

    private static void exampleEndsWith(String input) {
        System.out.println("EndsWith: " + input.endsWith("away "));
    }

    private static void exampleContains(String input) {
        System.out.println("Contains: " + input.contains("apple"));
    }

    private static void exampleConcat(String input, String newInput) {
        System.out.println("Concat: " + input.concat(newInput));
    }

    private static void exampleCompareToIgnoreCase(String input, String newInput) {
        System.out.println("CompareToIgnoreCase: " + input.compareToIgnoreCase(newInput));
    }

    private static void exampleCodePointCount(String input) {
        System.out.println("CodePointCount: " + input.codePointCount(3, 10));
    }

    private static void exampleCodePointBefore(String input) {
        System.out.println("CodePointBefore: " + input.codePointBefore(24));
    }

    private static void exampleCodePointAt(String input) {
        System.out.println("CodePointAt: " + input.codePointAt(24));
    }

    private static void exampleCharAt(String input) {
        System.out.println("CharAt: " + input.charAt(1));
    }
}
