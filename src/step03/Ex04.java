package step03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int a;
        int b;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum = sum + (a * b);
        }
        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
