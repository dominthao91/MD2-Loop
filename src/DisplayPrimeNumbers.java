import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng SNT muốn in ra");
        int count = 0;
        int numbers = 2;
        int input = scanner.nextInt();
        while (count < input) {
            if (checPrimes(numbers)) {
                System.out.println(numbers + ",");
                numbers++;
            } else {
                numbers++;
                continue;
            }
            count++;

        }

    }

    public static boolean checPrimes(int numbers) {
        boolean check = true;
        if (numbers < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numbers); i++) {
                if (numbers % i == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
        }
        return check;

    }
}