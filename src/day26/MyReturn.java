package day26;

public class MyReturn {
    public static void main(String[] args) {
        boolean permission = true;
        boolean notPermission = false;
        quarantine(permission);
        quarantine(notPermission);
    }

    public static void quarantine(boolean quarant) {
        quarantineZone:
        {
            if (quarant) {
                return; // выход из программы
                // break quarantineZone;
            }
            System.out.println("Мы в карантине");
        }
    }
}
