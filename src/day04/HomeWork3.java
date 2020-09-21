package day04;

public class HomeWork3 {
    public static void main(String[] args) {
        int r = 5;
        findCircumference(r);
        findCircumference(7);
        findCircumference(10);
        int radiusFromKonstantin = 100;
        findCircumference(radiusFromKonstantin);
        double moneyInEuro = 1000;
        currencyConverter(moneyInEuro, 1.1);
    }

    private static void currencyConverter(double euro, double course) {
        System.out.println(euro * course + " - кол-во долларов, которые мы получили за -" + euro + "€");
    }

    private static void findCircumference(int radius) {
        // L =2PI*R
        double l = 2 * Math.PI * radius;
        System.out.println(l + " - это длина окружности с радиусом - " + radius);
    }
}
