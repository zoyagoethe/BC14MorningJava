package day16;

public class LotteryTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2)); //→ 10
        System.out.println(redTicket(2, 2, 1)); //→ 0
        System.out.println(redTicket(0, 0, 0)); //→ 5
        System.out.println(redTicket(1, 1, 1)); //→ 5
        System.out.println(redTicket(0, 1, 2)); //→ 1
    }

    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a){
            return 1;
        } else {
            return 0;
        }
    }
}
