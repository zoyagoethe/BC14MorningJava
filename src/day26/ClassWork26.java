package day26;

/*
Операторы перехода
 */
public class ClassWork26 {
    public static void main(String[] args) {
        searchFor();
    }

    private static void searchFor() {
        for (int i = 0; i < 20; i++) {
            if (i == 4) {
                break;
                //continue;
            }
            System.out.println("Значение и: " + i);
        }
        System.out.println("Цикл завершён");
    }
}
