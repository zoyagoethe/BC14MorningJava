/**
 * @author Kostyantyn Fedorov
 */
package day06;

public class HelloString2 {
    public static void main(String[] args) {
        String poema = "Я памятник воздвиг себе нерукотворный";
        int dlina = poema.length(); //рассчитать длину текста "String poema"
        System.out.println(dlina);
        String preview = poema.substring(0,10); //показать длину текста с 0 до 10 символов
        System.out.println(preview + "...");
        String endPoema = poema.substring(dlina-10); //показать 10 символов с конца
        System.out.println(endPoema);
        char test = poema.charAt(0);
        System.out.println(test);
        char test2 = poema.charAt(dlina-1); //вызов 37 символа
        System.out.println(test2);

        String vasya = "Василий";
        int dlina1 = vasya.length();
        System.out.println(dlina1);
        String pokazatDlinu = vasya.substring(4);
        System.out.println(pokazatDlinu);
    }
}
