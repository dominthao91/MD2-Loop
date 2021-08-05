import java.util.Scanner;

public class CheckGreatestCommonDivisor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a");
        a = scanner.nextInt();
        System.out.println("nhập số b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("không có ước số chung");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("ước số chung lớn nhất là " + a);
    }
}
