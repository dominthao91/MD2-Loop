import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Numbers");
        int numbers = scanner.nextInt();
        if (numbers < 2) {
            System.out.println(numbers + " không phải số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(numbers)) {
                if (numbers % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(numbers + " là số nguyên tố");
            } else {
                System.out.println(numbers + " không phải số nguyên tố");
            }
        }
    }


}
