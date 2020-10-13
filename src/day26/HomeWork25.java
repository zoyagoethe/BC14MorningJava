package day26;

public class HomeWork25 {
    public static void main(String[] args) {
        // codePointCount(int beginIndex, int endIndex)
        // toCharArray()
        String test = "Вааасилий";
        //System.out.println(test.codePointCount(2, 5));
        printCharArray(magicCharArray());
    }

    private static char[] magicCharArray() {
        String hausmaster = "Василий";
        char[] myNewArray = hausmaster.toCharArray();
        return myNewArray;
    }

    public static void printCharArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
    }
}
