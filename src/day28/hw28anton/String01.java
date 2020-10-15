package day28.hw28anton;

public class String01 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""
        split();
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
    }

    private static String nTwice(String str, int number) {
        return str.substring(0, number)
                + str.substring(str.length() - number);
    }

    private static void split() {
        System.out.println("-------------------------------");
    }

    private static String withoutEnd2(String str) {
        String output = "";
        if (str.length() > 1) {
            output = str.substring(1, str.length() - 1);
        }
        return output;
    }
}
