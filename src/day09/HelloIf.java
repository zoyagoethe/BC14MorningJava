package day09;

public class HelloIf {
    public static void main(String[] args) {
        //ifintroductionOne();
        //ifIntroductionTwo();
        //ifIntroductionThree();
        ifIntroductionFor();
    }

    private static void ifIntroductionFor() {
        if(true){
            System.out.println("тогда всё хорошо");
        }

    }

    private static void ifIntroductionThree() {
        int age = 15;
        if (age < 16) {
            System.out.println("Категорически запрещена продажа алкоголя");
        } else if (age >= 16 && age < 18) {
            System.out.println("Слабый алкоголь можно продавать");
            System.out.println("Слабый алкоголь можно продавать");
            System.out.println("Слабый алкоголь можно продавать");
            System.out.println("Слабый алкоголь можно продавать");
            System.out.println("Слабый алкоголь можно продавать");
        } else {
            System.out.println("Можно продавать крепкий алкоголь");
        }
    }

    private static void ifIntroductionTwo() {
        if (3 > 5) {
            System.out.println("Правда");
        } else {
            System.out.println("Кривда");
        }
    }


    private static void ifIntroductionOne() {
        boolean permission = false;
        boolean prohibitionDenyDe = true;
        if (true) {
            System.out.println("Можно поехать в летний лагерь");
        } else {
            System.out.println("На всё лето дома");
        }
    }
}
