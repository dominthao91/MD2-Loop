import java.util.Scanner;

public class DisplayPrimes100 {
    public static void main(String[] args) {
        System.out.println("Các SNT < 100 là");
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        int check = (int) Math.sqrt(n);
        for (int i = 2; i < check; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
