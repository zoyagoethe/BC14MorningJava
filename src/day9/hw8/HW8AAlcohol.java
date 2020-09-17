package day9.hw8;

public class HW8AAlcohol {
    public static void main(String[] args) {
        int age = 18;
        System.out.println(age);
        System.out.println(sell(age));
    }

    public static String sell(int custmomerAge) {
        String output = " ";
        switch (custmomerAge) {
            case 10:
                output = "NoAlcohol";
                break;
            case 17:
                output = "NoAlcohol";
                break;
            case 18:
                output = "Alcohol-Yes";
                break;
            case 20:
                output = "Alcohol-Yes";
                break;
            case 30:
                output = "Alcohol-Yes";
                break;
            default:
                output = "vozrast ne zadan";

        }
        return output;
    }
}

