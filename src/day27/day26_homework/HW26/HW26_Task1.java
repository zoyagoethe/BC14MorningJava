package day26.HW26;

public class HW26_Task1 {
    public static void main(String[] args) {
// Task 1:
// Return the number of times that the string "hi"
// appears anywhere in the given string.

        // 1. Count the length with fori
        //2. Find the word "hi" in the string
        //3. Count "hi" words appearance with count++

        System.out.println(countHi("abc hi ho")); //→ 1
        System.out.println(countHi("ABChi hi")); //→ 2
        System.out.println(countHi("hihi")); //→ 2

        // Task 2:
        // Учитывая две строки, вернуть истину, если одна из строк
        // появляется в самом конце другой строки,
        // игнорируя верхний / нижний регистр

        //
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i+1)== 'i') {
                count ++;
            }
        }
        return count;
    }
}
