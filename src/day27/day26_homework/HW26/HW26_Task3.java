package day26.HW26;

public class HW26_Task3 {
    public static void main(String[] args) {
        /* Return true if the given string is xy-balanced. */
        // 1. Узнаём первую позицию 'Х'
        //2. Начинаем пробегать циклом по символам от Х до конца строки
        //3. Проверяем если после 'Х', где-то в строке есть 'Y'
        //4. Если находим 'Y' - возвращаем тру

        System.out.println(xyBalance("aaxbby")); //→ true
        System.out.println(xyBalance("aaxbb")); //→ false
        System.out.println(xyBalance("yaaxbb")); //→ false
    }

    private static boolean xyBalance(String input) {
        int xPosition = input.indexOf('x');
        for (int i = xPosition; i < input.length(); i++) {
            if (input.charAt(i) == 'y') {
                return true;
            }
        }
        return false;
    }
}
