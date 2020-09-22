package test1.test2;

public class Main {
    public static void main(String[] args) {
        System.out.println(yearLeap(2020));
        System.out.println(yearLeap(2021));
        System.out.println(yearLeap(2000));
        System.out.println(yearLeap(1900));
    }
    private static boolean yearLeap(int year) {
        if (year % 4 != 0 || year % 400 != 0 && year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
    private static boolean yearLeap1(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        } else if (year % 100 == 0){
            return false;
        } else {
            return false;
        }
    }
}
