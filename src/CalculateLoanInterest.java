import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        double money = 1.0;
        int thangGui = 1;
        double laiSuat = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        money = scanner.nextDouble();
        System.out.println("nhập số tháng gửi");
        thangGui = scanner.nextInt();
        System.out.println("nhập số lãi suất");
        laiSuat = scanner.nextDouble();

        double total = 0;
        for (int i = 0; i < thangGui; i++) {
            total += money * (laiSuat / 100) / 12 * thangGui;
        }
        System.out.println("tổng tiền gốc và lãi là " + total);
    }
}
