package day08;

public class HelloSwitch {
    public static void main(String[] args) {
        int schoolNote = 2;
        System.out.println(bonus(schoolNote));
    }

    private static String bonus(int note) {
        String output = "";
        switch (note) {
            case 5:
                output = "Велосипед";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "Награды не будет";
                break;
            case 2:
                output = "Потерянный час времени и плохое настроение";
                break;
            case 1:
                output = "Лучше и не спрашивайте ";
                break;
            default:
                output = "Такой оценки не существует";
                break;
        }
        return output;
    }
}
