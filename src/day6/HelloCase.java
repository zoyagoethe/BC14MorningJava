package day6;

public class HelloCase {
    public static void main(String[] args) {
        //helloUppercase();
        //anotherHello();
        String masterName = "Василий";
        int i= 2;
        int j= 5;
        System.out.println(masterName.substring(i,j));

    }

    private static void anotherHello() {
        System.out.println("andrej".toUpperCase());
        String teacher = "Андрей";
        System.out.println(teacher.toUpperCase());
    }

    private static void helloUppercase() {
        String source = "london is the capital of great britain";
        System.out.println(source);
        String phrase2 = source.toUpperCase();
        System.out.println(phrase2);
        String phrase3 = source.substring(0, 1).toUpperCase() // l.туАпперКейс
                + source.substring(1); //ondon is the capital of great britain
        System.out.println(phrase3);
    }
}
