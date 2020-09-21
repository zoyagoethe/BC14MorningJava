package day09;

public class Classwork9 {
    public static void main(String[] args) {
        int speed = 100;
        System.out.println("Vasha skorostj bila " + speed + "km/h");
        if (speed <= 50) {
            System.out.println("Narushenij net.");
        } else if (speed <= 65) {
            System.out.println("Ustnoe porecanie na 5 minut");
        } else if (speed <= 100) {
            System.out.println("Vam straf 40 €");
        } else if (speed <= 130) {
            System.out.println("Vam straf 500 €");
        } else {
            System.out.println("Vam straf 500€ i lishenie voditeljskih prav");
        }

    }
}
