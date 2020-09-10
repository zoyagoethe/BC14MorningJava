package day3.hw3;

public class MyLovelyBank {
    public static void main(String[] args) {
        //Если клиент положил в банк 1000€ под 3,5%,
        // какая сумма будет его ждать через семь лет?
        int customerYear = 15;
        bankAccount(500, customerYear, 3.5);
        findSquare();
    }

    private static void findSquare() {
    }

    private static void bankAccount(double money, int year, double interest) {
        double result = interest * year * money / 100 + money;
        System.out.println("Сумма в конце вклада " + result);
    }
}
