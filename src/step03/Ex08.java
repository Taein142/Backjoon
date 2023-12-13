package step03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int A, B;
        for (int i = 1; i <= T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            int C = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C);
        }
    }
}
