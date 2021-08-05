import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn hình muôn vẽ");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông");
        System.out.println("3. Hình tam giác cân");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");

        while (true) {
            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Hình chữ nhật");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Tam giác vuông góc dưới trái");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("Tam giác vuông góc trên trái");
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("Tam giác vuông góc dưới phải");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6; j++) {
                            if (j <= 6 - i) {
                                System.out.print(" " + " ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("Tam giác vuông góc trên phải");
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 1; j <= 6; j++) {
                            if (j <= 6 - i) {
                                System.out.print(" " + " ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Hình tam giác cân");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Vui long nhập số có trong danh sách trên");
                    break;
                }
            }
        }
    }
}