package day26;

/**
 * BC14MorningJava
 * 13 10 : 43
 */
public class MyBreak {
    public static void main(String[] args) {
       boolean permission = true;
       boolean notPermission = false;
       //quarantine(permission);
       quarantine(notPermission);
    }

    public static void quarantine(boolean quarant) {
        quarantineZone:
        {
            if (quarant) {
                break quarantineZone;
            }
            System.out.println("Мы в карантине");
        }
    }
}
