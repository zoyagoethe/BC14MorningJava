package day15;

public class MyLovelyOperator {
    public static void main(String[] args) {
        //ifReview();
        myTernar();
// переменная = (булево выражение) ? значение если да : значение если нет
    }

    private static void myTernar() {
        String result = (5 > 10) ? "Da" : "Net";
        System.out.println(result);
    }

    private static void ifReview() {
        boolean mamaPermission = true;
        if (mamaPermission) {
            System.out.println("Я поеду в пионерский лагерь");
        } else {
            System.out.println("Я  не поеду в пионерский лагерь");
        }
    }

}
