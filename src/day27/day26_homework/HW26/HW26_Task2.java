package day26.HW26;

public class HW26_Task2 {
    public static void main(String[] args) {
        //1. Берём инпут двух строк
        //2. Делаем их слова все маленькими буквами
        //3. Сравниваем, если они заканчиваются одинаково
        System.out.println(endOther("Hiabc", "abc")); //→ true
        System.out.println(endOther("AbC", "HiaBc")); //→ true
        System.out.println(endOther("abc", "abXabc")); //→ true
    }

    private static boolean endOther(String a, String b) {
        String first = a.toLowerCase();
        String second = b.toLowerCase();
        /*if (a.indexOf(b) != 0) {
            return false;
        } else {
            return true;
        } */
        if (first.endsWith(second) && second.endsWith(first)) ;
        return true;
    }
}

