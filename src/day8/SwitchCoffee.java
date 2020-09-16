package day8;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button = 5; // номер кнопки в вендингмашине
        vendingMachine(button);
    }

    public static void coffeeWithMilk() {
        System.out.println("Вода кипятится");
        System.out.println("Кофе мелется");
        System.out.println("Сливки добавляются");
    }

    private static void vendingMachine(int customerChoose) {
        switch (customerChoose) {
            case 1:
                System.out.println("Кофе американо готовится");
                break;
            case 2:
                System.out.println("Кипяток кипятится");
                break;
            case 3:
                System.out.println("Кофе эспрессо готовится");
                break;
            case 4:
                System.out.println("Какао уже в пути");
                break;
            case 5:
                coffeeWithMilk();
                break;
            default:
                System.out.println(
                        "Повторите пожалуйста свой выбор," +
                                " напиток под номером " + customerChoose
                                + " временно недоступен");
                break;
        }
        System.out.println("программа отработана без ошибок");
    }
}
