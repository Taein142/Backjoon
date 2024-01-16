package seed.step04_repeat;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int pact = 1;
        if (0 <= N && N <= 12) {
            for (int i = 1; i <= N; i++) {
                pact *= i;
            }
            System.out.println(pact);
        }
    }
}
