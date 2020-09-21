package day05;

public class Salary {
    public static void main(String[] args) {
        salaryOldWay();
        System.out.println(salaryNewWay(1000.0, 1.3));
    }

    private static double salaryNewWay(double hours, double k) {
        double minimalEuroPerHour = 9.26;  // минимальная зарплата в Германии
        double result = hours * k * minimalEuroPerHour;
        return result;
    }

    private static void salaryOldWay() {

        // Даны часы в месяц и данн коэффициент к зарплате и минимальная зарплата, посчитайте зп за месяц
        // Сидоров
        double hourSidorov = 100.5;
        double kSidorov = 1.9;

        // Петров


        double hourPetrov = 155.5;
        double kPetrov = 1.1;

        // sidorov
        findMySalary(hourSidorov, kSidorov);

        // petrov
        findMySalary(hourPetrov, kPetrov);

        // васечкин
        findMySalary(150, 1.5);

    }

    private static void findMySalary(double hours, double k) {
        double minimalEuroPerHour = 9.26;  // минимальная зарплата в Германии
        double result = hours * k * minimalEuroPerHour;
        System.out.println(
                "Зарплата за месяц " + result
                        + " .При выработке в " + hours
                        + " и коэффициенте " + k);
    }
}
