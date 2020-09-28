package day15;

public class TernarOperator {
    public static void main(String[] args) {
        double kelvin = -273;
        String result;
        result = (kelvin > 0) ? "positive" : "negative";
        System.out.println(kelvin + " is " + result);
    }
}
